<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>

<body>
	<h2>Regular Amount - JSR303 @Valid example</h2>

	<form:form method="POST" commandName="regularAmount" action="check_regular_amount">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Frequency :</td>
				<td>
					<form:select path="frequency">
						<form:option value="WEEK" label="Week"/>
						<form:option value="TWO_WEEK" label="Two Week"/>
						<form:option value="FOUR_WEEK" label="Four Week"/>
						<form:option value="MONTH" label="Month"/>
						<form:option value="QUARTER" label="Quarter"/>
						<form:option value="YEAR" label="Year"/>
					</form:select>
				</td>
				<td><form:errors path="frequency" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Amount :</td>
				<td><form:input path="amount" /></td>
				<td><form:errors path="amount" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>