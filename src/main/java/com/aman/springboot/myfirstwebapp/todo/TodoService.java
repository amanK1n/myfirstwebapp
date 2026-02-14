package com.aman.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
private static List<Todo> todos;
static {
	todos.add(new Todo(1, "in28Mins", "Learn AWS", LocalDate.now().plusYears(1), false));
	todos.add(new Todo(2, "in28Mins", "Learn JAVA", LocalDate.now().plusYears(2), false));
	todos.add(new Todo(3, "in28Mins", "Learn DSA", LocalDate.now().plusYears(3), false));
	todos.add(new Todo(4, "in28Mins", "Learn JSP", LocalDate.now().plusYears(4), false));
	todos.add(new Todo(5, "in28Mins", "Learn Spring", LocalDate.now().plusYears(5), false));
}

}
