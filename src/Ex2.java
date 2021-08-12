import javax.swing.*;

public class Ex2 {

    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor de B:"));

        int r = a + b;

        JOptionPane.showMessageDialog(null,"Soma: " + r);
    }
}
