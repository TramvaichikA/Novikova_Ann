public abstract class Animal {
    static int countA = 0;

    public Animal() {
        countA++;
    }

    public abstract void run(int metr) ;
    /*{
        System.out.println("Животное пробежало " + metr + " м");
    }
*/
    public abstract void swim(int metr);
    /*-{
        System.out.println("Животное проплыло " + metr + " м");
    }
*/
    public static int getnA() {
        return countA;
    }

}
