<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function userList(){
		var formData = document.userForm;
		formData.action="list.do";
		formData.submit();
		
	}
	function userUpdate(id){
		var formData = document.userForm;
		formData.action="update.do?id="+id;
		formData.submit();
	}
	function userDelete(id){
		var formData = document.userForm;
		formData.action="delete.do?id="+id;
		formData.submit();
}

</script>


</head>
<body>
<center>
	<h2>상세 보기</h2>
	<form name="userForm" method="post" >
	<table border="1">	
		<tr>
			<td>아이디</td>
			<td>${requestScope.user.id}</td>		
		</tr>	
		<tr>
			<td>암&nbsp;&nbsp;호</td>
			<td>
				<input type="text" name="password" value="${requestScope.user.password}"/>
			</td>		
		</tr>		
		<tr>
			<td>이&nbsp;&nbsp;름</td>
			<td>
				<input type="text" name="name" value="${requestScope.user.name}"/>			
			</td>		
		</tr>
		<tr>
			<td>역&nbsp;&nbsp;할</td>
			<td>
				<input type="text" name="role" value="${requestScope.user.role}"/>
			</td>		
		</tr>
		<tr>
			<td colspan="2">
				<input type="button"  value="목록보기" onclick="userList()"/>&nbsp;&nbsp;&nbsp;				
				<input type="button"  value="수정" onclick="userUpdate('${requestScope.user.id}')"/>&nbsp;&nbsp;&nbsp;
				<input type="button"  value="삭제" onclick="userDelete('${requestScope.user.id}')"/>&nbsp;&nbsp;&nbsp;
			</td>					
		</tr>
	
	</table>
	</form>
</center>
</body>
</html>