import java.util.HashMap;
import java.util.Map;

public class Assignment6FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingChar("a green apple"));
    }
    public static char findFirstNonRepeatingChar(String str){
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        var chars=str.toCharArray();
        for(Character ch: chars) {
            if (map.containsKey(ch)) {
                count=map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch,1);
            }

        }for(Character ch: chars){
            if (map.get(ch)==1) return ch;
        }
        return Character.MIN_VALUE;
    }

}
