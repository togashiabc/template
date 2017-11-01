<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<title><s:text name="lang.admin_update.title" /></title>
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

    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.slick.min.js"></script>
    <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="js/jquery.ba-hashchange.min.js"></script>
    <script type="text/javascript" src="js/autoConfirm.js"></script>
    <script type="text/javascript" src="js/jquery.selectGenre.js"></script>

</head>
<body>
<header><s:include value="admin_header.jsp" /></header>

 <h1><s:text name="lang.admin_update.update" /></h1>
 <hr>

<font color="red"  class="error-message"><s:property value="doubling"/></font>

 <s:iterator value="itemList">
   <div class="container">
     <div class="row">
      <div class="col-lg-offset-3">
      <div><s:text name="lang.admin_update.itemId" /><s:property value="itemId"/>  <br><br>
      </div>
      <s:form method="post" action="AdminUpdateAction" class="autoConfirm">

      <s:hidden name="itemId"></s:hidden>
      <div class="form-group"><s:text name="lang.admin_update.itemsName" /><font color="red"><s:text name="lang.admin_update.required" /></font><br>
         <input type="text" maxlength="50" name="itemsName" class="form-control" value="<s:property value="itemList[0].itemsName"/>" required="required"
         >
      </div>

      <div class="form-group"><s:text name="lang.admin_update.price" /><font color="red"><s:text name="lang.admin_update.required" /></font><br>
         <input type="number" max="9999999" min="1" name="price" class="form-control" value="<fmt:formatNumber value="${price}" pattern="#########"/>" required="required"
         >
      </div>

      <div class="form-group"><s:text name="lang.admin_update.stock" /><br>
         <input type="number" max="9999999" min="0" name="stock" class="form-control"
          value="<s:property value="itemList[0].stocks"/>">
      </div>

      <div class="form-group"><s:text name="lang.admin_update.sales" /><br>
         <input type="number" max="9999999" min="0" name="sales" class="form-control"
          value="<s:property value="itemList[0].sales"/>">
      </div>

      <div class="form-group"><s:text name="lang.admin_update.details" /><br>
         <textarea name="itemDetail" class="form-control" rows="10" cols="60" maxlength="500"
         ><s:property value="itemList[0].itemDetail"/></textarea>
      </div>

      <div class="form-group"><s:text name="lang.admin_update.category" /><br>
         <select name="sort" class="form-control" required="required" id="select_sort">
           <s:if test="i=2"></s:if>
           <s:if test="itemList[0].sortId == 1"><option value="1" selected><s:text name="lang.admin_update.tomato" /></option></s:if>
           <s:if test="itemList[0].sortId == 2"><option value="2" selected><s:text name="lang.admin_update.green" /></option></s:if>
           <s:if test="itemList[0].sortId == 3"><option value="3" selected><s:text name="lang.admin_update.paprika" /></option></s:if>
           <s:if test="itemList[0].sortId == 4"><option value="4" selected><s:text name="lang.admin_update.cucumber" /></option></s:if>
           <s:if test="itemList[0].sortId == 5"><option value="5" selected><s:text name="lang.admin_update.corn" /></option></s:if>
           <s:if test="itemList[0].sortId == 6"><option value="6" selected><s:text name="lang.admin_update.cabbage" /></option></s:if>
           <s:if test="itemList[0].sortId == 7"><option value="7" selected><s:text name="lang.admin_update.potato" /></option></s:if>
           <s:if test="itemList[0].sortId == 8"><option value="8" selected><s:text name="lang.admin_update.eggplant" /></option></s:if>

             <s:if test="itemList[0].sortId != 1"><option value="1"><s:text name="lang.admin_update.tomato" /></option></s:if>
             <s:if test="itemList[0].sortId != 2"><option value="2"><s:text name="lang.admin_update.green" /></option></s:if>
             <s:if test="itemList[0].sortId != 3"><option value="3"><s:text name="lang.admin_update.paprika" /></option></s:if>
             <s:if test="itemList[0].sortId != 4"><option value="4"><s:text name="lang.admin_update.cucumber" /></option></s:if>
             <s:if test="itemList[0].sortId != 5"><option value="5" ><s:text name="lang.admin_update.corn" /></option></s:if>
             <s:if test="itemList[0].sortId != 6"><option value="6"><s:text name="lang.admin_update.cabbage" /></option></s:if>
             <s:if test="itemList[0].sortId != 7"><option value="7"><s:text name="lang.admin_update.potato" /></option></s:if>
             <s:if test="itemList[0].sortId != 8"><option value="8"><s:text name="lang.admin_update.eggplant" /></option></s:if>
         </select>
      </div>

      <div class="form-group"><s:text name="lang.admin_update.image" /><s:property value="itemList[0].imgPath"/>→<br>
         <select name="imgDel" class="form-control" required="required" size="3" id="select_sort">
             <option value="1" selected><s:text name="lang.admin_update.no" /></option>
             <option value="2"><s:text name="lang.admin_update.change" /></option>
             <option value="3"><s:text name="lang.admin_update.erase" /></option>
          </select>
         <input type="file" name="imgPath" size="60"  multiple="multiple"
         accept="XXXX" />

      </div>

      <div>
         <input type="submit">
      </div><br>
      <div>
         <input type="button" value="<s:text name = 'lang.admin_update.return'/>" class="autoConfirmBack">
      </div>

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