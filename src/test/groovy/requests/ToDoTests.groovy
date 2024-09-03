package requests

import io.restassured.response.Response

import org.junit.jupiter.api.Test
import resources.ToDos
import resources.Todo

class ToDoTests extends ToDos{
  static final testTodo =   [
    userId: 1,
    id: 1,
    title: "delectus aut autem",
    completed: false
  ];

  static Todo todo;

  @Test
  void test_createTodo() {

    Response response = createToDo(testTodo);
    assert response.statusCode() == 200 || 201;
    response.prettyPrint()

    assert todo.getId() != 0;
    assert todo.getUserId() == testTodo.userId;
    assert todo.getTitle() == testTodo.title;
    assert todo.getCompleted() == testTodo.completed;
  }
}
