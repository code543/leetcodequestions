package lee.code.code_728__Self_Dividing_Numbers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C728_MainClass {
public static String testCase = "1\n22";
/*
    public static String Utils.integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String Utils.integerArrayListToString(List<Integer> nums) {
        return Utils.integerArrayListToString(nums, nums.size());
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int left = Integer.parseInt(line);
            line = in.readLine();
            int right = Integer.parseInt(line);
            
            List<Integer> ret = new Solution().selfDividingNumbers(left, right);
            
            String out = Utils.integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}
