package lee.code.code_474__Ones_and_Zeroes;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C474_MainClass {
public static String testCase = "[\"10\",\"0001\",\"111001\",\"1\",\"0\"]\n5\n3";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String[] strs = Utils.stringToStringArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            int ret = new Solution().findMaxForm(strs, m, n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
