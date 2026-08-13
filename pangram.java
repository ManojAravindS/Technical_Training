import java.util.Map;
import java.util.HashMap;
public class pangram{
    public static void main(String[] a){
        String s = "the quick brown fox jumps over lazy dog";
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') continue;
            else if(!hm.containsKey(c)) hm.put(c, 1);
            else hm.put(c,hm.get(c)+1);
        }
        else{
            for(char x: hm.keySet()){
                if(hm.get(x) == 0){
                    System.out.println("The sentence is not a pangram");
                    return ;
                }
            }
            System.out.println("THe sentence is a pangram");
        }
    }
}