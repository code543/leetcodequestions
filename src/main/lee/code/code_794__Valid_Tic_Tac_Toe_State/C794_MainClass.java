package lee.code.code_794__Valid_Tic_Tac_Toe_State;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C794_MainClass {
public static String testCase = "[\"O  \",\"   \",\"   \"]";
/*
    public static String[] Utils.stringToStringArray(String line) {
        JsonArray jsonArray = JsonArray.readFrom(line);
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }
    
    public static String Utils.booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String[] board = Utils.stringToStringArray(line);
            
            boolean ret = new Solution().validTicTacToe(board);
            
            String out = Utils.booleanToString(ret);
            
            System.out.print(out);
        }
    }
}
