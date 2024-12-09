public class Cat extends Animal {
    String name;
    static int nC = 0;

    private boolean isFuul;


    Cat(String name) {
        super();
        nC++;
        this.name = name;
        this.isFuul = false;


    }

    public void eat(Bowl bowl, int nFood) {
        if (bowl.decFood(nFood)) {
            this.isFuul = true;
            System.out.println(name + " сытый");
        } else {
            System.out.println("в миске мало еды");
        }
    }

    public boolean isFuul() {
        return isFuul;
    }


    @Override
    void run(int metr) {
        if (metr > 200) {
            System.out.println(name + " не умеет бегать больше 200 м");
        } else {
            System.out.println(name + " пробежал " + metr + " м");
        }
    }

    @Override
    void swim(int metr) {
        System.out.println("Коты не умеют плавать");
    }

    static int getnC() {
        return nC;
    }

}