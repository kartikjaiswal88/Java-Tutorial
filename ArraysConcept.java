public class ArraysConcept {
    public static void main(String[] args) {
        int arr[] = new int[5]; // Default value 0

        for (int i : arr) {
            // System.out.println(i);
        }

        int arr1[][] = new int[4][7];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int n[] : arr1) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
