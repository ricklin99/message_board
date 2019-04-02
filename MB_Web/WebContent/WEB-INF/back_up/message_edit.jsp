<%@ page import="mb.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" >

    <title> 編輯公布事項 </title>
</head>
    <style>
        .message {
            vertical-align: middle;
            line-height: 30px;
        }

        .message input {
            height: 30px;
        }

        .desc {
            width: 100px;
        }

    </style>
    
<body>
    <form action="message_update">

        <div class="container">
            <div class="row">
                <label class="col-sm-2">新增公佈欄事項</label>
            </div>
        </div>
        <div class="container">
            <div class="form-group row">
                    <label class="col-sm-2 col-form-label">標題：</label>
                    <input class="col-sm-4 form-control" type="text" required placeholder="請輸入標題"  name="title" value="${title}">
            </div>
            <div class="form-group row">
                    <label class="col-sm-2 col-form-label">發佈日期：</label>
                    <input class="col-sm-4 form-control" type="date" required placeholder="請輸入發佈日期" name="issuedate" value="${issuedate} ">
            </div>
            <div class="form-group row">
                    <label class="col-sm-2 col-form-label">截止日期：</label>
                    <input class="col-sm-4 form-control" type="date" required placeholder="請輸入標題"  name="dateOfDeadline" value="${dateOfDeadline}">
            </div>
            <div class="form-group row">
                    <label class="col-sm-2 col-form-label">發布者：</label>
                    <input class="col-sm-4 form-control" type="text" required placeholder="請輸入標題" name="roleType" value="${employee.roleType}" disabled="disabled">
            </div>
            <div class="form-group row">
                    <label class="col-sm-2 col-form-label">MessageCommentId：</label>
                    <input class="col-sm-4 form-control" type="text" required placeholder="請輸入標題" name="id" value="${id}" disabled="disabled">
            </div>
            <div class="form-group d-none">
                    <label class="col-sm-2 col-form-label">MessageCommentId：</label>
                    <input class="col-sm-4 form-control" type="text" required placeholder="請輸入標題" name="emp_no" value="1" disabled="disabled">
            </div>
        </div>
        <div class="container">
            <div class="form-group row">
                <label class="desccol-sm-1 col-form-label">公布內容：</label>
                <textarea class="form-control"  required placeholder="請輸入標題" name="messageContent">${messageContent}</textarea>
            </div>
        </div>
        <div class="container">
            <div class="form-group row">
                <input class="btn btn-primary" type="submit" value="送出" >
            </div>
        </div>
    </form>
    <script src="http://code.jquery.com/jquery-3.3.1.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
</body>

</html>
