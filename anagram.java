import java.util.HashMap;
import java.util.Map;
public class anagram{
    public static void main(String[] args){
        String a = "ate";
        String b = "eat";
        Map<Character, Integer> a1 = new HashMap<>();
        Map<Character, Integer> b1 = new HashMap<>();
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(!a1.containsKey(c)) a1.put(c, 1);
            else a1.put(c, a1.get(c)+1);
        }
        for(int i = 0; i < b.length(); i++){
            char c = b.charAt(i);
            if(!b1.containsKey(c)) b1.put(c, 1);
            else b1.put(c, b1.get(c)+1);
        }
        if(b1.equals(a1)) System.out.println("The string is an Anagram");
        else System.out.println("The string is not an anagram");
    }
}