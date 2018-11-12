package lee.code.code_166__Fraction_to_Recurring_Decimal;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C166_MainClass {
public static String testCase = "1\n2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int numerator = Integer.parseInt(line);
            line = in.readLine();
            int denominator = Integer.parseInt(line);
            
            String ret = new Solution().fractionToDecimal(numerator, denominator);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}
