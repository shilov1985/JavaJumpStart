import javax.swing.*;
import java.awt.*;

public class BonusSystem {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bonus system");
        frame.setSize(260, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        SpringLayout lay = new SpringLayout();

        JPanel pan = new JPanel();
        pan.setLayout(lay);
        pan.setBackground(Color.white);


        JLabel salaryLabel = new JLabel("Въведете месечна заплата в лв.");
        pan.add(salaryLabel);

        JTextField salaryField = new JTextField("", 10);
        pan.add(salaryField);

        lay.putConstraint(SpringLayout.WEST, salaryLabel, 5, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, salaryLabel, 5, SpringLayout.NORTH, pan);


        lay.putConstraint(SpringLayout.WEST, salaryField, 5, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, salaryField, 20, SpringLayout.NORTH, salaryLabel);

        JLabel workYearsLabel = new JLabel("Въведете години трудов стаж в години");
        pan.add(workYearsLabel);

        JTextField workYearsField = new JTextField("", 6);
        pan.add(workYearsField);

        lay.putConstraint(SpringLayout.WEST, workYearsLabel, 5, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, workYearsLabel, 20, SpringLayout.NORTH, salaryField);


        lay.putConstraint(SpringLayout.WEST, workYearsField, 5, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, workYearsField, 20, SpringLayout.NORTH, workYearsLabel);

        JButton calcBtn = new JButton("Изчисли->");
        pan.add(calcBtn);
        lay.putConstraint(SpringLayout.WEST, calcBtn, 5, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, calcBtn, 25, SpringLayout.NORTH, workYearsField);

        JTextField resultField = new JTextField("", 12);
        pan.add(resultField);
        resultField.setEditable(false);
        lay.putConstraint(SpringLayout.WEST, resultField, 100, SpringLayout.WEST, pan);
        lay.putConstraint(SpringLayout.NORTH, resultField, 94, SpringLayout.NORTH, pan);

        calcBtn.addActionListener(e -> {
            String salaryFieldText = salaryField.getText();
            float salary = 0f;
            float workYears = 0f;
            try {
                salary = Float.valueOf(salaryFieldText);

            } catch (NumberFormatException ex) {
                salaryField.setText("Невалидни данни!");
            }
            String workYearsFieldText = workYearsField.getText();
            try {
                workYears = Float.valueOf(workYearsFieldText);
            } catch (NumberFormatException ex) {
                workYearsField.setText("Невалидни данни!");
            }


            float bonus = calcBonus(salary, workYears);
            String fBonus = String.format("%.2f", bonus);
            resultField.setText("Бонус= " + fBonus + " лв.");
        });
        frame.setContentPane(pan);
        frame.setVisible(true);

    }

    private static float calcBonus(float salary, float workYears) {


        float totalSalary = (workYears * 12) * salary;

        if (workYears > 5 && workYears <= 10) {

            return 5f / 100f * totalSalary;
        } else if (workYears > 10 && workYears <= 15) {

            return 7f / 100f * totalSalary;
        } else if (workYears > 15) {

            return 10f / 100f * totalSalary;
        }

        return 0.0f;
    }


}
