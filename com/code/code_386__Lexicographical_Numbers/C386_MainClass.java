package lee.code.code_386__Lexicographical_Numbers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C386_MainClass {
public static String testCase = "13";
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
            int n = Integer.parseInt(line);
            
            List<Integer> ret = new Solution().lexicalOrder(n);
            
            String out = Utils.integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}
