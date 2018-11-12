package lee.code.code_779__K_th_Symbol_in_Grammar;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C779_MainClass {
public static String testCase = "1\n1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            line = in.readLine();
            int K = Integer.parseInt(line);
            
            int ret = new Solution().kthGrammar(N, K);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
