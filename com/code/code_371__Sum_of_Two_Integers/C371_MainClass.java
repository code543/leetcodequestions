package lee.code.code_371__Sum_of_Two_Integers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C371_MainClass {
public static String testCase = "1\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int a = Integer.parseInt(line);
            line = in.readLine();
            int b = Integer.parseInt(line);
            
            int ret = new Solution().getSum(a, b);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
