public class Dog extends Animal {
    private String name;
    static int countD = 0;

    public Dog(String name) {
        super();
        countD++;
        this.name = name;
    }
public String getName() {
        return name;
}
public  void setName(String name) {
        this.name = name;
}
    @Override
    public void run(int metr) {
        if (metr > 500) {
            System.out.println(name + " не умеет бегать больше 500 м");
        } else {
            System.out.println(name + " пробежала " + metr + " м");
        }
    }


    @Override
    public void swim(int metr) {
        if (metr > 10) {
            System.out.println("Собака не умеет плавать больше 10 м");
        } else {
            System.out.println("Собака проплыла " + metr + " м");
        }
    }

    static int getnD() {
        return countD;
    }

}
