//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat KotO = new Cat("Кот Омлет ");
        Cat KotG = new Cat("Кот Гамлет ");
        Dog DogMakaronina = new Dog("Собака Макаронина ");
        Dog DogStremyanka = new Dog("Собака Стремянка ");

        KotO.run(150);
        KotG.run(250);
        DogStremyanka.run(550);
        DogMakaronina.run(30);

        KotO.swim(20);
        KotG.swim(6000);
        DogMakaronina.swim(9);
        DogStremyanka.swim(25);
        System.out.println("Общее количество животных " + (Animal.getnA()));
        System.out.println("Количество котов " + Cat.getnC());
        System.out.println("Количество собак " + Dog.getnD());


        System.out.println("Задание 2");
        Bowl bowl = new Bowl(30);
        Cat[] cats = {KotO, KotG};
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
            System.out.println(cat.name + "сытый");
        }
        System.out.println("Остаток еды в миске " + bowl.getFood());
        bowl.addFood(20);
        System.out.println("Добавили еды. Теперь в миске " + bowl.getFood());

        for (Cat cat : cats) {
            if (!cat.isFuul()) {
                cat.eat(bowl, 10);
                System.out.println(cat.name + " сытый ");

            }
        }
        System.out.println("В миске осталось " + bowl.getFood());

        System.out.println("Задание 3");
        Shape circle = new Circle(2, "Желтый", "Зеленый");
        System.out.println("Свойства круга: ");
        circle.printFeatures();
        System.out.println();

        Shape restangle = new Restangle(6, 3, "Красный", "Коричневый");
        System.out.println("Свойства прямоугольника: ");
        restangle.printFeatures();
        System.out.println();
        Shape triangle = new Triangle(4, 4, 4, "Красный", "Синий");
        System.out.println("Свойства треугольника: ");
        triangle.printFeatures();
    }


}