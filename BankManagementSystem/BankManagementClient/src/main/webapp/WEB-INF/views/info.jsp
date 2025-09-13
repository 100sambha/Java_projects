<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<%@taglib prefix="mp" tagdir="/WEB-INF/tags"%>
<mp:Master title="Add Employee">
	<jsp:attribute name="header"></jsp:attribute>
	<jsp:attribute name="content">  
<div class="container">
  <form action="/action_page.php">
<%--   User : <em><c:out value="${user.username}"></c:out></em> --%>
  	<table class="iTable" >
  		<tr>
  			<td>Id</td>
  			<td>:</td>
  			<td>${user.id}</td>
  		</tr>
  		<tr>
  			<td>Account Number</td>
  			<td>:</td>
  			<td>${user.accountNo }</td>
  		</tr>
  		<tr>
  			<td>First Name</td>
  			<td>:</td>
  			<td>${user.fName}</td>
  		</tr>
  		<tr>
  			<td>Last Name</td>
  			<td>:</td>
  			<td>${user.lName}</td>
  		</tr>
  		<tr>
  			<td>Mobile No</td>
  			<td>:</td>
  			<td>${user.moNo}</td>
  		</tr>
  		<tr>
  			<td>Address</td>
  			<td>:</td>
  			<td>${user.address}</td>
  		</tr>
  		<tr>
  			<td>Gmail</td>
  			<td>:</td>
  			<td>${user.gmail}</td>
  		</tr>
  		<tr>
  			<td>DOB</td>
  			<td>:</td>
  			<td>${user.dob}</td>
  		</tr>
  		<tr>
  			<td>Account Status</td>
  			<td>:</td>
  			<td>${user.status}</td>
  		</tr>
  	</table>
  </form>
</div>
</jsp:attribute>
</mp:Master>