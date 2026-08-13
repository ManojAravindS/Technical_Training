public class reversing{
    public static void main(String[] args){
        String s = "Hello World";
        StringBuilder sb = new StringBuilder(s);
        // for(int i = s.length()-1; i > -1; i--){
        //     sb.append(s.charAt(i));
        // }
        System.out.println(sb.reverse().toString());
    }
}