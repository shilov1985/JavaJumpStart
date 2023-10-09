import java.util.HashMap;
import java.util.Map;

public class Students {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, Integer> studentsData = new HashMap<String, Integer>();
        studentsData.put("Иванчо    ", 2);
        studentsData.put("Ани       ", 5);
        studentsData.put("Марийка   ", 6);
        studentsData.put("Пенчо     ", 4);
        studentsData.put("Бориславчо", 5);
        System.out.println("___________________________________");
        for (String student : studentsData.keySet()) {
            System.out.printf("| Ученик: %s | Оценка: %d  |\n", student,
                    studentsData.get(student));
            System.out.println("|_________________________________|");
        }

    }

}
