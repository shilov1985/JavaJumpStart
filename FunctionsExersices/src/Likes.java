import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Likes {

    /* Напишете метод за проследяване на харесванията на
     снимка, като предварително имаме досегашният
     брой на харесванията, при харесване може да
     напишем коментар, увеличава броя на харесванията.
         */
    public static int NUMBER_OF_LIKES = 5;

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(200, 200);
        frame.setResizable(false);
        frame.setLayout(null);
        JTextField likeField = new JTextField();
        likeField.setBounds(55, 15, 50, 30);
        likeField.setEditable(false);
        likeField.setText(String.valueOf(NUMBER_OF_LIKES));
        frame.add(likeField);

        JButton likeBtn = new JButton("Like");
        likeBtn.setBounds(5, 60, 80, 50);
        likeBtn.addActionListener(e -> {
            like();
            likeField.setText(String.valueOf(NUMBER_OF_LIKES));

        });
        frame.add(likeBtn);
        JButton unLikeBtn = new JButton("Unlike");
        unLikeBtn.setBounds(85, 60, 80, 50);
        unLikeBtn.addActionListener(e -> {
            unLike();
            likeField.setText(String.valueOf(NUMBER_OF_LIKES));

        });
        frame.add(unLikeBtn);

        frame.setVisible(true);


    }

    private static void unLike() {
        if (NUMBER_OF_LIKES >= 1) {
            NUMBER_OF_LIKES--;
        }

    }

    private static void like() {
        NUMBER_OF_LIKES++;
    }


}
