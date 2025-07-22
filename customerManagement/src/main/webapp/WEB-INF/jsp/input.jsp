<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客管理システム</title>
</head>
<style>


</style>
<body>
<h1>顧客管理システム</h1>
<main>
	<h2>顧客作成</h2>
	<div class="wrap">
	<form action="createConfirm" method="post" class="form">
    名前<br><input type="text" name="name"><br>

    誕生日<br><input type="text" name="birthday" placeholder="2000/01/01"><br>

    性別
    <label><input type="radio" name="gender" value="男">男</label>
    <label><input type="radio" name="gender" value="女">女</label><br>

    電話番号<br><input type="text" name="telephone"><br>

    住所<br><input type="text" name="address"><br>

    <input type="submit" value="確認">
</form>
	</div>
	
</main>
</body>
</html>

