package lee.code.code_96__Unique_Binary_Search_Trees;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C96_MainClass {
public static String testCase = "3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().numTrees(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
