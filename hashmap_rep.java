import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashMap;
public class hashmap_rep{
    public static void main(String[] ar){
        Map<Character, Integer> hp = new HashMap<>();
        String s = "Hello World";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!hp.containsKey(c)){
                hp.put(c, 1);
                sb.append(c);
            } 
            else if(hp.get(c) == 2){
                sb.append(c);
            }else {
                hp.put(c, hp.get(c) + 1);
            }
        }
        System.out.println(sb.toString());
    }
}