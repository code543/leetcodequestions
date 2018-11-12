package lee.code.code_405__Convert_a_Number_to_Hexadecimal;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C405_MainClass {
public static String testCase = "26";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            String ret = new Solution().toHex(num);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
