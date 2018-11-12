package lee.code.code_526__Beautiful_Arrangement;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C526_MainClass {
public static String testCase = "2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            int ret = new Solution().countArrangement(N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
