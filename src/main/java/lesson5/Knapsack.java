package lesson5;

//Ex.2
public class Knapsack {
    public static void main(String[] args) {
        int[] weight = new int[]{12, 2, 1, 1, 4};
        int[] price = new int[]{4, 2, 2, 1, 10};

        int knapsackWeight = 15;
        int size = weight.length;

        checkSet(weight, price, knapsackWeight, size);
    }

    public static int checkSet(int[] weight, int[] price, int knapsackWeight, int size) {
        if (size <= 0) {
            return 0;
        } else if (weight[size - 1] > knapsackWeight) {
            return checkSet(weight, price, knapsackWeight, size - 1);
        } else {
            return Math.max(checkSet(weight, price, knapsackWeight, size - 1), price[size -1] + checkSet(weight, price, knapsackWeight - weight[size -1], size - 1));
        }
    }
}
