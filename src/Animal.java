public class Animal {
    static int nA = 0;


    Animal() {

        nA++;
    }

    void run(int metr) {
        System.out.println("Животное пробежало " + metr + " м");
    }

    void swim(int metr) {
        System.out.println("Животное проплыло " + metr + " м");
    }

    public static int getnA() {
        return nA;
    }

}
