import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextInputDialog;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class startDemo extends Application
{

    @Override
    public void start(Stage primary)
    {
        
        GridPane gp = new GridPane(); 
        gp.setHgap(37);
        gp.setVgap(1);
        
        Label[][] lb = new Label[65][14];
        int k = 64;
        int count = 0;
        
        for (int c = 1; c < 14; c++)
        {
            if (c < 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("Col: " + c + "     " + "Row: " + r);
                    lb[r][c].setTextFill(Color.BLACK);
                    lb[r][c].setFont(new Font("Garamond", 9));
                    gp.setConstraints(lb[r][c], c, (count + r));
                    gp.getChildren().add(lb[r][c]);  
                }
                k = k / 2;
                count += (k / 2);
            }
            else if(c == 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("Col: " + c + "     " + "Row: " + r);
                    lb[r][c].setTextFill(Color.BLACK);
                    lb[r][c].setFont(new Font("Garamond", 9));
                    gp.setConstraints(lb[r][c], c, (count + r));
                    gp.getChildren().add(lb[r][c]);  
                }
                k = k / 2;
                if(k == 0)
                {
                    k = 2;
                }
            }
            else if(c > 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("Col: " + c + "     " + "Row: " + r);
                    lb[r][c].setTextFill(Color.BLACK);
                    lb[r][c].setFont(new Font("Garamond", 9));
                    gp.setConstraints(lb[r][c], c, (count + r));
                    gp.getChildren().add(lb[r][c]);
                }
                count -= (k / 2);
                k = k * 2;
            }
        }
        
        Scene s = new Scene(gp, 1440, 900, Color.WHITE);
         
        //Setting the stage
        primary.setScene(s);
        primary.setTitle("Tournament Bracket");
        primary.show();
    }
}