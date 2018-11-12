package lee.code.code_551__Student_Attendance_Record_I;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C551_MainClass {
public static String testCase = "\"PPALLP\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s = Utils.stringToString(line);
            
            boolean ret = new Solution().checkRecord(s);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
