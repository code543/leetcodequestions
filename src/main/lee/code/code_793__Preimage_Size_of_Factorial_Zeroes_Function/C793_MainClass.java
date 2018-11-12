package lee.code.code_793__Preimage_Size_of_Factorial_Zeroes_Function;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C793_MainClass {
public static String testCase = "0";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int K = Integer.parseInt(line);
            
            int ret = new Solution().preimageSizeFZF(K);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
