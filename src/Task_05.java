import java.util.*;

public class Task_05 {
    static List<String> planets = List.of("Earth", "Pluto", "Venus", "Mars", "Mars", "Jupiter", "Pluto","Pluto","Venus");
    static List<ArrayList<String>> library = new ArrayList<>();
    public static void main(String[] args) {

//        int[] arr = new int[10];
//        String[] strArr = {"ajhgfo", "jgbaiwef"};
//        float[] floatArr = new float[] {1,2,3,4,5,6,7,8,9,10};
//        arr[0] = 1;
//        // создать новый массив большей длины
//        // скопировать из старого массива все
//        // вставить в новый массив
//
//        ArrayList<String> list = new ArrayList<>(1);
//        list.add("1");
//        list.add("2");
//        list.add("7");
//        list.add("5");
//        list.addAll(Arrays.asList(strArr));
//        List<String> sublist = list.subList(0, 2);
//        System.out.println(sublist);
//        System.out.println(list);
//        list.set(3, "8");
////        list.remove("5");
//        System.out.println(list);
//        System.out.println(list.size());
//
//        System.out.println(list.indexOf("1"));
//
//        String[] strArr2 = list.toArray(new String[list.size()]);
//
//        System.out.println(Arrays.toString(strArr2));
        System.out.println(getPlanetsWithCount(planets));

        System.out.println(getUniquePlanets(getPlanetsWithCount(planets)));
        joke();

        ArrayList<String> poetry = new ArrayList<>();
        poetry.add("Поэзия");
        poetry.add("Бородино");
        poetry.add("Евгений Онегин");

        addBooks(poetry);
        addBooks(poetry);

        System.out.println(library);
    }

    public static void addBooks(ArrayList<String> books) {
        library.add(books);
    }

    public static Map<String, Integer> getPlanetsWithCount(List<String> planets) {
        Map<String, Integer> result = new HashMap<>();

        Set<String> keys = result.keySet();

        for (String planet : planets) {
            int count = 0;
            if (!keys.contains(planet)) {
                result.put(planet, ++count);
            } else {
                Integer value = result.get(planet);
                value += 1;
                result.put(planet, value);
            }
        }
        return result;
    }

    public static Map<String, Integer> getUniquePlanets(Map<String, Integer> planets) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : planets.entrySet()) {
            if (entry.getValue() == 1) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    public static void joke() {

        ArrayList joke = new ArrayList<String>();

        joke.add("true");
        joke.add("ttt");
        joke.add(11);
        joke.add(12);

        for (int i = 0; i < joke.size(); i++) {
            if (joke.get(i) instanceof Integer) {
                joke.remove(i--);
            }
        }

        System.out.println(joke);

    }
}