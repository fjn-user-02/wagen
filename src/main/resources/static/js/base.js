// JavaScript Document
$(function() {
	var autoPlay = 4000;
	var flgLoop = true;
	var size = parseInt($('#bannerSize').val());
	if(size <= 3) {
		autoPlay = 0;
		flgLoop = false;
		$('.banner_next').hide();
		$('.banner_prev').hide();
	}
	var swiper = new Swiper ('.banner_wrap', {
		speed: 500,
		autoplay: autoPlay,
		loop: flgLoop,
		spaceBetween: 9,
		responsive: true,
		nextButton: '.banner_next',
		prevButton: '.banner_prev',
		//centeredSlides: true,
		calculateHeight: true,
		autoResize: true,
		resizeReInit: true,
		//scrollContainer: true,
		slidesPerView: 3,
		breakpoints: {
			640: {
				slidesPerView: 2,
			},
			480: {
				slidesPerView: 1,
			}
		}
	});
});