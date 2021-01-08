<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>basicGet() Get</h3>
<form action="/sample/basic">
<input type="submit" value="전송">
</form>
<hr>
<h3>basicGet() post</h3>
<form action="/sample/basic" method="post">
<input type="text"> <br/>
<input type="submit" value="전송">
</form>
<hr>
<h3>basicOnlyGet</h3>
<form action="/sample/basicOnlyGet">
<input type="submit" value="전송">
</form>
<hr>
<h3>ParameterController Mehtod6</h3>
<form action="/paramx/ex6">
<input type="checkbox" value="1" name="check"> 1
<input type="checkbox" value="2" name="check"> 2
<input type="checkbox" value="3" name="check"> 3
<input type="checkbox" value="4" name="check"> 4
<input type="checkbox" value="5" name="check"> 5
<input type="checkbox" value="6" name="check"> 6
<input type="submit" value="전송">
</form>
<hr>
<h3>ParameterController Mehtod7</h3>
<form action="/paramx/ex7">
<input type="checkbox" value="1" name="check"> 1
<input type="checkbox" value="2" name="check"> 2
<input type="checkbox" value="3" name="check"> 3
<input type="checkbox" value="4" name="check"> 4
<input type="checkbox" value="5" name="check"> 5
<input type="checkbox" value="6" name="check"> 6
<input type="submit" value="전송">
</form>
</body>
</html>