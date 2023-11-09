
import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {
        goToGame();
    }

    void goToGame() {
        this.add(new GamePanel());
        // this.add(new JButton("DEVESH"));
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
