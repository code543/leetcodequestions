package lee.code.code_858__Mirror_Reflection;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C858_MainClass {
public static String testCase = "2\n1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int p = Integer.parseInt(line);
            line = in.readLine();
            int q = Integer.parseInt(line);
            
            int ret = new Solution().mirrorReflection(p, q);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
