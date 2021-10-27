package arrayofarrays;

public class ArrayOfArrays {

        public void printArrayOfArrays(int[][] a) {
            for (int itemA[] : a) {
                for (int itemAoA : itemA)
                System.out.print(itemAoA);
                System.out.println(" ");
            }
        }

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] arrays = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        arrayOfArrays.printArrayOfArrays(arrays);

    }



}
