
public class Park {
    String name;
    int numAttraction;
    String rang;


    public Park(String name, int numAttraction, String rang) {
        this.name = name;
        this.numAttraction = numAttraction;
        this.rang = rang;
    }

    public class Attraction {
        String atName;
        String time;
        double cost;

        public Attraction(String _atName, String time, double cost) {
           this.atName = atName;
            this.time = time;
            this.cost = cost;
        }
    }

    public void someInfo() {
        System.out.println(name);
        System.out.println(numAttraction);
        System.out.println(rang);
    }
}

