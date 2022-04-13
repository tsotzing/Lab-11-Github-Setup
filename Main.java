import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        // create and set up the window.
        JFrame frame = new JFrame("Encrypt Cipher");
        JPanel fieldsPanel = new JPanel();
        JPanel buttonPane = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fieldsPanel.setLayout(new BoxLayout(fieldsPanel, BoxLayout.PAGE_AXIS));
        buttonPane.setLayout(new FlowLayout());

        // label setup
        JLabel label = new JLabel("Filename");
        frame.getContentPane().add(label);
        JTextField filename = new JTextField();
        filename.setPreferredSize(new Dimension(250, 40));

        JLabel label2 = new JLabel("Key");
        frame.getContentPane().add(label2);
        JTextField key = new JTextField();
        key.setPreferredSize(new Dimension(250, 40));

        // button setup
        JButton encrypt = new JButton("Encrypt");
        encrypt.addActionListener(new ButtonListener());
        frame.getContentPane().add(encrypt);

        JButton decrypt = new JButton("Decrypt");
        decrypt.addActionListener(new ButtonListener());
        frame.getContentPane().add(decrypt);


        fieldsPanel.add(label);
        fieldsPanel.add(filename);

        fieldsPanel.add(label2);
        fieldsPanel.add(key);

        buttonPane.add(encrypt);
        buttonPane.add(decrypt);

        frame.add(fieldsPanel, BorderLayout.PAGE_START);
        frame.add(buttonPane, BorderLayout.PAGE_END);

        frame.pack();
        frame.setVisible(true);

    }


    static class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == encrypt) {
                int shiftKey = Integer.parseInt(key.getText());
                Encrypter ec = new Encrypter();
                ec.encrypt(shiftKey);
            } else {
                int shiftKey = Integer.parseInt(key.getText());
                Encrypter dc = new Encrypter();
                dc.decrypt(shiftKey);
            }
        }
    }
}


