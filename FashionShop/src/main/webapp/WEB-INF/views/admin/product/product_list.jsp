<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="../inc/header.jsp" %>
<script>
	$(function(){
		$("button").click(function(){
			location.href="/admin/product/regist_form"; //글쓰기 폼 요청 
		});
		
	});
</script>
</head>
<body>
<!--메인 네비게이션 영역 : jsp는 이제 보안된 폴더에 있다. 
웹사이트 루트를 기준으로한 경로는 막혀있다. 따라서 상대경로로 접근하자 -->
<%@ include file="../inc/main_navi.jsp" %>  <!-- '/' 는웹상에서...  -->
<h3>상품목록</h3>
<p>
	<table>
	  <tr>
	    <th>First Name</th>
	    <th>Last Name</th>
	    <th>Points</th>
	    <th>Points</th>
	    <th>Points</th>
	  </tr>
	  <tr>
	    <td>Jill</td>
	    <td>Smith</td>
	    <td>50</td>
	    <td>50</td>
	    <td>50</td>
	  </tr>
	  <tr>
	  	<td colspan="5">
	  		<button>상품등록</button>
	  	</td>
	  </tr>
	</table>
</p>

</body>
</html>
