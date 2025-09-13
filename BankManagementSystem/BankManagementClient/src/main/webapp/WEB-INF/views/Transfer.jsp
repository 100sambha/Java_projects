<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<%@taglib prefix="mp" tagdir="/WEB-INF/tags"%>

<mp:Master title="Add Employee">
	<jsp:attribute name="header"></jsp:attribute>
	<jsp:attribute name="content">  
<div class="container">
  <form action="toTransfer">
  	<h2>Fund Transfer</h2>
  	<table>
  		<tr>
  		<td>From</td>
  		<td><label>:</label></td>
  		<td><input type="text" name="fromAccno" value="${accNo}" disabled="disabled"></td>
  		</tr>
  		<tr>
  		<td>To</td>
  		<td><label>:</label></td>
  		<td><input type="number" name="toAccno"></td>
  		</tr>
  		<tr>
  		<td>Ammount</td>
  		<td><label>:</label></td>
  		<td><input type="number" name="transferAmm"></td>
  		</tr>
  	</table>
  	<p>${msg }</p>
  	<input class="button" type="submit" value="Transfer">
  </form>
</div>
</jsp:attribute>
</mp:Master>

<!--

<h2>Fund Transfer</h2>
     <label for="Deposite Amount">From Account : </label>
      <c:out value="${Message}">123</c:out>
					<br></br>
		<label for="Credit Amount">To Account : </label>
    <input type="number" id="fname" name="firstname"
					placeholder="Enter Account Number">
					<br></br>
			<label for="Amount">Amount : </label>
    <input type="number" id="fname" name="firstname"
					placeholder="Enter Ammount">
					<br></br>			
    <input type="submit" value="Transfer">

-->