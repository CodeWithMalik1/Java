import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int weight[] = {30, 20, 10};
        int value[] = {120, 100, 60};
        int maxWeight = 50;
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int remainingWeight = maxWeight;
        double finalVal = 0.0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (remainingWeight >= weight[idx]) {
                finalVal += value[idx];
                remainingWeight -= weight[idx];
            } else {
                finalVal += ratio[i][1] * remainingWeight;
                break;
            }
        }

        System.out.println(finalVal);
    }
}