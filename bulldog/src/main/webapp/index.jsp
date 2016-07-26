<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<h2> Calculator</h2>

		<Form action=CalcServlet method=post>

			Number 1:
			<input type=text name=txtNum1><BR><BR>

			Number 2:
			<input type=text name=txtNum2><BR><BR>

			Operator:<BR>
			<input type=radio checked name=operator value=add>Add<BR>
			<input type=radio name=operator value=sub>Subtract<BR>
			<input type=radio name=operator value=mul>Multiply<BR><BR>

			<input type=Submit value=GO>

		</Form>
	</body>
</html>
