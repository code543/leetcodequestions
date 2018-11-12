package lee.code.code_658__Find_K_Closest_Elements;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C658_MainClass {
public static String testCase = "[1,2,3,4,5]\n4\n3";
/*
    public static int[] Utils.stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
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
            int[] arr = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            line = in.readLine();
            int x = Integer.parseInt(line);
            
            List<Integer> ret = new Solution().findClosestElements(arr, k, x);
            
            String out = Utils.integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}
