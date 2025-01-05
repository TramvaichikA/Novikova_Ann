public class Cat extends Animal {
    private String name;
    static int countC = 0;

    private boolean isFuul;


    public Cat(String name) {
        super();
        countC++;
        this.name = name;
        this.isFuul = false;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
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
    public void run(int metr) {
        if (metr > 200) {
            System.out.println(name + " не умеет бегать больше 200 м");
        } else {
            System.out.println(name + " пробежал " + metr + " м");
        }
    }

    @Override
    public void swim(int metr) {
        System.out.println("Коты не умеют плавать");
    }

    static int getnC() {
        return countC;
    }

}