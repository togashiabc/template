<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="lang.admin_add.title" /></title>
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="./slick/slick.css">
    <link rel="stylesheet" type="text/css" href="./slick/slick-theme.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" type="text/css"  href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/admin-page-top.css">

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

    <h1><s:text name="lang.admin_add.add" /></h1>
    <hr>

    <font color="red"  class="error-message"><s:property value="doubling"/></font>

    <div class="container">
     <div class="row">
      <div class="col-lg-offset-3">
      <div><s:text name="lang.admin_add.itemid" /><s:property value="newItemId"/>  <br><br>
      </div>
      <s:form method="post" action="AdminAddAction" class="autoConfirm">


      <div class="form-group"><s:text name="lang.admin_add.itemname" /><font color="red"><s:text name="lang.admin_add.must" /></font><br>
         <input type="text" maxlength="50" name="itemsName" class="form-control" required="required"
          placeholder=<s:text name ="lang.admin_add.circle" />>
      </div>

      <div class="form-group"><s:text name="lang.admin_add.price" /><font color="red"><s:text name="lang.admin_add.must" /></font><br>
         <input type="number" max="9999999" min="1" name="price" class="form-control" required="required"
          placeholder="123">
      </div>

      <div class="form-group"><s:text name="lang.admin_add.stock" /><font color="gray"><s:text name="lang.admin_add.default" /></font><br>
         <input type="number" max="9999999" min="0" name="stock" class="form-control"
          placeholder="100">
      </div>

      <div><s:text name="lang.admin_add.sales" /><br><br>
      </div>

      <div class="form-group"><s:text name="lang.admin_add.itemdetail" /><br>
         <textarea name="itemDetail" class="form-control" rows="10" cols="60" maxlength="500"
          placeholder="<s:text name="lang.admin_add.yami" />"></textarea>
      </div>

      <div class="form-group"><s:text name="lang.admin_add.categoli" /><font color="red"><s:text name="lang.admin_add.must" /></font><br>
         <select name="sort" class="form-control" required="required">
             <option></option>
             <option value="1"><s:text name="lang.admin_add.tomato" /></option>
             <option value="2"><s:text name="lang.admin_add.peman" /></option>
             <option value="3"><s:text name="lang.admin_add.papurica" /></option>
             <option value="4"><s:text name="lang.admin_add.kyuri" /></option>
             <option value="5"><s:text name="lang.admin_add.corn" /></option>
             <option value="6"><s:text name="lang.admin_add.kyabetu" /></option>
             <option value="7"><s:text name="lang.admin_add.jagaimo" /></option>
             <option value="8"><s:text name="lang.admin_add.nasu" /></option>
         </select>
      </div>

      <div class="form-group"><s:text name="lang.admin_add.image" /><br>
         <input type="file" name="imgPath" size="60" multiple="multiple"
         accept="XXXX" />
      </div>

      <div>
         <input type="submit">
      </div><br>
      <div>
         <input type="button" value="<s:text name = 'lang.admin_add.toinput'/>" class="autoConfirmBack">
      </div>

      </s:form>
      </div>
     </div>
    </div>







</body>
    <!-- Javascripts
    ================================================== -->
    <script type="text/javascript" src="js/main.js"></script>

    <script type="text/javascript"></script>
    <footer>
	<c:import url="http://localhost:8080/openconnect/footer.jsp" />
	</footer>
</html>