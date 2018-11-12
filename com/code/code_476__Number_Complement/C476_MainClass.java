package lee.code.code_476__Number_Complement;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C476_MainClass {
public static String testCase = "5";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().findComplement(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
