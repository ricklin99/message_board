

<%@page import="mb.service.MessageCommentService"%>
<%@page import="mb.entity.RoleType"%>
<%@page import="mb.entity.Employee"%>
<%@page import="mb.entity.MessageComment"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport"  content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <title> 瀏覽公佈事項 </title>
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
    <% 
    //取得留言
     MessageCommentService mService = new MessageCommentService();
     List<MessageComment> list = mService.getMessages();
    //模擬登入狀態
     //0.使用Session記錄使用者資料
//     	Employee emp = new Employee();
//     	emp.setEmp_no(20190315);
//     	RoleType role = RoleType.ADM;
//     	emp.setRoleType(role);
    	
//         HttpSession hs = request.getSession();
//         hs.setAttribute("employee",emp);
        
//      //1.取得session中的使用者資料
     
//         Object obj = session.getAttribute("employee");
//         Employee employee  = null;
//         if (obj instanceof Employee) {
//         	employee = (Employee) obj;
//         }

     
    %>
    <div class="container-fluid">
    <% 
		for(MessageComment message:list){
       %>
        <ul class="list-inline outline border-bottom">
            <li class="list-inline-item disabled col-4 outline" aria-disabled="true"><%= message.getTitle() %></li>
            <li class="list-inline-item col-2 "><%= message.getIssuedate() %></li>
            <li class="list-inline-item col-2"><%= message.getDateOfDeadline() %></li>
            <li class="list-inline-item col-1"><a type="button" class="btn btn-secondary text-white btn-sm" href="" >修改</a></li>
            <li class="list-inline-item col-1"><a type="button" class="btn btn-secondary text-white btn-sm" href="" >刪除</a></li>
<%--             <li class="list-inline-item col-1 d-none"><%= message.getId() %></li> --%>
        </ul>
    <%
		}
    
    %>
    </div>
    <div class="container">
        <div class="row">
            <div class="mx-auto">
                <a type="button" class="btn btn-secondary text-white btn-sm" href="<%= request.getContextPath()+"/message.jsp" %>">新增</a>
            </div>
        </div>
    </div>
    <!--bootstraps setting-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" ></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" ></script>
</body>
</html>