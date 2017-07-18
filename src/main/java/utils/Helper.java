package utils;

import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
//import utils.JavaXMLHttpRequest;
import org.json.JSONObject;
import utils.JavaXmlHttpRequest;

public class Helper {

    private static Object zodiacJiraLogin = "konstantin.kostenko";
    private static String zodiacJiraHost = "https://jira.zodiac.tv";
    private static Object zodiacJiraPassword = "Engue2xe";


    private static String charterJiraLogin = "P2292624";
    private static String charterJiraHost = "https://jira.charter.com";
    private static String charterJiraPassword = "6jTYk570ViRl";

    private static String post(String targetURL, String payload, Map<String, String> headers) {
        headers.put("Content-Type", "application/json");
        return JavaXmlHttpRequest.post(targetURL, payload, headers);
    }

    public static String authorize() {
        JSONObject authorization = new JSONObject();
        authorization.put("username", zodiacJiraLogin);
        authorization.put("password", zodiacJiraPassword);

        Map<String, String> headers = new HashMap<String,String>();
        String reponse = post(charterJiraHost + "/rest/auth/1/session", authorization.toString(), headers);
        return reponse;
    }

}