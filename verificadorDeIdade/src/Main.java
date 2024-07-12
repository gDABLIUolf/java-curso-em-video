import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JButton calcularIdadeButton;
    private JLabel lblSituacao;
    private JLabel lblIdade;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        calcularIdadeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(textField1.getText());
                int idade = 2024 - ano;
                lblIdade.setText(String.valueOf(idade));
                String situacao = ((idade>=16 && idade<18)||(idade>70)) ? "Voto opcional" : "Voto obrigatório";
                lblSituacao.setText(situacao);
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
