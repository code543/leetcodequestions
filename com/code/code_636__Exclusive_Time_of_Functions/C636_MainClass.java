package lee.code.code_636__Exclusive_Time_of_Functions;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C636_MainClass {
public static String testCase = "2\n[\"0:start:0\",\"1:start:2\",\"1:end:5\",\"0:end:6\"]";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
    public static String Utils.integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String Utils.integerArrayToString(int[] nums) {
        return Utils.integerArrayToString(nums, nums.length);
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            List<String> logs = Utils.stringToStringList(line);
            
            int[] ret = new Solution().exclusiveTime(n, logs);
            
            String out = Utils.integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
