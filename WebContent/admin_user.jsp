<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- 顧客情報 -->
<title><s:text name="lang.admin_user.top" /></title>
<!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/toiawase_style.css">
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
       <s:text name="lang.admin_user.title" />
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
			<th><s:text name="lang.admin_user.userId"/></th>
			<!-- パスワード -->
			<th><s:text name="lang.admin_user.password"/></th>
			<!-- 名前 -->
			<th><s:text name="lang.admin_user.name"/></th>
			<!-- 郵便番号 -->
			<th><s:text name="lang.admin_user.postal"/></th>
			<!-- アドレス -->
			<th><s:text name="lang.admin_user.address"/></th>
		</tr>
		<tr>
			<s:iterator value="itemList">
				<td><s:property value="userId" /></td>
				<td><s:property value="password" /></td>
				<td><s:property value="familyName" /></td>
				<td><s:property value="postal" /></td>
				<td><s:property value="address" /></td>
			</s:iterator>
		</tr>
		<tr bgcolor="#cccccc">
			<!-- 電話番号 -->
			<th><s:text name="lang.admin_user.PhoneNumber"/></th>
			<!-- 携帯メールアドレス -->
			<th><s:text name="lang.admin_user.PhoneEmail"/></th>
			<!-- 性別 -->
			<th><s:text name="lang.admin_user.Sex"/></th>
			<!-- 生年月日 -->
			<th><s:text name="lang.admin_user.Birthday"/></th>
			<!-- 登録日 -->
			<th><s:text name="lang.admin_user.RegistrationDate"/></th>
		</tr>
		<tr>
			<s:iterator value="itemList">
				<td><s:property value="phoneNumber" /></td>
				<td><s:property value="phoneEmail" /></td>
				<td><s:property value="sex" /></td>
				<td><s:property value="birthday" /></td>
				<td><s:property value="registerDay" /></td>
			</s:iterator>
		</tr>
	</table>
</div>
	<script type="text/javascript" src="js/admin-page-top.js"></script>
</body>
<footer>
<c:import url="http://localhost:8080/openconnect/footer.jsp" />
	</footer>
</html>