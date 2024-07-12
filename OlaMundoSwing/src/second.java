import javax.swing.*;
import java.awt.event.*;

public class second extends JDialog {
    private JPanel contentPane;
    private JLabel aquiVaiAparecerALabel;
    private JButton cliqueEmMimButton;

    public second() {
        setContentPane(contentPane);
        setModal(true);

        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aquiVaiAparecerALabel.setText("Olá Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        second dialog = new second();
        dialog.pack();
        dialog.setVisible(true);
    }
}
