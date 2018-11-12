package lee.code.code_817__Linked_List_Components;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C817_MainClass {
public static String testCase = "[0,1,2,3]\n[0,1,3]";
/*
    public static int[] Utils.stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode Utils.stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = Utils.stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = Utils.stringToListNode(line);
            line = in.readLine();
            int[] G = Utils.stringToIntegerArray(line);
            
            int ret = new Solution().numComponents(head, G);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
