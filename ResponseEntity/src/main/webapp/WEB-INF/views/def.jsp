<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>def</title>
</head>
<body>
	<div>
		<input type="text" name="defCheckValue" id="defCheckValue">
	</div>
	<div>
		<input type="button" onclick="checkDefValue();" value="확인하기">
	</div>
	
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<script>
		function checkDefValue(){
			fetch('/isDef',{
				method : 'post',
				headers: {
				    'Content-Type': 'application/json'
				},
                body : JSON.stringify({
                	"defCheckValue": $('#defCheckValue').val()
                })
			}).then(res => {
				if(data.status == 200){
					alert(data.message);
				} 
				return res.json();
			}).then(data => {
				if(data.status != 200) {
					alert(data.message);
				}
			}).catch(err => {
				console.log("err : " + err);
			});
			
		}
	</script>
</body>
</html>