import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.stream.Collectors;

public class Assignment5SunSetView {
    public static void main(String[] args) {
        int[] buildings={3, 5, 4, 4, 3, 1, 3, 2};
        sunsetViews(buildings,"WEST").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        Stack<Integer> candidateBuildings=new Stack<>();
        int startIdx=0;
        int step=1;

        if(direction.equals("WEST")){startIdx= buildings.length-1; step=-1;}
        int  idx=startIdx;
        while (idx>=0 && idx< buildings.length){
            while(!candidateBuildings.isEmpty()&& buildings[candidateBuildings.peek()]<=buildings[idx]){
                candidateBuildings.pop();
            }
            candidateBuildings.push(idx);
            idx+=step;
        }
        Collections.reverse(candidateBuildings);
        return new ArrayList<Integer>(candidateBuildings);
    }
}
