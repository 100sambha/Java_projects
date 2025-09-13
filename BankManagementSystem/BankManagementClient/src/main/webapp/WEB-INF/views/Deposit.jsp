<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<%@taglib prefix="mp" tagdir="/WEB-INF/tags"%>
<mp:Master title="Add Employee">
	<jsp:attribute name="header"></jsp:attribute>
	<jsp:attribute name="content">
<div class="container">
  <form action="depositeAmmount">
  <div>
	<h2 id="a">Deposit</h2>
    <label for="Deposite Amount" id="b">Enter Deposit Amount</label>
    <br/>
    <input type="number" id="ammount" name="amount" placeholder="Enter Amount" />
    <br/>
    <input class="amtsubBtn" type="submit" value="Deposit" />
    <div><c:out value="${success}"></c:out>  </div>
  </div>
    </form>
</div>
</jsp:attribute>
</mp:Master>