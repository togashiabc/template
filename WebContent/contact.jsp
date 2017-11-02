<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <title>問い合わせ</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" href="css/contact.css">


    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/jquery.slick.min.js"></script>
    <script type="text/javascript" src="js/jquery.ba-hashchange.min.js"></script>
    <script type="text/javascript" src="js/autoConfirm.js"></script>

</head>

<body>
    <header><s:include value="header.jsp" /></header>



<h1>問い合わせ</h1>

	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">


<s:form method="post" action="ContactAction" class="autoConfirm">

        <div class="form-group">氏名<font color="red">※</font><br>
            <input type="text" name="userName" class="form-control" required="required" maxlength="30" />
        </div>

        <div class="form-group">メールアドレス<font color="red">※</font><br>
            <input type="email" name="email" class="form-control" size="50" required="required" maxlength="30">
        </div>

        <div><s:text name="商品について" /><br>
          <select name="title" class="form-control">
            <option value="<s:text name='lang.contact.unspecified' />" >選択してください</option>
            <option value="<s:text name='lang.admin_contact.item' />" >商品について</option>
            <option value="<s:text name='lang.admin_contact.payment' />" >支払いについて</option>
            <option value="<s:text name='lang.admin_contact.change' />" >商品交換について</option>
            <option value="%{getText('lang.admin_contact.other')}" >その他</option>
          </select>
        </div><br>

        <div class="form-group"><s:text name="問い合わせ内容" /><font color="red">※</font><br>
            <textarea name="comment" class="form-control" rows="10" cols="60"  required="required"  maxlength="1000" ></textarea>
        </div>

        <div class="text-center">
            <input type="submit" class="btn btn-default" value="送信" >
        </div><br>
        <div>
            <input type="button"  value="<s:text name = '送信'/>"  class="autoConfirmBack"  style="display:none;"/>
        </div>

</s:form><br><br>


			</div>
		</div>
	</div>

</body>

	<!-- Javascripts
    ================================================== -->
    <script type="text/javascript" src="js/main.js"></script>
    <script type="text/javascript"></script>

</html>