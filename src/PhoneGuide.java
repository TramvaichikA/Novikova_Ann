import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneGuide {
    private HashMap <String,List<String>> pg=new HashMap<>();
    private List <String > numberList;

    public void add(String lastName, String number) {
        if (pg.containsKey(lastName)) {
            numberList = pg.get(lastName);
            numberList.add(number);
            pg.put(lastName, numberList);
        } else {
            numberList = new ArrayList<>();
            numberList.add(number);
            pg.put(lastName, numberList);
        }
    }
    public List<String> get(String lastName) {

        return pg.get(lastName);
    }

}