package resources

class TestDataBuilder {

  /**
   * In this class you will have to write methods that will returns the objects that you want to use in your requests
   */

  static String userToDo(def todo) {
    return "  {\n" +
      "    \"userId\": " + todo.userId + ",\n" +
      "    \"title\": \"" + todo.title + "\",\n" +
      "    \"completed\": " + todo.completed + "\n" +
      "  }"
  }

  //Complete the user like the ToDos above

  static String user(def testUser) {
    return " {\n" +
      "    \"name\": \"" + testUser.name + "\",\n" +
      "    \"username\": \"" + testUser.username + "\",\n" +
      "    \"email\": \"" + testUser.email + "\",\n" +
      "    \"address\": {\n" +
      "      \"street\": \"" + testUser.address.street + "\",\n" +
      "      \"suite\": \"" + testUser.address.suite + "\",\n" +
      "      \"city\": \"" + testUser.address.city + "\",\n" +
      "      \"zipcode\": \"" + testUser.address.zipcode + "\",\n" +
      "      \"geo\": {\n" +
      "        \"lat\": \"" + testUser.address.geo.lat + "\",\n" +
      "        \"lng\": \"" + testUser.address.geo.lng + "\"\n" +
      "      }\n" +
      "    },\n" +
      "    \"phone\": \"" + testUser.phone + "\",\n" +
      "    \"website\": \"" + testUser.website + "\",\n" +
      "    \"company\": {\n" +
      "      \"name\": \"" + testUser.company.name + "\",\n" +
      "      \"catchPhrase\": \"" + testUser.company.catchPhrase + "\",\n" +
      "      \"bs\": \"" + testUser.company.bs + "\"\n" +
      "    }\n" +
      "  }"
  }
}
