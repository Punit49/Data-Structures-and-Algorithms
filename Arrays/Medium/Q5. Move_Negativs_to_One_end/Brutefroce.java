import java.util.ArrayList;
import java.util.List;

public class Brutefroce {
    public static ArrayList<Integer> moveNegatives(ArrayList<Integer> arr){
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < 0){
                negatives.add(arr.get(i));
            } else {
                positives.add(arr.get(i));
            }
        }

        negatives.addAll(positives);
        return negatives;
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, -3, -4, 2, -1, 10, -12));
        System.out.println(moveNegatives(arr));
    }
}
