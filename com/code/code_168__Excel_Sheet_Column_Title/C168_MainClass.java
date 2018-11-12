package lee.code.code_168__Excel_Sheet_Column_Title;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C168_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            String ret = new Solution().convertToTitle(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
