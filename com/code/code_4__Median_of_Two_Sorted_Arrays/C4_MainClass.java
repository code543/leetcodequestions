package lee.code.code_4__Median_of_Two_Sorted_Arrays;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C4_MainClass {
public static String testCase = "[1,3]\n[2]";
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
    
    public static String Utils.doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] nums2 = Utils.stringToIntegerArray(line);
            
            double ret = new Solution().findMedianSortedArrays(nums1, nums2);
            
            String out = Utils.doubleToString(ret);
            
            System.out.print(out);
        }
    }
}
