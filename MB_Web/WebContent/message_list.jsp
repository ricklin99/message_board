<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport"  content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<title>新增公佈事項</title>
</head>
<style>
        .border-bottom {
            border-bottom-color: red;
        }
    </style>
<body>
	<div class="container-fluid">
        <div class="row">
            <h6><span class="d-block p-2 bg-light text-black font-weight-bold" style="width: 100vw;"> 瀏覽公佈事項</span></h6>
        </div>
    </div>
    <div class="container-fluid">
        <ul class="list-inline outline border-bottom border-info">
            <li class="list-inline-item disabled col-4 outline" aria-disabled="true">標題</li>
            <li class="list-inline-item col-2 ">發布日期</li>
            <li class="list-inline-item col-2">截止日期</li>
            <li class="list-inline-item col-1">修改</li>
            <li class="list-inline-item col-1">刪除</li>
        </ul>
    </div>
     <div class="container-fluid">
     <s:iterator value="#request.message_lists">
        <ul class="list-inline outline border-bottom">
            <li class="list-inline-item disabled col-4 outline" aria-disabled="true">${title}</li>
            <li class="list-inline-item col-2 ">${issuedate }</li>
            <li class="list-inline-item col-2">${dateOfDeadline }</li>
            <li class="list-inline-item col-1 "><a type="button" class="btn btn-secondary text-white btn-sm" href="message_edit?id=${id}" >修改</a></li>
            <li class="list-inline-item col-1 "><a type="button" class="btn btn-secondary text-white btn-sm" href="message_delete?id=${id}" >刪除</a></li>
<%--             <li class="list-inline-item col-1 d-none"><%= message.getId() %></li> --%>
        </ul>
     </s:iterator>
    </div>
    <div class="container">
        <div class="row">
            <div class="mx-auto">
                <a type="button" class="btn btn-secondary text-white btn-sm" href="message_create">新增</a>
            </div>
        </div>
    </div>

	

<!--bootstraps setting-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
</body>
</html>