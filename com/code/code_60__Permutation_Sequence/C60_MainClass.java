package lee.code.code_60__Permutation_Sequence;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C60_MainClass {
public static String testCase = "3\n3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            line = in.readLine();
            int k = Integer.parseInt(line);
            
            String ret = new Solution().getPermutation(n, k);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
