package lee.code.code_629__K_Inverse_Pairs_Array;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C629_MainClass {
public static String testCase = "3\n0";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            int ret = new Solution().kInversePairs(n, k);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
