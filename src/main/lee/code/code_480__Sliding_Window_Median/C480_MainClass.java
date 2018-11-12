package lee.code.code_480__Sliding_Window_Median;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C480_MainClass {
public static String testCase = "[1,3,-1,-3,5,3,6,7]\n3";
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
    
    public static String Utils.doubleArrayToString(double[] input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        double[] arr = new double[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asDouble();
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            double[] ret = new Solution().medianSlidingWindow(nums, k);
            
            String out = Utils.doubleArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
