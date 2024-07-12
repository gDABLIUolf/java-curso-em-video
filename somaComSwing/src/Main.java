import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel lblSoma;
    private JButton button1;
    private JLabel resultado;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int primeiroNumero = Integer.parseInt(textField1.getText());
                int segundoNumero = Integer.parseInt(textField2.getText());
                resultado.setText(String.valueOf(primeiroNumero + segundoNumero));
            }
        });
    }

    public static void main(String[] args) {
        Main dialog = new Main();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
