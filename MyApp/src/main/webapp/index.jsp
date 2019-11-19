<html>
<body>
<form action="redirect" method="get">
	
	<div  align="center">
	<h2>File Operations</h2>
	<div>
	<input type="text" name="t1"> <br><br>
	
	<input type="submit" value="Save" name="save">
	<input type="submit" value="View" name="view">
	<h1><%= request.getAttribute("result") %></h1>
	
	
	<!-- <h1>{name}</h1> -->
	</div>
	<%-- <div>
	<input type="text" name="t2">
	<input type="submit" value="Add" name="add">
	<input type="submit" value="Subtract" name="subtract">
	<input type="submit" value="Multiply" name="multiply">
	<input type="submit" value="Divide" name="divide"> <br><br>
		<input type="text" name="t3" value="<%= request.getAttribute("result") %>"> 
	
	</div> --%>
	</div>
</form>
</body>
</html>
