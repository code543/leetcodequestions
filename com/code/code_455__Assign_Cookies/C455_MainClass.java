package lee.code.code_455__Assign_Cookies;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C455_MainClass {
public static String testCase = "[1,2,3]\n[1,1]";
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
            int[] g = Utils.stringToIntegerArray(line);
            line = in.readLine();
            int[] s = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().findContentChildren(g, s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
