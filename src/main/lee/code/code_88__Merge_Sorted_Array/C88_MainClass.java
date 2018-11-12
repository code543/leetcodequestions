package lee.code.code_88__Merge_Sorted_Array;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C88_MainClass {
public static String testCase = "[1,2,3,0,0,0]\n3\n[2,5,6]\n3";
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
            int[] nums1 = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int[] nums2 = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            new Solution().merge(nums1, m, nums2, n);
            String out = Utils.integerArrayToString(nums1);
            
            System.out.print(out);
        }
    }
}
