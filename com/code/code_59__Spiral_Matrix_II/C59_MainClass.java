package lee.code.code_59__Spiral_Matrix_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C59_MainClass {
public static String testCase = "3";
/*
    public static String Utils.int2dArrayToString(int[][] array) {
        if (array == null) {
            return "null";
        }
        if (array.length == 0) {
            return "[]";
        }
    
        StringBuilder sb = new StringBuilder("[");
        for (int[] item : array) {
            sb.append(Integer.toString(item));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int[][] ret = new Solution().generateMatrix(n);
            
            String out = Utils.int2dArrayToString(ret);
            
            System.out.print(out);
        }
    }
}
