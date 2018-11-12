package lee.code.code_818__Race_Car;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C818_MainClass {
public static String testCase = "3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int target = Integer.parseInt(line);
            
            int ret = new Solution().racecar(target);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
