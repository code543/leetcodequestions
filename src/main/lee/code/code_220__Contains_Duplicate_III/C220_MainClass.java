package lee.code.code_220__Contains_Duplicate_III;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C220_MainClass {
public static String testCase = "[1,2,3,1]\n3\n0";
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
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            line = in.readLine();
            int t = Integer.parseInt(line);
            
            boolean ret = new Solution().containsNearbyAlmostDuplicate(nums, k, t);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
