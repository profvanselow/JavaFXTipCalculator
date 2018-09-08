package tip;

// TipCalculator.java
// Main application class that loads and displays the Tip Calculator's GUI.
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculator extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("TipCalculator.fxml"));

        Scene scene = new Scene(root); // attach scene graph to scene
        stage.setTitle("Tip Calculator"); // displayed in window's title bar
        stage.setScene(scene); // attach scene to stage
        stage.show(); // display the stage

        //GridPane grid = new GridPane();
        //grid.setAlignment(Pos.CENTER);

        //Scene scene = new Scene(grid, 300,300);
        //stage.setScene(scene);

    }

    public static void main(String[] args)
    {
        // create a TipCalculator object and call its start method
        launch(args);
    }
}


