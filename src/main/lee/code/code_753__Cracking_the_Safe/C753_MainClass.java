package lee.code.code_753__Cracking_the_Safe;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C753_MainClass {
public static String testCase = "1\n1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().crackSafe(n, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
