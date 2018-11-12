package lee.code.code_461__Hamming_Distance;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C461_MainClass {
public static String testCase = "1\n4";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            line = in.readLine();
            int y = Integer.parseInt(line);
            
            int ret = new Solution().hammingDistance(x, y);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
