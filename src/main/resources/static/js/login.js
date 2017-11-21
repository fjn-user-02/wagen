// JavaScript Document
$(function() {
	var flgLoginError = $('#loginError').val();
	if (flgLoginError != "undefined" && flgLoginError == 'true') {
		$('.error104').css('display', 'block');
	}
	$(document).on('click', '.login', function() {
		var username = $('#username').val().toLowerCase();
		var password = $('#password').val();
		if (!checkLogin(username, password)) {
			return false;
		}
		if (username != '') {
			$('#username').val(username);
			$('#username_md5').val(md5(username));
		}
		if (password != '') {
			$('#password_md5').val(md5(password));
		}
		$('.login_form').submit();
	});

	$(document).on('click', '.reset', function() {
		var username = $('#username').val().toLowerCase();
		if (!checkChangePassword(username)) {
			return false
		}
		$('#username').val(username);
		$('.login_form').submit();
	});

	$('#username').keypress(function (e) {
		var text = String.fromCharCode(e.which);
		if (!checkRegex(text)) {
			return false;
		}
	});

	function checkLogin(username, password) {
		if (username == '' || password == ''
				|| !checkRegex(username) || !checkRegex(password)) {
			$('.error002').css('display', 'none');
			$('.error001').css('display', 'block');
			return false;
		}
		return true;
	}

	function checkChangePassword(username) {
		var password = $('#password').val();
		var passwordConfirm = $('#passwordConfirm').val();
		if (username == '' || password == '') {
			$('.error001').css('display', 'block');
			$('.error003').css('display', 'none');
			$('.error102').css('display', 'none');
			$('.error103').css('display', 'none');
			$('.error104').css('display', 'none');
			return false;
		}
		if (!checkRegex(username)) {
			$('.error001').css('display', 'none');
			$('.error003').css('display', 'none');
			$('.error102').css('display', 'block');
			$('.error103').css('display', 'none');
			$('.error104').css('display', 'none');
			return false
		}
		if (!checkRegex(password)) {
			$('.error001').css('display', 'none');
			$('.error003').css('display', 'none');
			$('.error102').css('display', 'none');
			$('.error103').css('display', 'block');
			$('.error104').css('display', 'none');
			return false
		}
		if (password != passwordConfirm) {
			$('.error001').css('display', 'none');
			$('.error003').css('display', 'block');
			$('.error102').css('display', 'none');
			$('.error103').css('display', 'none');
			$('.error104').css('display', 'none');
			return false;
		}
		return true;
	}

	function checkRegex(text) {
		if (!text.match(/^[0-9a-zA-Z]+$/)) {
			return false;
		}
		return true;
	}
});