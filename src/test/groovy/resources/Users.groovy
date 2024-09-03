package resources

import io.restassured.response.Response
import groovy.json.JsonSlurper

class Users extends HTTPClient {

  final static createUserPath = '/users';
  final static createTODOPath = '/todos';

  TestDataBuilder testDataBuilder = new TestDataBuilder();
  JsonSlurper jsonSlurper = new JsonSlurper()

  Response createUser(def testUser) {
    post(createUserPath, testDataBuilder.user(testUser));
  }

  User setUserData(Response jsonResponseBody) {
    def userResponseData = jsonSlurper.parseText(jsonResponseBody.asString());
    User user = new User(userResponseData.id,
            userResponseData.name,
            userResponseData.username,
            userResponseData.email,
            userResponseData.address,
            userResponseData.phone,
            userResponseData.website,
            userResponseData.company);
    return user;
  }

  long measureResponseTimes(int numberOfRequest, def userObject) {

    long responseTimes = 0;

    for (int i = 0; i < numberOfRequest; i++) {

      Response response = createUser(userObject);

      long responseTime = response.time(); // in milliseconds
      responseTimes += responseTime;
    }
    return responseTimes;
  }
}