<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<div>
		<h2>Your todos are</h2>
		<table class="table">
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is It Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
		<tr>
			<td>${todo.description}</td>
			<td>${todo.targetDate}</td>
			<td>${todo.done}</td>
			<td><a href="update-todo?id=${todo.id}"
				class="btn btn-warning">Update</a></td>
			<td><a href="delete-todo?id=${todo.id}"
				class="btn btn-danger">Delete</a></td>
		</tr>

	</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
	</div>
</div>
<%@ include file="common/footer.jspf" %>