public class array {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 2},
            {3, 6, 8},
            {9, 12, 11},
            {3,4,5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
