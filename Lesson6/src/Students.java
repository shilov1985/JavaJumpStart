import java.util.HashMap;
import java.util.Map;

public class Students {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Map<String, Integer> studentsData = new HashMap<String, Integer>();
        studentsData.put("������    ", 2);
        studentsData.put("���       ", 5);
        studentsData.put("�������   ", 6);
        studentsData.put("�����     ", 4);
        studentsData.put("����������", 5);
        System.out.println("___________________________________");
        for (String student : studentsData.keySet()) {
            System.out.printf("| ������: %s | ������: %d  |\n", student,
                    studentsData.get(student));
            System.out.println("|_________________________________|");
        }

    }

}
