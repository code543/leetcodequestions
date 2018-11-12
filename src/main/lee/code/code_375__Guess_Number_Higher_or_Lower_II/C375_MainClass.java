package lee.code.code_375__Guess_Number_Higher_or_Lower_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C375_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().getMoneyAmount(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
