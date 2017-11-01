<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <title>Legmina</title>
  <meta charset="UTF-8">
     <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">


    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="./slick/slick.css">
    <link rel="stylesheet" type="text/css" href="./slick/slick-theme.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" type="text/css"  href="css/style.css">

</head>
<body>

</head>

<body>
    <header>
    <s:if test="#session.userId != null && #session.loginFlg != 0">
    <div id="home">
        <nav id="menu" class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                <a class="navbar-brand logo" href="admin_top.jsp">Legmina</a>
                    <div class="collapse navbar-collapse" id="">
                      <ul class="nav navbar-nav navbar-right">
                    	 <li><a href="<s:url action="logoutAction"/>"> <s:text name="lang.admin_header.logout"/></a></li>
                      </ul>
                    </div>
                    <div class="collapse navbar-collapse" id="">
                      <ul class="nav navbar-nav navbar-right">
                        <li><a href="admin_top.jsp"><s:text name="lang.admin_header.top"/></a></li>
                        <li><a href="admin_item.jsp"><s:text name="lang.admin_header.item"/></a></li>
                        <li><a href="admin_history.jsp"><s:text name="lang.admin_header.history"/></a></li>
                        <li><a href="admin_user.jsp"><s:text name="lang.admin_header.users"/></a></li>
                        <li><a href='<s:url action="AdminContactAction"/>'><s:text name="lang.admin_header.inquiry"/></a></li>
                      </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
            </div>
        </nav>
    </div>
    </s:if>
    <s:else>
    <div id="home">
        <nav id="menu" class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                <a class="navbar-brand logo" href="admin_top.jsp">Legmina</a>
                    <div class="collapse navbar-collapse" id="">
                      <ul class="nav navbar-nav navbar-right">
                        <li><a href="login.jsp"><s:text name="lang.admin_header.login"/></a></li>
                      </ul>
                    </div>
                    <div class="collapse navbar-collapse" id="">
                      <ul class="nav navbar-nav navbar-right">
                        <li><a href="admin_top.jsp"><s:text name="lang.admin_header.top"/></a></li>
                        <li><a href="admin_item.jsp"><s:text name="lang.admin_header.item"/></a></li>
                        <li><a href="admin_history.jsp"><s:text name="lang.admin_header.history"/></a></li>
                        <li><a href="admin_user.jsp"><s:text name="lang.admin_header.users"/></a></li>
                        <li><a href='<s:url action="AdminContactAction"/>'><s:text name="lang.admin_header.inquiry"/></a></li>
                      </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
            </div>
        </nav>
    </div>


    </s:else>
    </header>
</body>
</html>