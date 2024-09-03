package resources

import io.restassured.response.Response

class ToDos extends HTTPClient {

  final toDosPath = '/todos'

  TestDataBuilder testDataBuilder = new TestDataBuilder()


  Response createToDo(def testTodo) {
    post(toDosPath, testDataBuilder.userToDo(testTodo))
  }

  Todo setTodoData(Response jsonResponseBody) {
    def todoResponseData = jsonSlurper.parseText(jsonResponseBody.asString());
    Todo todo = new Todo(todoResponseData.id,
            todoResponseData.userId,
            todoResponseData.id,
            todoResponseData.title,
            todoResponseData.completed);
    return todo;
  }
}
