<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
</style>
<script>
function regist(){
	var form=document.querySelector("form")
	form.action="/emp/regist";
	form.method="post";
	form.submit();
}
</script>
</head>

<body>
	[입사등록양식]
	
	<form>
		<input type="text" name="deptno" value="50">
		<input type="text" name="dname" value="marketing">
		<input type="text" name="loc" value="korea">

		<input type="text" name="empno" value="7777">
		<input type="text" name="ename" placeholder="라면맨">
		<input type="text" name="sal" value="3000">
		
		<button type="button" onClick="regist()">사원등록</button>
	</form>
</body>
</html>