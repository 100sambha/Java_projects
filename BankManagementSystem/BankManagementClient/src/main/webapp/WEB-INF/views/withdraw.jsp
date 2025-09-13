<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<%@taglib prefix="mp" tagdir="/WEB-INF/tags"%>
<mp:Master title="Add Employee">
	<jsp:attribute name="header"></jsp:attribute>
	<jsp:attribute name="content">
		<div class="container">
			<form action="withdrawAmmount">
				<div>
					<h2 id="a">WITHDRAW</h2>
					<label for="Deposite Amount" id="b">Enter Ammount To Withdraw</label>
					<br/>
					<input type="number" id="ammount" name="amount" placeholder="Enter Amount" />
					<br/>
					<p><font color="red">${msg}</font></p>
					<input class="amtsubBtn" type="submit" value="Withdraw" />
				</div>
			</form>
		</div>
	</jsp:attribute>
</mp:Master>