import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JButton verificarButton;
    private JLabel resultado;
    private JButton buttonOK;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = Integer.parseInt(textField1.getText());
                if (valor%2==0){
                    resultado.setText("Par");
                } else{
                    resultado.setText("Impar");
                }
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
