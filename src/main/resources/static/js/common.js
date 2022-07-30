
$(window).on('load',function(){

	// 解答の表示
/*
	$('.question').on('click', function() {
		var parent = $(this).parent().find('.explanation');
		parent.slideToggle();
	});
*/

	$('.check').on('click', function() {
		
		var explanation = $(this).parent().parent().find('.explanation');

		// 正解の値
		var correcAnswer = explanation.find('.answer').text();
		
		console.log(correcAnswer);
		
		// 回答
		var answer = $(this).text()
		
		if (correcAnswer.indexOf(answer) >= 0) {
			var correct = $(this).parent().parent().find('.correct');
			if (correct.hasClass('notShow')) {
				correct.removeClass('notShow');
			} else {
				correct.addClass('notShow');
			}
		} else {
			var error = $(this).parent().parent().find('.error');
			if (error.hasClass('notShow')) {
				error.removeClass('notShow');
			} else {
				error.addClass('notShow');
			}
		}
		
		// 解答を表示
		explanation.slideToggle();
	});

});
