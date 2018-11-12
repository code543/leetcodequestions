package lee.code.code_33__Search_in_Rotated_Sorted_Array;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C33_MainClass {
public static String testCase = "[4,5,6,7,0,1,2]\n0";
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
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            int ret = new Solution().search(nums, target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
