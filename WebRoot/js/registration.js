$(function(){
	$("form").click(function(){
		var type= $("[name='type']").val();
		if(type=="Student"){
			$("#nonstudent").hide();
			$("#student").show();
		};
		if(type=="Non Student"){
			$("#nonstudent").show();
			$("#student").hide();
		};
	});
});