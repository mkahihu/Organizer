/* Name: Cristopher Alvarado and Miller Kahihu
 * Date: 05/24/16
 * CS 406 Final Project - Organizer File
 */ 

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


public class Organizer extends Application
{
    BorderPane bp;
    MenuBar mb;
    
    //Initialize Variables
    public void init()
    {
        
        bp = new BorderPane(); //BorderPane
        mb = new MenuBar(); //MenuBar
    }
    
    //Start method
    @Override
    public void start(Stage primary)
    {
        createMenus();
        
        GridPane gp = new GridPane(); 
        gp.setHgap(25);
        gp.setVgap(5);
        
        Label[][] lb = new Label[65][14];
        int k = 64;
        
        for (int c = 1; c < 14; c++)
        {
            if (c <= 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("#" + "C" + c + "R" + r);
                    lb[r][c].setTextFill(Color.BLACK);
                    gp.setConstraints(lb[r][c], c, r);
                    gp.getChildren().add(lb[r][c]);
                }
                k = k/2;
            }
            if(k == 0)
            {
                k = 2;
            }
            else if( c > 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("#" + "C" + c + "R" + r);
                    lb[r][c].setTextFill(Color.BLACK);
                    gp.setConstraints(lb[r][c], c, r);
                    gp.getChildren().add(lb[r][c]);
                }
                k = k * 2;
            }
        }
            
            bp.setTop(mb);
            bp.setCenter(gp);
            
            Scene s = new Scene(bp, 900, 750, Color.WHITE);
            
            
            //Setting the stage
            primary.setScene(s);
            primary.setTitle("Tournament Bracket");
            primary.show();
    
    }
    
    //MenuBar code
    private void createMenus()
    {
        //File Menu
        Menu fileMenu = new Menu("File");
        
        //Ranking Menu
        Menu bracketMenu = new Menu("Bracket");
        MenuItem addItem = new MenuItem("Add...");
        addItem.setOnAction( e -> {
            /*TextInputDialog dialogNumber = new TextInputDialog();
             dialogNumber.setTitle("Text Input Dialog");
             dialogNumber.setHeaderText("Look, a Text Input Dialog");
             dialogNumber.setContentText("Please enter your name:");*/
            String input = JOptionPane.showInputDialog(this  ,"Enter in some text:");
            
        });
        bracketMenu.getItems().addAll(addItem);
        
        mb.getMenus().addAll(fileMenu, bracketMenu);
    }
    
    //Main method
    public static void main(String[] args)
    {
        launch(args);
    }
}
///////////////////////////ALIEN METHOD////////////////////////////////////
/*public class Player() 
 {
 private Long id;
 private String name;
 private Integer scores;
 //getter setter
 }
 private Player rankItem()
 List<Player> participants = new ArrayList<Player>() 
 {
 {
 add(new Player(1L, "a", 5));
 add(new Player(2L, "b", 7));
 add(new Player(3L, "c", 8));
 add(new Player(4L, "d", 9));
 add(new Player(5L, "e", 3));
 add(new Player(6L, "f", 8));
 }
 };
 int[] score = {Integer.MIN_VALUE};
 int[] number = {0};
 int[] rank = {0};
 List<Ranking> ranking = participants.stream()
 .sorted((a, b) -> b.getScores() - a.getScores())
 .map(p -> {
 ++number[0];
 if (score[0] != p.getScores()) rank[0] = number[0];
 return new Ranking(rank[0], score[0] = p.getScores());
 })
 // .distinct() // if you want to remove duplicate rankings.
 .collect(Collectors.toList());
 System.out.println(ranking);
 */
