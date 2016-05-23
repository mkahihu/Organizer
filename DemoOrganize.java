import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.TextInputDialog;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import javafx.scene.control.Alert;


public class DemoOrganize extends Application
{   
    //int i;
    //int j;
    //int k;
    //Label[][] lb;
    //GridPane gp;
    
    public void init()
    {
        //int i = 0;
        //int j = 0;
        //int k = 64;
        //Label[][] lb = new Label[7][127];
        //GridPane gp = new GridPane();
    }
    
    @Override
    public void start(Stage primary)
    {
        GridPane gp = new GridPane(); 
        gp.setHgap(25);
        gp.setVgap(5);
        
        Label[][] lb = new Label[7][127];
        int k = 32;
        
        for (int c = 1; c < 13; c++)
        {
            if (c <= 6)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[c][r] = new Label("#" + "C" + c + "R" + r);
                    lb[c][r].setTextFill(Color.BLACK);
                    gp.setConstraints(lb[c][r], c, r);
                    gp.getChildren().add(lb[c][r]);
                }
                k = k/2;  
            }
            else
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[c][r] = new Label("#" + "C" + c + "R" + r);
                    lb[c][r].setTextFill(Color.BLACK);
                    gp.setConstraints(lb[c][r], c, r);
                    gp.getChildren().add(lb[c][r]);
                }
                k = k * 2;
            }
        }
        
        
        
        
        Scene s = new Scene(gp, 900, 750, Color.WHITE);
 
        
        //Setting the stage
        primary.setScene(s);
        primary.setTitle("Tournament Bracket");
        primary.show();   
    }
}
