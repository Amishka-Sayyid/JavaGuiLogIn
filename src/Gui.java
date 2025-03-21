import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void  main(String[] args){

        JFrame frame =new JFrame();
        JPanel panel =new JPanel();

//        frame setup
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

//        panel setup

        panel.setLayout(null);

        userLabel =new JLabel("user");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText =new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);


        passwordLabel =new JLabel("password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText =new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("log in");
        button.setBounds(10,80,80,25);
        button.addActionListener(new Gui());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        to check if button 1st works see if below will show on
//        console when button clicked.
//        System.out.println("button clicked");

        String user = userText.getText();
        String password = passwordText.getText();

        System.out.println(user + ", " + password);

        if(user.equals("amina") && password.equals("123")){
            success.setText("log in successful!!!");
        } else{
            success.setText("username/password incorrect.");
        }
    }
}
