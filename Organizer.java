import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Organizer extends Application
{
    List<String> rankings;
    BorderPane bp;
    MenuBar mb;
    
    //Initialize Variables
    public void init()
    {
        rankings = new ArrayList<String>(); //List used to contain users elements
        bp = new BorderPane(); //BorderPane
        mb = new MenuBar(); //MenuBar
    }
    
    //Start method
    @Override
    public void start(Stage primary)
    {
        createMenus();
        
        bp.setTop(mb);
        
        Scene s = new Scene(bp, 400, 400);
        
        //Setting the stage
        primary.setScene(s);
        primary.setTitle("Ranking Organizer");
        primary.show();
    }
    
    //MenuBar code
    private void createMenus()
    {
        //File Menu
        Menu fileMenu = new Menu("File");
        
        //Ranking Menu
        Menu rankingMenu = new Menu("Ranking");
        MenuItem topTenItem = new MenuItem("Top Ten");
        MenuItem bracketItem = new MenuItem("Bracket");
        MenuItem hierarchyItem = new MenuItem("Hierarchy");
    }
    
    //
    
    //Main method
    public static void main(String[] args)
    {
        launch(args);
    }
}