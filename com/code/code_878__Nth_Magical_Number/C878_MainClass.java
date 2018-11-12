package lee.code.code_878__Nth_Magical_Number;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C878_MainClass {
public static String testCase = "1\n2\n3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            line = in.readLine();
            int A = Integer.parseInt(line);
            line = in.readLine();
            int B = Integer.parseInt(line);
            
            int ret = new Solution().nthMagicalNumber(N, A, B);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
