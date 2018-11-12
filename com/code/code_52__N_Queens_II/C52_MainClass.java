package lee.code.code_52__N_Queens_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C52_MainClass {
public static String testCase = "4";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().totalNQueens(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
