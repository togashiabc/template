<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="ja">
<head>
        <meta charset="utf-8">

    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">

    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css"  href="css/adminhistory.css">
    <link rel="stylesheet" href="css/footer.css">
	<link rel="stylesheet" type="text/css" href="css/admin-page-top.css">

    <!-- Javascripts
    ================================================== -->
    <script src="js/jquery-1.11.3.min.js"></script>
    <script src="js/jquery.slick.min.js"></script>
    <script src="./js/jquery-3.2.1.min.js"></script>

<title>販売履歴画面</title>

</head>

<body>


<!-- ヘッダー -->
<header>
<s:include value="admin_header.jsp" />
</header>

<div class="container">


	<h1>
      販売履歴
	</h1>
	 <hr>







	<p>検索
	</p>

    <s:form action="AdminHistoryAction">
		<input type="number" name="itemId" size="50" placeholder="商品 ID" min="0" max="1000000000">
		<input type="submit" value="検索/Search">
	</s:form>





	<table>


<tr align="center">





            <!-- table表示項目 -->

			<th>商品ID</th>
			<th>商品名</th>
            <th>個数</th>
            <th>合計金額</th>
            <th>購入情報</th>


</tr>

             <!-- adminhistoryListから値を挿入する処理 -->
       <s:iterator value="adminhistoryList">
       <s:iterator>

  <tr class="bg-info">



            <td><s:property value="itemId" /></td>
             <!-- 商品名 -->
            <td><s:property value="itemsName" /></td>
             <!-- 購入者ID -->
            <td><s:property value="purchaseId" /></td>

            <!-- 個数 -->
            <td><s:property value="quantities" /></td>
            <!-- 合計金額 -->
            <td>&yen;<fmt:formatNumber value="${subtotal}"/></td>
            <!-- 購入日 -->
            <td><s:property value="createdAt" /></td>

</tr>


 </s:iterator>

</s:iterator>


 </table>

 </div>

<!-- pagetop js -->
<a href ="#" class="admin-page-top">PAGE TOP ▲</a>
<script type="text/javascript" src="js/admin-page-top.js"></script>

</body>



</html>