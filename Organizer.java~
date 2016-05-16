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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Organizer extends Application
{
    List<String> top64;
    List<String> top32;
    List<String> top16;
    List<String> top8;
    List<String> top4;
    List<String> top2;
    List<String> top1;
    GridPane gp;
    MenuBar mb;
    
    //Initialize Variables
    public void init()
    {
        top64 = new ArrayList<String>(); //List used to contain users top 64 in bracket
        top32 = new ArrayList<String>(); //List used to contain users top 32 in bracket
        top16 = new ArrayList<String>(); //List used to contain users top 16 in bracket
        top8 = new ArrayList<String>(); //List used to contain users top 8 in bracket
        top4 = new ArrayList<String>(); //List used to contain users top 4 in bracket
        top2 = new ArrayList<String>(); //List used to contain users top 2 in bracket
        top1 = new ArrayList<String>(); //List used to contain users winner in bracket
        gp = new GridPane(); //Gridpane
        mb = new MenuBar(); //MenuBar
    }
    
    //Start method
    @Override
    public void start(Stage primary)
    {
        createMenus();
        createLabels();
        
        Scene s = new Scene(gp, 400, 400, Color.WHITESMOKE);
 
        
        //Setting the stage
        primary.setScene(s);
        primary.setTitle("Bracket");
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
            topTen();
        });
    }
    
    private void createLabels()
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
        Label lb11 = new Label("#11");
        Label lb12 = new Label("#12");
        Label lb13 = new Label("#13");
        Label lb14 = new Label("#14");
        Label lb15 = new Label("#15");
        Label lb16 = new Label("#16");
        Label lb17 = new Label("#17");
        Label lb18 = new Label("#18");
        Label lb19 = new Label("#19");
        Label lb20 = new Label("#20");
        Label lb21 = new Label("#21");
        Label lb22 = new Label("#22");
        Label lb23 = new Label("#23");
        Label lb24 = new Label("#24");
        Label lb25 = new Label("#25");
        Label lb26 = new Label("#26");
        Label lb27 = new Label("#27");
        Label lb28 = new Label("#28");
        Label lb29 = new Label("#29");
        Label lb30 = new Label("#30");
        Label lb31 = new Label("#31");
        Label lb32 = new Label("#32");
        Label lb33 = new Label("#33");
        Label lb34 = new Label("#34");
        Label lb35 = new Label("#35");
        Label lb36 = new Label("#36");
        Label lb37 = new Label("#37");
        Label lb38 = new Label("#38");
        Label lb39 = new Label("#39");
        Label lb40 = new Label("#40");
        Label lb41 = new Label("#41");
        Label lb42 = new Label("#42");
        Label lb43 = new Label("#43");
        Label lb44 = new Label("#44");
        Label lb45 = new Label("#45");
        Label lb46 = new Label("#46");
        Label lb47 = new Label("#47");
        Label lb48 = new Label("#48");
        Label lb49 = new Label("#49");
        Label lb50 = new Label("#50");
        Label lb51 = new Label("#51");
        Label lb52 = new Label("#52");
        Label lb53 = new Label("#53");
        Label lb54 = new Label("#54");
        Label lb55 = new Label("#55");
        Label lb56 = new Label("#56");
        Label lb57 = new Label("#57");
        Label lb58 = new Label("#58");
        Label lb59 = new Label("#59");
        Label lb60 = new Label("#60");
        Label lb61 = new Label("#61");
        Label lb62 = new Label("#62");
        Label lb63 = new Label("#63");
        Label lb64 = new Label("#64");
        Label lb65 = new Label("#65");
        Label lb66 = new Label("#66");
        Label lb67 = new Label("#67");
        Label lb68 = new Label("#68");
        Label lb69 = new Label("#69");
        Label lb70 = new Label("#70");
        Label lb71 = new Label("#71");
        Label lb72 = new Label("#72");
        Label lb73 = new Label("#73");
        Label lb74 = new Label("#74");
        Label lb75 = new Label("#75");
        Label lb76 = new Label("#76");
        Label lb77 = new Label("#77");
        Label lb78 = new Label("#78");
        Label lb79 = new Label("#79");
        Label lb80 = new Label("#80");
        Label lb81 = new Label("#81");
        Label lb82 = new Label("#82");
        Label lb83 = new Label("#83");
        Label lb84 = new Label("#84");
        Label lb85 = new Label("#85");
        Label lb86 = new Label("#86");
        Label lb87 = new Label("#87");
        Label lb88 = new Label("#88");
        Label lb89 = new Label("#89");
        Label lb90 = new Label("#90");
        Label lb91 = new Label("#91");
        Label lb92 = new Label("#92");
        Label lb93 = new Label("#93");
        Label lb94 = new Label("#94");
        Label lb95 = new Label("#95");
        Label lb96 = new Label("#96");
        Label lb97 = new Label("#97");
        Label lb98 = new Label("#98");
        Label lb99 = new Label("#99");
        Label lb100 = new Label("#100");
        Label lb101 = new Label("#101");
        Label lb102 = new Label("#102");
        Label lb103 = new Label("#103");
        Label lb104 = new Label("#104");
        Label lb105 = new Label("#105");
        Label lb106 = new Label("#106");
        Label lb107 = new Label("#107");
        Label lb108 = new Label("#108");
        Label lb109 = new Label("#109");
        Label lb110 = new Label("#110");
        Label lb111 = new Label("#111");
        Label lb112 = new Label("#112");
        Label lb113 = new Label("#113");
        Label lb114 = new Label("#114");
        Label lb115 = new Label("#115");
        Label lb116 = new Label("#116");
        Label lb117 = new Label("#117");
        Label lb118 = new Label("#118");
        Label lb119 = new Label("#119");
        Label lb120 = new Label("#120");
        Label lb121 = new Label("#121");
        Label lb122 = new Label("#122");
        Label lb123 = new Label("#123");
        Label lb124 = new Label("#124");
        Label lb125 = new Label("#125");
        Label lb126 = new Label("#126");
        Label lb127 = new Label("#127");
        
        
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
