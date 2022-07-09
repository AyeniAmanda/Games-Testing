public class GameFrame {
    private GameWindow gameWindow;
    private GamePanel gamePanel;


    public GameFrame(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);

    }
}
