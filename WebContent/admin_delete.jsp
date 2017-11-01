<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 商品削除画面 -->
<title><s:text name="lang.admin_delete.title" /></title>
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="./slick/slick.css">
    <link rel="stylesheet" type="text/css" href="./slick/slick-theme.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" type="text/css"  href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/admin-page-top.css">
    <link rel="stylesheet" type="text/css" href="css/button.css">

    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.slick.min.js"></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/jquery.ba-hashchange.min.js"></script>
    <script type="text/javascript" src="js/autoConfirm.js"></script>

</head>
<body>
<header><s:include value="admin_header.jsp" /></header>

 <h1>
 <!-- 商品削除 -->
 <s:text name="lang.admin_delete.delete" /></h1>
 <hr>


 <s:iterator value="itemList">

    <div class="container">
     <div class="row">
      <div class="col-lg-offset-3">

      <div style="border:solid; border-radius:5px; margin:5px; padding:5px;">
      <div class="form-group"><!-- 商品ID： --><s:text name="lang.admin_delete.itemid" /><s:property value="itemId"/>
      </div>

      <div class="form-group"><!-- 商品名： --><s:text name="lang.admin_delete.itemname" /><s:property value="itemList[0].itemsName"/>
      </div>

      <div class="form-group"><!-- 価格（円）： --><s:text name="lang.admin_delete.price" /><fmt:formatNumber value="${price}" pattern="###,###,###"/>
      </div>

      <div class="form-group"><!-- 在庫 --><s:text name="lang.admin_delete.stock" /><s:property value="itemList[0].stocks"/>
      </div>

      <div class="form-group"><!-- 売り上げ数： --><s:text name="lang.admin_delete.sales" /><s:property value="itemList[0].sales"/>
      </div>

      <div class="form-group"><!-- 商品詳細： --><s:text name="lang.admin_delete.itemdetail" /><s:property value="itemList[0].itemDetail"/>
      </div>

      <div class="form-group"><!-- カテゴリー： --><s:text name="lang.admin_delete.categoli" /><s:property value="itemList[0].sortId"/>,<s:property value="itemList[0].itemGenre"/>
      </div>

      <div class="form-group"><!-- 商品画像： --><s:text name="lang.admin_delete.image" /><s:property value="itemList[0].imgPath"/>  <img  src="<s:property value="itemList[0].imgPath"/>" height="50" width="50">
      </div>
      </div>
      <h4><!-- この商品のデリートキーをオンにして宜しいですか？ --><s:text name="lang.admin_delete.keyon" /></h4>
      <s:form action="AdminDeleteAction">
      <s:hidden name="itemId"></s:hidden>
      <s:hidden name="delete" value="1"/>
      <s:submit value="Yes" name="submit"/>
      </s:form><br>
      <s:form action="AdminDeleteAction">
      <s:hidden name="delete" value="0"/>
      <s:submit value="No  " name="submit"/>
      </s:form>
      </div>
     </div>
    </div>
</s:iterator>

</body>
<footer>
	<c:import url="http://localhost:8080/openconnect/footer.jsp" />
	</footer>

</html>