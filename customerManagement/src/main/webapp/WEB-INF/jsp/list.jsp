<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客管理システム</title>
</head>
<body>
<h1>顧客管理システム</h1>
<main>
<table>
		<tr>
		<th>ID</th>
		<th>名前</th>
		<th>年齢</th>
		<th>誕生日</th>
		<th>住所</th>
		<th>電話番号</th>
		<th>性別</th>
		<th>登録日時</th>
		</tr>
		<c:forEach var="member" items="${memberList}">
		<tr>
		<td><c:out value="${member.id}"/></td>
            <td><c:out value="${member.name}" /></td>
            <td><c:out value="${member.age}" /></td>
            <td><c:out value="${member.birthday}" /></td>
            <td><c:out value="${member.address}" /></td>
            <td><c:out value="${member.telephone}" /></td>
            <td><c:out value="${member.gender}" /></td>
            <td><fmt:formatDate value="${member.createdAt}" pattern="yyyy/MM/dd" /></td>
		</tr>
		</c:forEach>
</table>
<p><a href="createInput"><button type="button">新規作成</button></a></p>
</main>

</body>
</html>