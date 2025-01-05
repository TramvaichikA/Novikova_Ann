import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {

        String[][] array1 = new String[][]{
                {"1", "8", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + arr2d(array1));

        } catch (MyArraySizeException  | MyArrayDataException e)
        {
            System.out.println(e);
        }
    }

    private static int arr2d(String[][] ar) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (ar.length != 4) {
            throw new MyArraySizeException(String.format("размерность массива должна быть 4*4.   "));
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length != 4) {
                throw new MyArraySizeException(String.format("размерность массива должна быть 4*4.   "));
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                try {
                    sum += valueOf(ar[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println();
                    throw new MyArrayDataException(String.format("в ячейке " + "[" + i+"] " + "[" + j + "] массива присутствует не целое число "));
                }
            }
        }

        return sum;
    }


}