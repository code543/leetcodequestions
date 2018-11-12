package lee.code.code_62__Unique_Paths;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C62_MainClass {
public static String testCase = "3\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            int ret = new Solution().uniquePaths(m, n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
