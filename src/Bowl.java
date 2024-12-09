public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decFood(int nFood) {
        if (nFood <= 0) {
            System.out.println("Количество еды в миске не может быть меньше нуля");
            return false;
        }
        if (food >= nFood) {
            food -= nFood;
            return true;
        }
        System.out.println("Еды в миске мало");
        return false;
    }

    public void addFood(int nFood) {
        if (nFood > 0) {
            food += nFood;
            System.out.println("Добавили" + nFood + "еды");
        } else {
            System.out.println("Количество еды должно быть больше нуля");
        }

    }

    public int getFood() {
        return food;
    }

}
