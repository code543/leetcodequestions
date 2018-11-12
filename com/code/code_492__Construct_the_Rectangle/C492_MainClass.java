package lee.code.code_492__Construct_the_Rectangle;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C492_MainClass {
public static String testCase = "1";
/*
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
            int area = Integer.parseInt(line);
            
            int[] ret = new Solution().constructRectangle(area);
            
            String out = Utils.integerArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
