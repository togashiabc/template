<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 商品管理画面 -->
<title>商品管理画面</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css" href="./slick/slick.css">
    <link rel="stylesheet" type="text/css" href="./slick/slick-theme.css">
    <link rel="stylesheet" href="css/footer.css">
    <link rel="stylesheet" type="text/css"  href="css/style.css">
    <link rel="stylesheet" href="css/table-item.css">
    <link rel="stylesheet" type="text/css" href="css/admin-page-top.css">

	<!-- Javascripts
    ================================================== -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>



</head>
<body>
 <header><s:include value="admin_header.jsp" /></header>


<div class="container">
<!-- 商品管理 -->
 <h1>商品管理</h1>
 <hr>
 <!-- 商品名を入力 -->
      <p>商品名</p>
<s:form action="AdminItemAction">
		<s:textfield name="itemsName" placeholder="商品名"/>
<!-- 検索 -->
		<s:submit value="%{getText('lang.admin_item.sarch')}" name="submit" />
</s:form>

<s:form action="AdminItemAction">
<!-- 全件表示 -->
		<s:submit value="%{getText('lang.admin_item.all')}" name="submit" />
</s:form>

<div align="right" style="padding-right:20%">
	<s:form action="GoAdminAddAction">
<!-- 商品追加 -->
		<s:submit value="%{getText('lang.admin_item.add')}" name="submit" />
	</s:form>
</div>

<s:iterator value="displayList">
<table class="item">
        <tr>
<!-- 商品ID -->
            <th>商品ID</th>
<!-- 商品名 -->
            <th>商品名</th>
<!-- 単価 -->
           <th>単価</th>
<!-- 在庫数 -->
            <th>在庫数</th>
<!-- 売り上げ数 -->
            <th>売上</th>
<!-- カテゴリー -->
            <th>カテゴリー</th>
<!-- 登録日 -->
            <th>登録日</th>
<!-- 更新日 -->
            <th>更新日</th>
<!-- デリートキー -->
            <th>削除</th>
<!-- 商品画像 -->
            <th>商品画像</th>
            <td rowspan="4">
                 <s:form action="GoAdminUpdateAction">
                     <s:hidden name="itemsName"></s:hidden>
<!-- 更新 -->
                     <s:submit value="%{getText('lang.admin_item.upd')}" name="submit"/>
                 </s:form>
                 <s:form action="GoAdminDeleteAction">
                     <s:hidden name="itemsName"></s:hidden>
<!-- 削除 -->
                     <s:submit value="%{getText('lang.admin_item.del')}" name="submit"/>
                 </s:form>
            </td>
        </tr>
        <tr>
            	<td><s:property value="itemId" /></td>
            	<td><s:property value="itemsName" /></td>
				<td>￥<fmt:formatNumber value="${price}" pattern="###,###,###"/></td>
				<td><s:property value="stocks" /></td>
				<td><s:property value="sales" /></td>
				<td><s:property value="sortId" />：<s:property value="itemGenre" /></td>
				<td><s:property value="createdAt" /></td>
				<td><s:property value="updatedAt" /></td>
				<td><s:property value="delKey" /></td>
				<td><img src="<s:property value="imgPath"/>" width="50" height="50">
					<s:property value="imgPath"/></td>

		</tr>
        <tr>
<!-- 商品詳細 -->
           <th colspan="10"><s:text name="lang.admin_item.detail" /></th>
        </tr>
        <tr>
        <td colspan="10">
        		<s:property value="itemDetail" />

		</td>
		</tr>

</table>
</s:iterator>
<!-- 表示件数： -->
<s:text name="表示" />
<s:property value="number"/>

<a href ="#" class="admin-page-top">PAGE TOP ▲</a>
<script type="text/javascript" src="js/admin-page-top.js"></script>

</div>
<!-- ページネーション-->

<!-- リストにデータが入っている時-->
<s:if test="number > 0">

<div class="center" style="text-align:center;">
						<!-- ページネーション:1ページ目のみ -->
						<s:if test="pageNum == 1">
						  <span>&laquo;<s:text name="戻る" /></span>
						</s:if>

						<!-- ページネーション:1ページ目以外 -->
						<s:else>
							<a href='<s:url action="AdminItemAction">
							<s:param name="pageNum" value="pageNum-1"/>
							</s:url>'>&laquo;<s:text name="戻る" /></a>

						</s:else>


                        <s:property value="pageNum" />


						<!-- ページネーション:最終ページ -->
						<s:if test="pageNum == maxPage">
						<s:text name="進む" />&raquo;
						</s:if>


						<!-- 最終ページ以外 -->
						<s:else>
							<a href='<s:url action="AdminItemAction">
							<s:param name="pageNum" value="pageNum+1"/>
							</s:url>'><s:text name="進む" />&raquo;</a>

						</s:else>


				</div>
		</s:if>

</body>


</html>