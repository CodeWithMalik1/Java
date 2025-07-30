import java.util.*;;
public class PairsumRotate {
    public static boolean sumPair(ArrayList<Integer> list,int target){
        int n = list.size();
        int bp = -1;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        if (bp == -1) bp = n - 1; // If not rotated, set bp to last index
        int lp = (bp + 1) % n;
        int rp = bp;
        while (lp != rp) {
            int currSum = list.get(lp) + list.get(rp);
            if (currSum == target) return true;
            else if (currSum < target) lp = (lp + 1) % n;
            else rp = (n + rp - 1) % n;
        }
        return false;
    }
    public static void main(String[] args) {
        // int list[] = {6, 7, 2, 3, 4, 5};
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean found = sumPair(list, 11);
        System.out.println("Pair with sum 11 exists: " + found);
        
    }
    
}
