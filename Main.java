import telas.Janela;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Janela().setVisible(true));
    }
}
