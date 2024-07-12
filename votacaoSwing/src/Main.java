import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JButton possoVotarButton;
    private JLabel resultado;

    public Main() {
        setContentPane(contentPane);
        setModal(true);
        possoVotarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ano = Integer.parseInt(textField1.getText());
                int idade = 2024 - ano;
                if (idade < 16){
                    resultado.setText("Não vota!");
                } else{
                    if ((idade < 18) || (idade > 70)){
                        resultado.setText(("Voto opcional."));
                    } else {
                        resultado.setText(("Voto obrigatório!"));
                    }
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
