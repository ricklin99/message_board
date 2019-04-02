<%@ page import="mb.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<sj:head jqueryui="true" />
<sb:head includeScripts="true" />
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">

<title>編輯公布事項</title>

</head>
<style>
</style>
<body>		
			 
			<s:form id="form1" action="message_save" theme="bootstrap" cssClass="form-vertical" >
					<s:hidden name="id"/>
					<s:textfield name="title" label="標題" elementCssClass="col-4" labelCssClass="col-4" requiredLabel="true"/>
					<sj:datepicker 
							displayFormat="yy-mm-dd"
							elementCssClass="col-8" 
							labelCssClass="col-4"
							name="issuedate" 
							label="發佈日期" 
							showOn="focus" 
							requiredLabel="true"
							id="issuedate"/>
					<sj:datepicker
					        displayFormat="yy-mm-dd"
							name="dateOfDeadline" 
							label="截止日期" 
							elementCssClass="col-8" 
							labelCssClass="col-4"
							showOn="focus"
							requiredLabel="true"
							id="dateOfDeadline"/>
					<s:textfield name="employee.roleType.description" label="公佈者" elementCssClass="col-4" labelCssClass="col-4" readonly="true"/>
					<s:textarea name="messageContent" label="公佈內容" elementCssClass="col-6" labelCssClass="col-4" requiredLabel="true"/>
					<div class="col-1">
						<s:submit cssClass="btn btn-primary" />
					</div>
			</s:form>

	<%-- 	<script src="http://code.jquery.com/jquery-3.3.1.js"></script> --%>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</body>

</html>
