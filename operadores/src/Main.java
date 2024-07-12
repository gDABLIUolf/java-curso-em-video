import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JLabel divisao;
    private JLabel resto;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double primeiroNumero = Double.parseDouble(textField1.getText());
                double segundoNumero = Double.parseDouble(textField2.getText());
                double resultadoDivisao = primeiroNumero / segundoNumero;
                double resultadoResto = primeiroNumero % segundoNumero;
                divisao.setText(String.valueOf(resultadoDivisao));
                resto.setText(String.valueOf(resultadoResto));
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
