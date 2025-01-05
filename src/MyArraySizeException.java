
public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(String message) {
        super("Ошибка d размерности массива:   " + message);
    }

}
