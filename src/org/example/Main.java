package org.example;

import static java.lang.Integer.valueOf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[][] array1 = new String[][]{
                {"1", "m", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Сумма элементов массива равна " + arr2d(array1));

        } catch (org.example.MyArraySizeException e) {
            System.out.println(e);
        } catch (org.example.MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int arr2d(String[][] ar) throws org.example.MyArraySizeException, org.example.MyArrayDataException {
        int sum = 0;

        if (ar.length != 4) {
            throw new org.example.MyArraySizeException(String.format("размерность массива должна быть 4*4.   "));
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length != 4) {
                throw new org.example.MyArraySizeException(String.format("размерность массива должна быть 4*4.   "));
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                try {
                    sum += valueOf(ar[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println();
                    throw new org.example.MyArrayDataException(String.format("в ячейке " + "[" + i+"] " + "[" + j + "] массива присутствует не целое число "));
                }
            }
        }

        return sum;
    }


}