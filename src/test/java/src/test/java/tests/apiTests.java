package src.test.java.tests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import src.test.java.helperMethods.Request;

public class apiTests {

    Request request = new Request();
    Response response;

    @Test
    public void verifyBobakSearchResponseCode() {
        response = request.sendGoogleRequest("bobak");
        int expectedResponseCode = 200;
        Assert.assertTrue("Response code isn't " + expectedResponseCode,response.statusCode() == expectedResponseCode);
    }

    @Test
    public void verifyDimaSearchResponseCode() {
        response = request.sendGoogleRequest("dima");
        int expectedResponseCode = 200;
        Assert.assertTrue("Response code isn't " + expectedResponseCode,response.statusCode() == expectedResponseCode);
    }

    @Test
    public void verifyDimaSearchResponseBody() {
        response = request.sendGoogleRequest("dima");
        String expectedBodyResponse = "href";
        Assert.assertTrue("Response code isn't " + expectedBodyResponse, response.getBody().asString().contains(expectedBodyResponse));
    }


}
