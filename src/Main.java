
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        System.out.println("1. Создать массив и подсчитать дубликаты");
        Map<String, Integer> arrayMap=new HashMap<>();
        String [] arr = {"Moscow", "Rostov", "Murmansk","Tula", "Habarovsk",
                "Rostov", "Reutov", "Kaluga", "Voroneg", "Sankt-Peterburg",
                "Moscow", "Stupino", "Korolev", "Moscow"};
        for (int i = 0; i < arr.length; i++) {
            if (arrayMap.containsKey(arr[i]))
                arrayMap.put(arr[i], arrayMap.get(arr[i]) + 1);
            else
                arrayMap.put(arr[i], 1);
        }
        System.out.println("Массив из уникальных значений: \n" + arrayMap);

        System.out.println();

        System.out.println("2. Создать телефонный справочник. Найдем телефоны, принадлежащие следующим фамилиям: Smirnova и Ivanov");

        PhoneGuide guide = new PhoneGuide();
        guide.add("Sharova", "89990151226");
        guide.add("Ivanov", "8926145327");
        guide.add("Petrov", "8916150152");
        guide.add("Suvorov", "8916450002");
        guide.add("Romanov", "8903409993");
        guide.add("Smirnov", "89102117711");
        guide.add("Ivanov", "89263201920");
        guide.add("Smirnova", "89038003115");
        guide.add("Potapov", "89265402542");

        System.out.println("Smirnova: " + guide.get("Smirnova"));
        System.out.println("Ivanov: " + guide.get("Ivanov"));

    }


}