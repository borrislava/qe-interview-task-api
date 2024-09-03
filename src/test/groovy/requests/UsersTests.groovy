package requests

import io.restassured.response.Response
import org.junit.jupiter.api.Test
import resources.Address
import resources.TestDataBuilder
import resources.User
import resources.Users


class UsersTests extends Users {

  static final def testUser = [
          id      : 100,
          name    : "Leanne Graham",
          username: "Bret",
          email   : "Sincere@april.biz",
          address : [
                  street : "Kulas Light",
                  suite  : "Apt. 556",
                  city   : "Gwenborough",
                  zipcode: "92998-3874",
                  geo    : [
                          lat: "-37.3159",
                          lng: "81.1496",
                  ]
          ],
          phone   : "1-770-736-8031 x56442",
          website : "hildegard.org",
          company : [
                  name       : "Romaguera-Crona",
                  catchPhrase: "Multi-layered client-server neural-net",
                  bs         : "harness real-time e-markets"
          ]
  ];

  static User user;
  static final int numberOfRequests = 100;

  TestDataBuilder testDataBuilder = new TestDataBuilder()

  @Test
  void test_createUser() {
    Response response = createUser(testUser)
    assert response.statusCode() == 200 || 201
    response.prettyPrint()
    user = setUserData(response);
    assert user.getId() != 0;
    assert user.getName() == testUser.name;
    assert user.getUsername() == testUser.username;
    assert user.getEmail() == testUser.email;
    assert user.getCompany().equals(testUser.company);
    Address userAddress = user.getAddress();
    assert userAddress.getStreet() == testUser.address.street;
    assert userAddress.getCity() == testUser.address.city;
    assert userAddress.getStreet() == testUser.address.street;
    assert userAddress.getSuite() == testUser.address.suite;
    assert userAddress.getZipcode() == testUser.address.zipcode;
    assert userAddress.getGeo().equals(testUser.address.geo);
    assert user.getPhone() == testUser.phone;
    assert user.getWebsite() == testUser.website;
  }

  @Test
  void measureResponseTimes() {
    long responseTimes = Users.measureResponseTimes(numberOfRequests, testUser);
    println("Response time for 100 requests in milliseconds: " + responseTimes);
  }
}