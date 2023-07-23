package utilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class APIUtil {

//reusableMethods dur aslında bu method

//assaertion methodları burada olabilir

 // Rest  Assured da not found bir status code değil bir exceptiondur bu yüzden try catch çalıştırıyoruz

    public static void assertStatusCodeIsOk(Response response) {
       Assert.assertEquals(200, response.getStatusCode());

    }
    public static void assertStatusCodeIsBadRequest(Response response) {

        Assert.assertEquals(400, response.getStatusCode());
    }
    public static void assertStatusCodeCreated(Response response) {

        Assert.assertEquals(201, response.getStatusCode());
    }
    public static void assertStatusCode(Response response,int expected) {

     Assert.assertEquals(expected, response.getStatusCode());
    }
public static Response sendGetRequest(String endpoint) {
   return RestAssured.given().
           //her zaman kullanacağımız methodları burada yazıp çağırabiliriz..
            when().get(endpoint);

}
public static Response sendPostRequest(Object body,String endpoint) {

        return RestAssured.given().
                body(body).
                //her zaman kullanacağımız methodları burada yazıp çağırabiliriz..
                when().post(endpoint);

}

public static Response sendTokenRequest(Object body,String endpoint,String token) {
    return RestAssured.given().
            auth().oauth2(token).
            body(body).
            //her zaman kullanacağımız methodları burada yazıp çağırabiliriz..
                    when().post(endpoint);
}
public static void fromJson(String json,String endpoint) {

}

}
