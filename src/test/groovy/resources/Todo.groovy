package resources

class Todo {
  private String userId;
  private int id;
  private String title;
  private boolean completed;


  Todo(String userId, int id, String title, boolean completed) {
    this.userId = (userId == 'null') ? '' : userId;
    this.id = id;
    this.title = (title == 'null') ? '' : title;
    this.completed = completed;
  }
}