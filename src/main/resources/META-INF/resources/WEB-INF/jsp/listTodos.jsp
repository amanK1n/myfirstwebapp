<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
<title>List Todos Page</title>
</head>
<body>
	<div>
		<h1>Welcome ${name2}</h1>
	</div>
	<div>
		<hr>
		<h2>Your todos are</h2>
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is It Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id}</td>
						<td>${todo.description}</td>
						<td>${todo.targetDate}</td>
						<td>${todo.done}</td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>