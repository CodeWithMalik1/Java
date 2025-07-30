import java.util.ArrayList;
public class WaterTrap {
public static int storeWater(ArrayList<Integer> list, int start, int end) {
    int maxWater = 0;
    while (start < end) {
        int height = Math.min(list.get(start), list.get(end));
        int width = end - start;
        int currWater = height * width;
        maxWater = Math.max(maxWater, currWater);
        if (list.get(start) < list.get(end)) {
            start++;
        } else {
            end--;
        }
    }
    return maxWater;
}


    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(4);
        list.add(7);
        
        int result = storeWater(list, 0, list.size() - 1);
        System.out.println("Max water stored: " + result);
    }
    
}
