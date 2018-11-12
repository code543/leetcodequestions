package lee.code.code_468__Validate_IP_Address;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C468_MainClass {
public static String testCase = "\"172.16.254.1\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String IP = Utils.stringToString(line);
            
            String ret = new Solution().validIPAddress(IP);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
