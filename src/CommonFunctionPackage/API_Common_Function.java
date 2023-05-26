package CommonFunctionPackage;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class API_Common_Function {
	public static int statusCode(String baseURI,String resource,String requestBody) {
		RestAssured.baseURI = baseURI;
		int statusCode = given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().statusCode();
		return statusCode;
	}
		public static String responseBody(String baseURI,String resource,String requestBody) {
			RestAssured.baseURI = baseURI;
			String responseBody = given().header("Content-Type","application/json").body(requestBody).when().post(resource).then().extract().response().asString();
			return responseBody;
		}
	}


