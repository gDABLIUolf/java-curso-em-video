import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JButton contarButton;
    private JLabel lblContador;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contador = 0;
                String contagem = "";
                while (contador <5){
                    contagem += contador + " ";
                    contador++;
                }
                lblContador.setText(contagem);
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
