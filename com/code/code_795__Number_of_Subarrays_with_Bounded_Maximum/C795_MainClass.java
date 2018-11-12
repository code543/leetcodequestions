package lee.code.code_795__Number_of_Subarrays_with_Bounded_Maximum;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C795_MainClass {
public static String testCase = "[2,1,4,3]\n2\n3";
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
            int[] A = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int L = Integer.parseInt(line);
            line = in.readLine();
            int R = Integer.parseInt(line);
            
            int ret = new Solution().numSubarrayBoundedMax(A, L, R);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
