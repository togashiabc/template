<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- 顧客情報 -->
<title>顧客情報</title>
<!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/admin-page-top.css">


    <!-- Javascripts
    ================================================== -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
 <header><s:include value="admin_header.jsp" /></header>
<body>
<div class="container">
	<!-- UserId -->

	<h1>
顧客情報
	</h1>
	 <hr>


	<s:form action="AdminUserAction">
		<s:textfield name="userId" size="50" placeholder="userId" type="number" min="0" max="1000000000"/>
		<s:submit value="Search"></s:submit>
	</s:form>
	<br>
	<table class="table table-bordered" >
		<tr bgcolor="#cccccc">
			<!-- ユーザーID -->
			<th>ユーザーID</th>
			<!-- パスワード -->
			<th>パスワード</th>
			<!-- 名前 -->
			<th>名前</th>

		</tr>
		<tr>
			<s:iterator value="itemList">
				<td><s:property value="userId" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="familyName" /></td>

			</s:iterator>
		</tr>

	</table>
</div>
	<script type="text/javascript" src="js/admin-page-top.js"></script>
</body>

</html>