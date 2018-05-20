package homeworks.one_dim_array;

public class Program {
    public static void main(String[] args) {
        int[] arr = new int[] { 9, 0, 8, 0, 1, 2, 4, 4, 5, 7, 8, 4, 3, 9, 2, 1, 7, 4, 6, 4, 1, 2};
        int[] counter = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }

        System.out.println("value\tcount");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);
        }
    }
}
