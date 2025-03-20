public class Search2DArray {
    // brute force approach
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 3, 4 },
                { 3, 6, 5 }
        };
        int target = 6;
        searchInMatrix(matrix, target);
    }

    static void searchInMatrix(int[][] matrix, int target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    System.out.println("found at(" + row + "," + col + ")");
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}
