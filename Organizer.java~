/* Name: Cristopher Alvarado and Miller Kahihu
 * Date: 05/24/16
 * CS 406 Final Project - Organizer File
 */ 

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
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
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollBar;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Organizer extends Application
{
    MenuBar mb;
    GridPane gp;
    List<List<String>> matchups;
    Label[][] lb;
    
    //Initialize Variables
    public void init()
    {
        
        mb = new MenuBar(); //MenuBar
        gp = new GridPane(); //GridPane
        lb = new Label[65][14];
        matchups = new ArrayList<List<String>>(); //For manual Bracket Input
    }
   /* public void makeMatchUp(String p1, String p2)
    {
        List<String> matchup = new ArrayList<String>();
        matchup.add(p1);
        matchup.add(p2);
    }
    public void makeBracket()
    {
        matchups.add(makeMatchUp("Sachin", "Cris"));
        
    } */
                                                  
    //Start method
    @Override
    public void start(Stage primary)
    {
        //Creates a GridPane and sets Horizontal/Vertical spacing.
        gp.setHgap(37);
        gp.setVgap(5);
        gp.setPadding(new Insets(5, 5, 5, 5));
        gp.setStyle("-fx-background-color: #4897D8;");
        //Creates Menus
        createMenus();
        
        //Create Labels & Label Code
        createLabels();
        labelCode();
    
        ScrollPane sp = new ScrollPane(gp);
        sp.setFitToHeight(true);
        
        BorderPane bp = new BorderPane(sp);
        bp.setPadding(new Insets(5));
        
        DropShadow dpS = new DropShadow();
        dpS.setOffsetX(2.0);
        dpS.setOffsetY(0.5);
        
        bp.setTop(mb);
        bp.setCenter(sp);
        
        Group root = new Group();
        Scene s = new Scene(bp, 1440, 900, Color.LIGHTCORAL);
        
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
    
    private void createLabels()
    {
        //Create a Double Array of Labels (in form of a Tournament Bracket)
        
        int k = 64;
        int i = 1;
        int count = 0;
        
        for (int c = 1; c < 14; c++)
        {
            if (c < 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("Col: " + c + "     " + "Row: " + r);
                    lb[r][c].setTextFill(Color.web("#2F3131"));
                    lb[r][c].setFont(new Font("Garamond", 8));
                    lb[r][c].setTextAlignment(TextAlignment.JUSTIFY);
                    lb[r][c].setStyle("-fx-background-color: #F8F1E5;\n" 
                                          + "-fx-border-style: solid;\n"
                                          + "-fx-border-color: #BCBABE;"
                                          + "-fx-border-width: 2;\n"
                                          + "-fx-border-insets: 0.5;\n");
                    //lb[r][c].setEffect(dpS);
                    gp.setConstraints(lb[r][c], c, (2 * (i * r)));
                    gp.getChildren().add(lb[r][c]);  
                }
                i++;
                k = k / 2;
                count += (k / 2);
            }
            else if(c == 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c] = new Label("Col: " + c + "     " + "Row: " + r);
                    lb[r][c].setTextFill(Color.web("#2F3131"));
                    lb[r][c].setFont(new Font("Garamond", 8));
                    lb[r][c].setTextAlignment(TextAlignment.JUSTIFY);
                    lb[r][c].setStyle("-fx-background-color: #F8F1E5;\n"
                                          + "-fx-border-style: solid;\n"
                                          + "-fx-border-color: #BCBABE;\n"
                                          + "-fx-border-width: 2;\n"
                                          + "-fx-border-insets: 0.5;\n");
                    //lb[r][c].setEffect(dpS);
                    gp.setConstraints(lb[r][c], c, (2 * (i + 1) * r));
                    gp.getChildren().add(lb[r][c]);  
                }
                i = c;
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
                    lb[r][c].setTextFill(Color.web("#2F3131"));
                    lb[r][c].setFont(new Font("Garamond", 8));
                    lb[r][c].setTextAlignment(TextAlignment.JUSTIFY);
                    lb[r][c].setStyle("-fx-background-color: #F8F1E5;\n"
                                          + "-fx-border-style: solid;\n"
                                          + "-fx-border-color: #BCBABE;"
                                          + "-fx-border-width: 2;\n"
                                          + "-fx-border-insets: 0.5;\n");
                    //lb[r][c].setEffect(dpS);
                    gp.setConstraints(lb[r][c], c, (2 * (i - 1) * r));
                    gp.getChildren().add(lb[r][c]);
                    
                }
                i--;
                count -= (k / 2);
                k = k * 2;
            }
        }
    }
    
    //Label Actions
    private void labelCode()
    {
        int k = 64;
        
        for (int c = 1; c < 14; c++)
        {
            if (c <= 7)
            {
                for (int r = 1; r < k+1; r++)
                {
                    lb[r][c].setOnMouseClicked( e -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("This is an important message!");
                        alert.showAndWait();
          
                    });
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
                    lb[r][c].setOnMouseClicked( e -> {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("This is an important message!");
                        alert.showAndWait();
          
                    });
                }
                k = k * 2;
            }
        }
        
        
                    
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
