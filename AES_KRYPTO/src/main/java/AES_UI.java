import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import java.util.Random;
public class AES_UI extends JFrame{


    private JPanel panel1;
    private JButton geyGenButton;
    private JTextField keyGenBox;
    private JTextField keyLoadBox;
    private JButton keyLoadButton;
    private JButton keySaveButton;
    private JTextField keySaveBox;
    private JButton rawFileOpenButton;
    private JTextField rawFileOpenBox;
    private JTextArea rawFileTextArea;
    private JButton cypherButton;
    private JButton decypherButton;
    private JTextField cypheredFileOpenBox;
    private JButton cypheredFileOpenButton;
    private JTextArea cypheredFileTextArea;
    private JTextField rawFileSaveBox;
    private JTextField cypheredFileSaveBox;
    private JButton rawFileSaveButton;
    private JButton cypheredFileSaveButton;


    public AES_UI(String AppName){
        super(AppName);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();


        geyGenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Prosty przyklad logiki dla guzika gdy chcemy zeby w okienku pojawily sie losowe liczby
                Random rand = new Random();

                int randomNum = rand.nextInt(100)+ 1;
                keyGenBox.setText(randomNum + "");


            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new AES_UI("Kodowanie_AES");

        frame.setSize(1200,800);
        frame.setResizable(false);
        frame.setVisible(true);







    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
