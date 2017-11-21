// JavaScript Document
$(function(){
	/* link */
	$(document).on('click', 'a', function(e){
		e.preventDefault();
		var pg = $(this).attr('href');
		window.location.href = pg;
	});
	/* account modal window */
	$(document).on('click', 'header .navi .logout', function(){
		$('.modal_account').addClass('on');
	});
	/* clear cart after logout */
	$(document).on('click', '.modal_account .modal_body .modal_main .logout', function(){
		clearCart();
	});
	/* model modal window */
	$(document).on('click', '.model_list .has_modal', function(){
		var data = localStorage.getItem('data');
		data = JSON.parse(data);
		if (data && data.length > 0) {
			var conf = confirm('選択されている商品がクリアされます。宜しいですか？');
			if (conf) {
				clearCart();
				var badge = $('header .navi .cart .badge');
				badge.text('');
				var cont = $(this).find('.modal_content').html();
				$('.modal_model .modal_main').html(cont).parents('.modal').addClass('on');
			}
		} else {
			var cont = $(this).find('.modal_content').html();
			$('.modal_model .modal_main').html(cont).parents('.modal').addClass('on');
		}
	});
	/* item modal window */
	$(document).on('click', '.item_list .has_modal', function(){
		var cont = $(this).filter('.modal_content').html();
		var id = $(this).attr('id');
		var obj_id = $(this).attr('obj_id');
		var model_id = $(this).attr('model_id');
		var paint_flg = $(this).attr('paint_flg');
		$('.modal_item .modal_main').html(cont).parents('.modal').addClass('on').attr('data-id',id).attr('obj_id',obj_id).attr('model_id',model_id).attr('paint_flg',paint_flg);
		if($(this).hasClass('selected')){
			$('.modal_item').addClass('selected');
		}
	});
	/* summary modal window */
	$(document).on('click', 'header .navi .quotation', function(){
		$('.modal_summary').addClass('on');
	});
	/* movie modal window */
	$(document).on('click', 'footer .banner .banner_list .movie', function(){
		$('.modal_movie').addClass('on');
	});
	$(document).on('mousedown', '.movie_list li .movie:not(.on) .touch', function(){
		$(this).parent('.movie').addClass('on').parents('.modal_movie').addClass('full');
		$('.movie.on iframe')[0].contentWindow.postMessage('{"event":"command","func":"playVideo","args":""}', '*');
	});
	$(document).on('mousedown', '.movie_list li .movie.on .touch', function(){
		$('.movie.on iframe')[0].contentWindow.postMessage('{"event":"command","func":"stopVideo","args":""}', '*');
		$(this).parent('.movie').removeClass('on').parents('.modal_movie').removeClass('full');
	});
	/* pdf modal window */
	$(document).on('click', '.catalog_list li', function(){
		var href = $(this).attr('data-pdf');
		var pdf = $('<iframe>', { src:href });
		$('.modal_pdf .modal_main').html('').append(pdf).parents('.modal').addClass('on');
	});
	/* catalog modal window */
	$(document).on('click', 'footer .banner .banner_list .catalog', function(){
		$('.modal_catalog').addClass('on');
	});
	/* modal close */
	$(document).on('click', '.modal_close, .modal_shade', function(){
		$(this).parents('.modal').attr('data-id','').removeClass('on selected');
	});
	function modalClose(){
		$('.modal').attr('data-id','').removeClass('on selected');
	}
	/* discount toggle */
	$(document).on('click', '.cart_list .discount .toggle', function(){
		var dsc = $(this).parents('.discount');
		if(dsc.hasClass('hide')){
			dsc.removeClass('hide');
		}else{
			dsc.addClass('hide');
			dsc.find('.price').val('');
			total();
		}
	});
	/* Set data print */
	if ($('.wrapper').hasClass('print') || $('.wrapper').hasClass('database')) {
		setCart(arrayCart);
		setCharge(arrayCharge);
	}
	/* Set cart print */
	function setCart(arrayCart) {
		var data = [];
		for (var i = 0; i < arrayCart.length; i++) {
			data.push(JSON.parse(arrayCart[i]));
		}
		if ($('.wrapper').hasClass('print')) {
			localStorage.setItem('dataPrint', JSON.stringify(data));
		} else {
			localStorage.setItem('data', JSON.stringify(data));
		}
		
	}
	/* Set charge print */
	function setCharge(arrayCharge) {
		var charge = [];
		charge.push(JSON.parse(arrayCharge[0]));
		localStorage.setItem('chargePrint', JSON.stringify(charge));
		if ($('.wrapper').hasClass('print')) {
			localStorage.setItem('chargePrint', JSON.stringify(charge));
		} else {
			localStorage.setItem('charge', JSON.stringify(charge));
		}
	}
	/* discount input */
	$(document).on('blur', 'input.price', function(){
		total();
	});
	/* update badge */
	function updateBadge(){
		var data = localStorage.getItem('data');
		data = JSON.parse(data);
		if(data){
			var n = data.length;
			var badge = $('header .navi .cart .badge');
			if(n > 0){
				badge.text(n);
			}else{
				badge.text('');
			}
		}
	}
	updateBadge();
	/* clear cart */
	$(document).on('click', 'header .navi .clear', function(){
		var conf = confirm('お見積りを削除してよろしいですか？');
		if(conf){
			clearCart();
			var url = $('header .navi .clear a').attr('data-url');
			window.location.href = url;
		}
	});
	function clearCart(){
		localStorage.clear(data);
		var data = [];
		localStorage.setItem('data', JSON.stringify(data));
		localStorage.clear(charge);
		var charge = [{ paint:'', discount:'', memo:'' }];
		localStorage.setItem('charge', JSON.stringify(charge));
		$('.cart_list > ul').html('');
		$('input.price').val('');
		total();
	}
	/* delete item */
	$(document).on('click','.cart_list .info .delete', function(){
		var id = $(this).parents('li').attr('id');
		deleteItem(id);
		$(this).parents('li').remove();
		total();
	});
	$(document).on('click', '.modal.selected .modal_button button.select', function(){
		var id = $(this).parents('.modal').attr('data-id');
		deleteItem(id);
		modalClose();
		itemCheck();
		updateBadge();
		$(this).parents('.modal').removeClass('selected');
	});
	function deleteItem(id){
		var data = localStorage.getItem('data');
		data = JSON.parse(data);
		var filtered = $.grep(data,
			function(elem, index) {
				return (elem.id != id);
			}
		);
		data = filtered;
		localStorage.setItem('data', JSON.stringify(data));
	}
	/* mail message */
	$(document).on('click', '.cart_list .button_area button.mail', function(){
		if($('.cart_list > ul > li').length == 0) {
			return false;
		}
		var token = $("input[name='_csrf']").val();
		var url = $('.cart_list .button_area button.mail').attr('data-url');
		var strDataQuotation = getJsonQuotation(1);
		$.ajax({
			type: 'POST',
			url: url,
			data : strDataQuotation,
			dataType : "JSON",
			contentType: 'application/json',
			beforeSend: function(xhr) {
				xhr.setRequestHeader('X-CSRF-TOKEN', token);
			},
			success: function(resultData){
				alert(resultData.message);
			},
			error: function(){
				alert('Load was performed. Look at the console (F12 or Ctrl+Shift+I, Console tab) for more information! ');
			},
		});
	});
	/* save message */
	$(document).on('click', '.cart_list .button_area button.save', function(){
		if($('.cart_list > ul > li').length == 0) {
			return false;
		}
		var token = $("input[name='_csrf']").val();
		var url = $('.cart_list .button_area button.save').attr('data-url');
		var strDataQuotation = getJsonQuotation(0);
		$.ajax({
			type: 'POST',
			url: url,
			data : strDataQuotation,
			dataType : "JSON",
			contentType: 'application/json',
			beforeSend: function(xhr) {
				xhr.setRequestHeader('X-CSRF-TOKEN', token);
			},
			success: function(resultData){
				alert(resultData.message);
			},
			error: function(){
				alert('Load was performed. Look at the console (F12 or Ctrl+Shift+I, Console tab) for more information! ');
			},
		});
	});
	
	/* add item */
	$(document).on('click', '.modal:not(.selected) .modal_button button.select', function(event){
		addItem(event.target);
		modalClose();
		updateBadge();
	});
	function addItem(element){
		var itm = $(element).parent().parent().parent();
		var cmp = itm.find('.campaign');
		if(cmp.length != 0){
			var cmp_txt = cmp.text();
			var cmp_cls = cmp.attr('class');
			var cmp_flg = 1;
			var sale_tag = cmp.attr('sale_tag');
		}else{
			var cmp_txt = '';
			var cmp_cls = '';
			var cmp_flg = 0;
			var sale_tag = '';
		}
		var data = localStorage.getItem('data');
		data = JSON.parse(data);
		if(!data){ var data = []; }
		data.push({
			id:itm.attr('data-id'),
			model_id: itm.attr('model_id'),
			obj_id:itm.attr('obj_id'),
			img_src:itm.find('.pic').children('img').attr('src'),
			item_name:itm.find('.item_name').text(),
			code:itm.find('.code').text(),
			campaign_name:cmp_txt,
			campaign_class:cmp_cls,
			unit_price:itm.find('.price').children('.net').text().replace(/,/g, ''),
			quantity:'1',
			wage:itm.find('.wage .hour').text(),
			paint_fee:'',
			discount:'',
			cmp_flg: cmp_flg,
			sale_tag: sale_tag,
			paint_flg: itm.attr('paint_flg')
		});
		localStorage.setItem('data', JSON.stringify(data));
		itemCheck();
	}
	/* item check */
	if($('.item_list').length > 0){
		itemCheck();
	}
	function itemCheck(){
		$('.item_list > ul > li.selected').removeClass('selected');
		var data = localStorage.getItem('data');
		data = JSON.parse(data);
		if(!data){ var data = []; }
		for (var i = 0; i < data.length; i++) {
			var id = data[i]['id'];
			$('.item_list > ul > li#' + id).addClass('selected');
		}
	}
	/* cart update */
	$(document).on('change', '.cart_list select.number', function(){
		updateCart();
	});
	$(document).on('blur', '.cart_list input.price', function(){
		updateCart();
	});
	function updateCart(){
		var data = [];
		$('.cart_list > ul > li').each(function(){
			var itm = $(this);
			var cmp = itm.find('.campaign');
			if(cmp.length != 0){
				var cmp_txt = cmp.text();
				var cmp_cls = cmp.attr('class');
				var sale_tag = cmp.attr('sale_tag');
				var cmp_flg = 1;
			}else{
				var cmp_txt = '';
				var cmp_cls = '';
				var sale_tag = '';
				var cmp_flg = 0;
			}
			data.push({
				id:itm.attr('id'),
				model_id: itm.attr('model_id'),
				obj_id:itm.attr('obj_id'),
				img_src:itm.find('.pic').children('img').attr('src'),
				item_name:itm.find('.item').text(),
				code:itm.find('.code').text(),
				campaign_name:cmp_txt,
				campaign_class:cmp_cls,
				quantity:itm.find('.number').val(),
				unit_price:itm.find('.price').attr('data-unitprice'),
				wage:itm.find('.wage .hour').text(),
				paint_fee:itm.find('.paint_fee').val(),
				discount:itm.find('.discount_price').val(),
				cmp_flg: cmp_flg,
				sale_tag: sale_tag,
				paint_flg: itm.attr('paint_flg')
			});
		});
		localStorage.setItem('data', JSON.stringify(data));
		total();
	}
	/* update charge */
	$(document).on('blur', '.charge input', function(){
		updateCharge();
	});
	function updateCharge(){
		var charge = [];
		var chg = $('.charge');
		charge.push({
			paint:chg.find('.paint').children('.price').val(),
			discount:chg.find('.discount').children('.price').val(),
			memo:chg.find('.memo').children('.text').val()
		});
		localStorage.setItem('charge', JSON.stringify(charge));
		total();
	}
	/* cart output */
	if($('.cart_list').length > 0){
		if($('.wrapper').hasClass('print')){
			cartOut(1);
		}else{
			cartOut(0);
		}
	}
	function cartOut(p){
		var data = $('.wrapper').hasClass('print') ? localStorage.getItem('dataPrint') : localStorage.getItem('data');
		data = JSON.parse(data);
		for (var i = 0; i < data.length; i++) {
			var li = $('<li>', { id: data[i]['id'], model_id: data[i]['model_id'], obj_id: data[i]['obj_id'], paint_flg:  data[i]['paint_flg'] });
			// pic
			var pic = $('<div>', { class: 'pic' });
			var img_src = '';
			if(data[i]['img_src']!=''){
				img_src = data[i]['img_src'];
			}
			if (typeof img_src != "undefined") {
				pic.append($('<img>', { src:img_src, alt:data[i]['item_name'] }));
			} else {
				pic.append($('<div>', { class: 'no-image'}));
			}
			if(data[i]['campaign_name']){ pic.append($('<div>', { class:data[i]['campaign_class'], text:data[i]['campaign_name'], sale_tag:data[i]['sale_tag'] })) };
			li.append(pic);
			// info
			var info = $('<div>', { class:'info' });
			var name = $('<div>', { class:'name' });
			var item_name = $('<div>', { class:'item_name' });
			if(data[i]['campaign_name']){ item_name.append($('<span>', { class:'campaign_name', text:data[i]['campaign_name'] })) };
			item_name.append($('<span>', { class:'item', text:data[i]['item_name'] }));
			name.append(item_name).append($('<div>', { class:'code', text:data[i]['code'] }));
			if(p == 1){
				info.append(name);
			}else{
				info.append(name).append($('<button>', { type:'button', class:'delete', text:'削除' }));
			}
			li.append(info);
			// cost
			var cost = $('<div>', { class:'cost' });
			var product = $('<div>', { class:'product' });
			product.append($('<span>', { class:'label', text:'数量' }));
			var quantity = $('<span>', { class:'quantity' });
			if(p == 1){
				var number = $('<span>', { class:'number', text:data[i]['quantity'] });
			}else{
				var number = $('<select>', { name:'', class:'number' });
				for(j=1;j<=10;j++){
					if(j == data[i]['quantity']){
						number.append($('<option>', { text:j, selected:'selected' }));
					}else{
						number.append($('<option>', { text:j }));
					}
				}
			}
			quantity.append(number);
			product.append(quantity);
			// Get tax
			var taxVal = parseFloat($('#hidTaxValue').val());
			// Calculate price
			var priceVal = parseInt(data[i]['unit_price'])*parseInt(data[i]['quantity']);
			var priceTaxVal = parseInt(priceVal*taxVal);
			var priceText = priceVal + " (¥" + priceTaxVal + ")";
			var price = $('<span>', { class:'price', text: priceText}).attr('data-unitprice', parseInt(data[i]['unit_price']))
			product.append(price);
			cost.append(product);
			// Calculate wage
			var wage = $('<div>', { class:'wage' });
			var wageDisplay = data[i]['wage'] != '' ? parseFloat(data[i]['wage']).toFixed(1) : '';
			wage.append($('<span>', { class:'label', text:'参考取付時間(H):'}));
			wage.append($('<span>', { class:'hour', text:wageDisplay}));
			var wagePrice = data[i]['wage'] != '' ? data[i]['wage'] : 0;
			var priceWageVal = parseFloat(wagePrice)*10000;
			var priceWageTaxVal = parseInt(priceWageVal*taxVal);
			var priceWageText = priceWageVal + " (¥" + priceWageTaxVal + ")";
			wage.append($('<span>', { class:'price', text:priceWageText}));
			cost.append(wage);
			
			var paint_flg = data[i]['paint_flg'];
			if (paint_flg != "true") {
				var paint = $('<div>', { class:'paint', style: 'display: none' });
			} else {
				var paint = $('<div>', { class:'paint' });
			}
			paint.append($('<span>', { class:'label', text:'塗装費:'}));
			if(p == 1){
				paint.append($('<span>', { class:'price paint_fee', text:data[i]['paint_fee']}));
			}else{
				paint.append($('<input>', { type:'text', class:'price paint_fee', value:data[i]['paint_fee'], placeholder:'金額を入力'}));
			}
			cost.append(paint);
			if(data[i]['discount'] > 0){
				var discount = $('<div>', { class:'discount' });
			}else{
				var discount = $('<div>', { class:'discount hide' });
			}
			var discount_label = $('<span>', { class:'label', text:'値引き:'});
			if(p != 1){
				discount_label.prepend($('<span>', { class:'toggle'}));
			}
			discount.append(discount_label);
			if(p == 1){
				discount.append($('<span>', { class:'price discount_price', text:data[i]['discount']}));
			}else{
				discount.append($('<input>', { type:'text', class:'price discount_price', value:data[i]['discount'], placeholder:'金額を入力'}));
			}
			cost.append(discount);
			li.append(cost);
			$('.cart_list > ul').append(li);
			total();
		}
	}
	/* charge output */
	if($('.charge').length > 0){
		if($('.wrapper').hasClass('print')){
			chargeOut(1);
		}else{
			chargeOut(0);
		}
	}
	function chargeOut(p){
		var charge = $('.wrapper').hasClass('print') ? localStorage.getItem('chargePrint') : localStorage.getItem('charge');
		charge = JSON.parse(charge);
		if(!charge) {
			charge = [];
			charge[0] = new Object();
			charge[0].paint = '';
			charge[0].discount = '';
			charge[0].memo = '';
			setCharge(charge);
		}
		var chg = $('.charge');
		if(p == 1){
			chg.children('.paint').children('.price').text(charge[0]['paint']);
			chg.children('.discount').children('.price').text(charge[0]['discount']);
			chg.children('.memo').children('.text').text(charge[0]['memo']);
		} else{
			chg.children('.paint').children('.price').val(charge[0]['paint']);
			chg.children('.discount').children('.price').val(charge[0]['discount']);
			chg.children('.memo').children('.text').val(charge[0]['memo']);
		}
		total();
	}
	/* digit */
	function priceDigit(){
		$('span.price').each(function(){
			var num = $(this).text();
			num = num.replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1,');
			$(this).text(num);
		});
	}
	/* total */
	function total(){
		var subtotal = 0;
		// Get tax
		var taxVal = parseFloat($('#hidTaxValue').val());
		$('.cart_list > ul > li').each(function(){
			var price = $(this).find('.product').children('.price');
			if($('.wrapper').hasClass('print')){
				var n = $(this).find('span.number').text();
			}else{
				var n = $(this).find('select.number').val();
			}
			// Calculate price
			var priceVal = parseInt(price.data('unitprice'))*n;
			var priceTaxVal = parseInt(priceVal*taxVal);
			var priceText = priceVal + " (¥" + priceTaxVal + ")";
			price.text(priceText);
		});
		$('.cart_list span.price, .charge span.price').each(function(){
			if(parseInt($(this).text()) > 0){
				if($(this).hasClass('discount_price')){
					subtotal -= parseInt($(this).text().replace(/,/g, ''));
				}else{
					subtotal += parseInt($(this).text().replace(/,/g, ''));
				}
			}
		});
		$('.cart_list input.price, .charge input.price').each(function(){
			if($(this).val()!=''){
				if($(this).hasClass('discount_price')){
					subtotal -= parseInt($(this).val());
				}else{
					subtotal += parseInt($(this).val());
				}
			}
		});
		$('.subtotal .net .price').text(parseInt(subtotal));
		$('.subtotal .tax .price').text(parseInt(subtotal * taxVal));
		$('.total .all .price').text(parseInt(subtotal* (1 + taxVal)));
		priceDigit();
		updateBadge();
	}
	/*
	 * Get json data quotation
	 */
	function getJsonQuotation(isSendMail) {
		var estimateNumber = $('#hidEstimateNumber').val();
		var urlPrint = $('#hidUrlPrint').val();
		var taxId = $('#hidTaxId').val();
		var tax = $('#hidTaxValue').val();
		
		// New object json estimation
		var objItemList = JSON.parse(localStorage.getItem('data'));
		var objCharge = JSON.parse(localStorage.getItem('charge'));
		var objQuotation = new Object();
		objQuotation.estimationTrans = [];
		objQuotation.estimationHistoryTrans = [];
		objQuotation.quotationNumber = estimateNumber;
		objQuotation.urlPrint = urlPrint;
		objQuotation.isSendMail = isSendMail;
		// Loop item list and create quotation
		var iLen = objItemList.length;
		for (i = 0; i < iLen; i++) {
			// Calculate
			var aryPartsNo = objItemList[i].id.split("_");
			// New object temp
			var temp = new Object();
			temp.estimatedNumber = estimateNumber;
			temp.imgPath = objItemList[i].img_src;
			temp.installTime = objItemList[i].wage;
			temp.itemCode = objItemList[i].id;
			temp.itemDiscount = objItemList[i].discount;
			temp.itemName = objItemList[i].item_name;
			temp.itemPaintPrice = objItemList[i].paint_fee;
			temp.paintPrice = objCharge[0].paint;
			temp.partsNo1 = aryPartsNo[0] !== void 0? aryPartsNo[0]: "";
			temp.partsNo2 = aryPartsNo[1] !== void 0? aryPartsNo[1]: "";
			temp.partsNo3 = aryPartsNo[2] !== void 0? aryPartsNo[2]: "";
			temp.partsNo4 = aryPartsNo[3] !== void 0? aryPartsNo[3]: "";
			temp.price = objItemList[i].unit_price;
			temp.priceInTax = parseInt(objItemList[i].unit_price) * (1 + parseFloat(tax));
			temp.quantity = objItemList[i].quantity;
			temp.totalDiscount = objCharge[0].discount;
			if (objItemList[i].cmp_flg == 1) {
				// Set campaign
				temp.campaignMst = new Object();
				temp.campaignMst.id = objItemList[i].obj_id;
			} else {
				// Set item
				temp.itemMst = new Object();
				temp.itemMst.id = objItemList[i].obj_id;
			}
			temp.saleTitle = objItemList[i].campaign_name;
			temp.saleTag = objItemList[i].sale_tag;
			temp.memo = objCharge[0].memo;
			// Set tax
			temp.taxMst = new Object();
			temp.taxMst.id = taxId;
			// Set model
			temp.modelMst = new Object();
			temp.modelMst.id = objItemList[i].model_id;
			// Set temp to quotation list
			objQuotation.estimationTrans[i] = temp;
			objQuotation.estimationHistoryTrans[i] = temp;
		}
		
		return JSON.stringify(objQuotation);
	}
});