$(function(){
	if(sessionStorage.getItem('curCity') == '' || sessionStorage.getItem('curCity') == null){
		$.ajax({
			url: "https://geolocation-db.com/jsonp/",
			jsonpCallback: "callback",
			dataType: "jsonp",
			success: function( location ) {
				sessionStorage.setItem('curCity', location.state);
			}
		});
	}
});
console.log(sessionStorage.getItem('curCity'));

function withCurCity(){
	$.ajax({
		url : "/hospital/curCityAjax.do",
		data : {curCity : sessionStorage.getItem('curCity')},
		type : 'post',
		dataType : 'json',
		success : function(param){
			location.href = '/hospital/main.do?keyfield=' + param.result;
		},
		error : function(){
			
		}
	});
}