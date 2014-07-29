<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>input</title>
</head>
<body>
<center>
	<h2>등록하기</h2>
	<form name="userForm" method="post" action="save.do" >
	<table border="1">	
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="id" />
			</td>		
		</tr>	
		<tr>
			<td>암&nbsp;&nbsp;호</td>
			<td>
				<input type="password" name="password"/>
			</td>		
		</tr>		
		<tr>
			<td>이&nbsp;&nbsp;름</td>
			<td>
				<input type="text" name="name"/>			
			</td>		
		</tr>
		<tr>
			<td>역&nbsp;&nbsp;할</td>
			<td>
				<input type="text" name="role" />
			</td>		
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit"  value="저장" />&nbsp;&nbsp;&nbsp;				
				<input type="reset" value="취소"/>
			</td>					
		</tr>
	
	</table>
	</form>
</center>
</body>
</html>