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
		<input type="text" name="DefValue" id="DefValue">
	</div>
	<div>
		<input type="button" onclick="checkDefValue();" value="확인하기">
	</div>
	
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<script>
		function checkDefValue(){
			
			fetch('/isDef',{
				method : 'post',
                headers : {
                  "Content-type":"application/x-www-form-urlencoded;charset=UTF-8"
                },
                body : new URLSearchParams("DefValue="+$("#DefValue").val())
			}).then(res => {
				console.log("res : " + res);
				return res.json();
			}).then(data => {
				console.log("data : " + data);
			}).catch(err => {
				console.log("err : " + err);
			});
			
		}
	</script>
</body>
</html>