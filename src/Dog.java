public class Dog extends Animal {
    String name;
    static int nD = 0;

    Dog(String name) {
        super();
        nD++;
        this.name = name;
    }

    @Override
    void run(int metr) {
        if (metr > 500) {
            System.out.println(name + " не умеет бегать больше 500 м");
        } else {
            System.out.println(name + " пробежала " + metr + " м");
        }
    }


    @Override
    void swim(int metr) {
        if (metr > 10) {
            System.out.println("Собака не умеет плавать больше 10 м");
        } else {
            System.out.println("Собака проплыла " + metr + " м");
        }
    }

    static int getnD() {
        return nD;
    }

}
