<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<!-- name、idの入力エリアを作成しなさい -->
<%@ include file="header.jsp"%>
<div class = "contents">
  <table>
    <tr>
      <td class = "title">name</td>
      <td class = "name">
        <input type = "text">
      </td>
      <tr>
        <td class = "title">id</td>
        <td class = "id">
          <input type = "text">
        </td>
      <tr>
    </tr>
  </table>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>