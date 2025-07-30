import java.util.*;
public class Lonely {
    public static void printLonely(ArrayList<Integer> list){
        int n = list.size();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLonely = true;
            for (int j = 0; j < n; j++) {
                if (i != j && (list.get(j) == list.get(i) - 1 || list.get(j) == list.get(i) + 1)) {
                    isLonely = false;
                    break;
                }
            }
            if (isLonely) {
                newList.add(list.get(i));
            }
        }
        System.out.println("Lonely numbers: " + newList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(6);
        list.add(5);
        printLonely(list);
    }
    
}
