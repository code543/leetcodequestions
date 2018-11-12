package lee.code.code_539__Minimum_Time_Difference;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C539_MainClass {
public static String testCase = "[\"23:59\",\"00:00\"]";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            List<String> timePoints = Utils.stringToStringList(line);
            
            int ret = new Solution().findMinDifference(timePoints);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
