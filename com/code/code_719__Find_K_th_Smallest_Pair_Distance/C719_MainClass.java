package lee.code.code_719__Find_K_th_Smallest_Pair_Distance;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C719_MainClass {
public static String testCase = "[1,3,1]\n1";
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
            int k = Integer.parseInt(line);
            
            int ret = new Solution().smallestDistancePair(nums, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
