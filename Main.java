package sample;
import com.sun.javafx.stage.EmbeddedWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.media.MediaPlayer;
import static javafx.fxml.FXMLLoader.load;

public class Main extends Application {
    //    @Override
   private static Scene sc;
   static Stage window;
    public void start(Stage primaryStage) throws Exception{
        sc= load(getClass().getResource("Main.fxml"));
        window=primaryStage;
        window.setTitle("Colour Switch Game");
        String path = "src/Ipsi.mp3";
        Media media = new Media(new File(path).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);

        window.setMaximized(true);
        window.setScene(sc);
        window.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

