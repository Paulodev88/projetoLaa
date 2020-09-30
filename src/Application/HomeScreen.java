package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreen extends Application {


    public void start(Stage primaryStage) throws Exception{



        primaryStage.setTitle("LAA");

        Parent fxmlMain = FXMLLoader.load(getClass().getResource("../View/HomeScreen.fxml"));
        Scene mainScene = new Scene(fxmlMain, 600, 400);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


}
