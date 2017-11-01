<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- ここから国際化 -->

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="lang.admin_contact.topTitle" /></title>

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css"  href="css/style.css">
    <link rel="stylesheet" type="text/css"  href="css/toiawase_style.css">
    <link rel="stylesheet" type="text/css" href="css/admin-page-top.css">

    <!-- Javascripts
    ================================================== -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>

<body>
    <header><s:include value="admin_header.jsp" /></header>

	<h1><s:text name="lang.admin_contact.h1title" /></h1>
    <hr>

<!-- 	検索バーここから -->
<div class="text-center">
<s:form action="AdminContactAction">

	<input type="text" name="searchName" placeholder="<s:text name="lang.admin_contact.enterName" />" size="20" />

	<select name="searchTitle">
			<option value=""><s:text name="lang.admin_contact.all" /></option>

			<option value="<s:text name="lang.admin_contact.unspecified" />" ><s:text name="lang.admin_contact.unspecified" /></option>

			<option value="<s:text name="lang.admin_contact.item" />" ><s:text name="lang.admin_contact.item" /></option>

			<option value="<s:text name="lang.admin_contact.payment" />" ><s:text name="lang.admin_contact.payment" /></option>

            <option value="<s:text name="lang.admin_contact.change" />" ><s:text name="lang.admin_contact.change" /></option>

			<option value="<s:text name="lang.admin_contact.other" />" ><s:text name="lang.admin_contact.other" /></option>
	</select>

	<select name="searchSort">
			<option value="-1"><s:text name="lang.admin_contact.sortNew" /></option>
			<option value="1" ><s:text name="lang.admin_contact.sortOld" /></option>
	</select>

	<input type="submit" value="<s:text name="lang.admin_contact.search" />" />

</s:form>
</div>
<!-- 	検索バーここまで -->



<s:if test ="displayList != null && !displayList.isEmpty()">
	<div class="text-center"><br>
	<p><s:property value="searchName"/> / <s:property value="searchTitle"/> /
		<b><s:property value="selectList.size()"/></b><s:text name="lang.admin_contact.Hits" />
		<br><b><s:property value="currentPage+1"/></b> / <b><s:property value="pageCount"/></b><s:text name="lang.admin_contact.page" /></p>
	</div><br>

<div class="text-center">
<s:iterator value="displayList">
<table class="admin-contact-table" border="1" style="table-layout:fixed;width:60%;">

		<tr bgcolor="#cccccc">
			<th><s:text name="lang.admin_contact.userName" /></th>
			<th><s:text name="lang.admin_contact.email" /></th>
        </tr>
		<tr align="center" bgcolor="#ffffff">
			<td><s:property value="userName" /></td>
			<td><s:property value="email" /></td>
		</tr>

        <tr bgcolor="#cccccc">
			<th><s:text name="lang.admin_contact.title" /></th>
			<th><s:text name="lang.admin_contact.dt" /></th>
		</tr>
		<tr align="center" bgcolor="#ffffff">
            <td><s:property value="title" /></td>
            <td><s:property value="dt" /></td>
        </tr>

        <tr bgcolor="#cccccc">
			<th colspan="2"><s:text name="lang.admin_contact.comment" /></th>
		</tr>
		<tr align="left" bgcolor="#ffffff">
            <td colspan="2"><div class="sc"><s:property value="comment" escape="false" /></div></td>
        </tr>

</table>
</s:iterator>
</div>


<!-- ページネーション -->
<nav class="text-center contents">
				<div class="text-center">
					<ul class="pagination">
						<!-- ページネーション（1ページ目なら） -->
						<s:if test="currentPage==0">
						<li class="disabled"><span>&laquo;</span></li>
						</s:if>

						<!-- 1ページ目以外なら -->
						<s:else>
							<li><a href='<s:url action="AdminContactAction">
												<s:param name="currentPage" value="currentPage -1"/>
												<s:param name="searchTitle" value="searchTitle"/>
												<s:param name="searchName" value="searchName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'>&laquo;
									</a>
							</li>
						</s:else>

						<s:iterator value="arrayPageCount" status="rs">
							<s:if test="%{#rs.index >= currentPage -leftPage && #rs.index <= currentPage +rightPage}">
								<s:if test="Page == #rs.index">
								<li class="disabled"><span><s:property value="#rs.count" /> </span></li>
								</s:if>
							<s:else>
							<li><a href='<s:url action="AdminContactAction">
												<s:param name="currentPage" value="#rs.index"/>
												<s:param name="searchTitle" value="searchTitle"/>
												<s:param name="searchName" value="searchName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'><s:property value="#rs.count" />
									</a>
							</li>
							</s:else>
							</s:if>
						</s:iterator>

						<!-- ページネーション（最終ページなら） -->
						<s:if test="currentPage == pageCount-1">
						<li class="disabled"><span>&raquo;</span></li>
						</s:if>

						<s:elseif test="pageCount == 0">
						<li class="disabled"><span>&raquo;</span></li>
						</s:elseif>

						<!-- 最終ページ以外なら -->
						<s:else>
							<li><a href='<s:url action="AdminContactAction">
							<s:param name="currentPage" value="currentPage+1"/>
							<s:param name="searchTitle" value="searchTitle"/>
							<s:param name="searchName" value="searchName"/>
							<s:param name="searchSort" value="searchSort"/>
							</s:url>'>&raquo;</a>
							</li>
						</s:else>
					</ul>

				</div>
</nav>
</s:if>


<s:else><h1><s:text name="lang.admin_contact.display" /></h1></s:else>


<div><a href="#"   class="admin-page-top">PAGE TOP ▲</a></div>

	<footer><c:import url="http://localhost:8080/openconnect/footer.jsp" /></footer>
</body>
	<!-- Javascripts
    ================================================== -->
	<script type="text/javascript" src="js/admin-page-top.js"></script>

</html>
