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
import javafx.scene.paint.Color;
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
        topTenItem.setOnAction( e -> {
            topTen();
        });
        MenuItem bracketItem = new MenuItem("Bracket");
        MenuItem hierarchyItem = new MenuItem("Hierarchy");
    }
    
    private GridPane topTen()
    {
        GridPane gp = new GridPane();
        Label lb1 = new Label("#1");
        Label lb2 = new Label("#2");
        Label lb3 = new Label("#3");
        Label lb4 = new Label("#4");
        Label lb5 = new Label("#5");
        Label lb6 = new Label("#6");
        Label lb7 = new Label("#7");
        Label lb8 = new Label("#8");
        Label lb9 = new Label("#9");
        Label lb10 = new Label("#10");
        
        //Colored Text
        lb1.setTextFill(Color.BLACK);
        lb2.setTextFill(Color.BLACK);
        lb3.setTextFill(Color.BLACK);
        lb4.setTextFill(Color.BLACK);
        lb5.setTextFill(Color.BLACK);
        lb6.setTextFill(Color.BLACK);
        lb7.setTextFill(Color.BLACK);
        lb8.setTextFill(Color.BLACK);
        lb9.setTextFill(Color.BLACK);
        lb10.setTextFill(Color.BLACK);
        
        gp.getChildren().addAll(lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10);
        return gp;
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
