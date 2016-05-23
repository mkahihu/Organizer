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
    List<String> top64;
    List<String> top32;
    List<String> top16;
    List<String> top8;
    List<String> top4;
    List<String> top2;
    List<String> top1;
   // Label[][] leftBrack64;
    //Label[][] leftBrack32;
    //Label[][] leftBrack16;
    //Label[][] leftBrack8;
    //Label[][] leftBrack4;
    //Label[][] leftBrack2;
    //Label[][] rightBrack2;
    //Label[][] rightBrack4;
    //Label[][] rightBrack8;
    //Label[][] rightBrack16;
    //Label[][] rightBrack32;
    //Label[][] rightBrack64;

    BorderPane bp;
    //GridPane gp;
    MenuBar mb;
    
    //Initialize Variables
    public void init()
    {
        top64 = new ArrayList<String>(64); //List used to contain users top 64 in bracket
        top32 = new ArrayList<String>(32); //List used to contain users top 32 in bracket
        top16 = new ArrayList<String>(16); //List used to contain users top 16 in bracket
        top8 = new ArrayList<String>(8); //List used to contain users top 8 in bracket
        top4 = new ArrayList<String>(4); //List used to contain users top 4 in bracket
        top2 = new ArrayList<String>(2); //List used to contain users top 2 in bracket
        top1 = new ArrayList<String>(1); //List used to contain users winner in bracket
        /*
        leftBrack64 = new Label[][];
        leftBrack32 = new Label[][];
        leftBrack16 = new Label[][];
        leftBrack8 = new Label[][];
        leftBrack4 = new Label[][];
        leftBrack2 = new Label[][];
        rightBrack2 = new Label[][];
        rightBrack4 = new Label[][];
        rightBrack8 = new Label[][];
        rightBrack16 = new Label[][];
        rightBrack32 = new Label[][];
        rightBrack64 = new Label[][];
            */
        bp = new BorderPane(); //BorderPane
        //gp = new GridPane(); //Gridpane
        mb = new MenuBar(); //MenuBar
    }
    
    //Start method
    @Override
    public void start(Stage primary)
    {
        bp.setTop(mb);
        fillLists();
        createMenus();
        
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
        
        bp.setCenter(gp);
        
        Scene s = new Scene(bp, 900, 750, Color.WHITE);
 
        
        //Setting the stage
        primary.setScene(s);
        primary.setTitle("Tournament Bracket");
        primary.show();
    }
    
    //List code
    private void fillLists()
    {
        for(int i = 0; i < 64; i++)
        {
            top64.add(i,"empty");
        }
        for(int i = 0; i < 32; i++)
        {
            top32.add(i,"empty");
        }
        for(int i = 0; i < 16; i++)
        {
            top16.add(i,"empty");
        }
        for(int i = 0; i < 8; i++)
        {
            top8.add(i,"empty");
        }
        for(int i = 0; i < 4; i++)
        {
            top4.add(i,"empty");
        }
        for(int i = 0; i < 2; i++)
        {
            top2.add(i,"empty");
        }
        for(int i = 0; i < 1; i++)
        {
            top1.add(i,"empty");
        }
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
    /*
    private void createLabels()
    {
        GridPane gp = new GridPane();
        gp.setHgap(5);
        gp.setVgap(5);
        
        Label[][] lb = new Label[7][127];
        for (int i = 0; i < 7; i++)
         {
            int j = 0;
            while(j < 64)
            {
                lb[i][j] = new Label("#" + i + j);
                lb[i][j].setTextFill(Color.BLACK);
                gp.setConstraints(lb[i][j], i, j);
                gp.getChildren().add(lb[i][j]);
                j++;
            }
        }
         
        /First Level Brackets
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
        
        //Second level brackets
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
        
        //Third Level Brackets
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
        
        //Fourth Level Brackets
        Label lb113 = new Label("#113");
        Label lb114 = new Label("#114");
        Label lb115 = new Label("#115");
        Label lb116 = new Label("#116");
        Label lb117 = new Label("#117");
        Label lb118 = new Label("#118");
        Label lb119 = new Label("#119");
        Label lb120 = new Label("#120");
        
        //Fifth Level Brackets
        Label lb121 = new Label("#121");
        Label lb122 = new Label("#122");
        Label lb123 = new Label("#123");
        Label lb124 = new Label("#124");
        
        //Sixth Level Brackets
        Label lb125 = new Label("#125");
        Label lb126 = new Label("#126");
        
        //Seventh Level Brackets
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
        lb11.setTextFill(Color.BLACK);
        lb12.setTextFill(Color.BLACK);
        lb13.setTextFill(Color.BLACK);
        lb14.setTextFill(Color.BLACK);
        lb15.setTextFill(Color.BLACK);
        lb16.setTextFill(Color.BLACK);
        lb17.setTextFill(Color.BLACK);
        lb18.setTextFill(Color.BLACK);
        lb19.setTextFill(Color.BLACK);
        lb20.setTextFill(Color.BLACK);
        lb21.setTextFill(Color.BLACK);
        lb22.setTextFill(Color.BLACK);
        lb23.setTextFill(Color.BLACK);
        lb24.setTextFill(Color.BLACK);
        lb25.setTextFill(Color.BLACK);
        lb26.setTextFill(Color.BLACK);
        lb27.setTextFill(Color.BLACK);
        lb28.setTextFill(Color.BLACK);
        lb29.setTextFill(Color.BLACK);
        lb30.setTextFill(Color.BLACK);
        lb31.setTextFill(Color.BLACK);
        lb32.setTextFill(Color.BLACK);
        lb33.setTextFill(Color.BLACK);
        lb34.setTextFill(Color.BLACK);
        lb35.setTextFill(Color.BLACK);
        lb36.setTextFill(Color.BLACK);
        lb37.setTextFill(Color.BLACK);
        lb38.setTextFill(Color.BLACK);
        lb39.setTextFill(Color.BLACK);
        lb40.setTextFill(Color.BLACK);
        lb41.setTextFill(Color.BLACK);
        lb42.setTextFill(Color.BLACK);
        lb43.setTextFill(Color.BLACK);
        lb44.setTextFill(Color.BLACK);
        lb45.setTextFill(Color.BLACK);
        lb46.setTextFill(Color.BLACK);
        lb47.setTextFill(Color.BLACK);
        lb48.setTextFill(Color.BLACK);
        lb49.setTextFill(Color.BLACK);
        lb50.setTextFill(Color.BLACK);
        lb51.setTextFill(Color.BLACK);
        lb52.setTextFill(Color.BLACK);
        lb53.setTextFill(Color.BLACK);
        lb54.setTextFill(Color.BLACK);
        lb55.setTextFill(Color.BLACK);
        lb56.setTextFill(Color.BLACK);
        lb57.setTextFill(Color.BLACK);
        lb58.setTextFill(Color.BLACK);
        lb59.setTextFill(Color.BLACK);
        lb60.setTextFill(Color.BLACK);
        lb61.setTextFill(Color.BLACK);
        lb62.setTextFill(Color.BLACK);
        lb63.setTextFill(Color.BLACK);
        lb64.setTextFill(Color.BLACK);
        lb65.setTextFill(Color.BLACK);
        lb66.setTextFill(Color.BLACK);
        lb67.setTextFill(Color.BLACK);
        lb68.setTextFill(Color.BLACK);
        lb69.setTextFill(Color.BLACK);
        lb70.setTextFill(Color.BLACK);
        lb71.setTextFill(Color.BLACK);
        lb72.setTextFill(Color.BLACK);
        lb73.setTextFill(Color.BLACK);
        lb74.setTextFill(Color.BLACK);
        lb75.setTextFill(Color.BLACK);
        lb76.setTextFill(Color.BLACK);
        lb77.setTextFill(Color.BLACK);
        lb78.setTextFill(Color.BLACK);
        lb79.setTextFill(Color.BLACK);
        lb80.setTextFill(Color.BLACK);
        lb81.setTextFill(Color.BLACK);
        lb82.setTextFill(Color.BLACK);
        lb83.setTextFill(Color.BLACK);
        lb84.setTextFill(Color.BLACK);
        lb85.setTextFill(Color.BLACK);
        lb86.setTextFill(Color.BLACK);
        lb87.setTextFill(Color.BLACK);
        lb88.setTextFill(Color.BLACK);
        lb89.setTextFill(Color.BLACK);
        lb90.setTextFill(Color.BLACK);
        lb91.setTextFill(Color.BLACK);
        lb92.setTextFill(Color.BLACK);
        lb93.setTextFill(Color.BLACK);
        lb94.setTextFill(Color.BLACK);
        lb95.setTextFill(Color.BLACK);
        lb96.setTextFill(Color.BLACK);
        lb97.setTextFill(Color.BLACK);
        lb98.setTextFill(Color.BLACK);
        lb99.setTextFill(Color.BLACK);
        lb100.setTextFill(Color.BLACK);
        lb101.setTextFill(Color.BLACK);
        lb102.setTextFill(Color.BLACK);
        lb103.setTextFill(Color.BLACK);
        lb104.setTextFill(Color.BLACK);
        lb105.setTextFill(Color.BLACK);
        lb106.setTextFill(Color.BLACK);
        lb107.setTextFill(Color.BLACK);
        lb108.setTextFill(Color.BLACK);
        lb109.setTextFill(Color.BLACK);
        lb110.setTextFill(Color.BLACK);
        lb111.setTextFill(Color.BLACK);
        lb112.setTextFill(Color.BLACK);
        lb113.setTextFill(Color.BLACK);
        lb114.setTextFill(Color.BLACK);
        lb115.setTextFill(Color.BLACK);
        lb116.setTextFill(Color.BLACK);
        lb117.setTextFill(Color.BLACK);
        lb118.setTextFill(Color.BLACK);
        lb119.setTextFill(Color.BLACK);
        lb120.setTextFill(Color.BLACK);
        lb121.setTextFill(Color.BLACK);
        lb122.setTextFill(Color.BLACK);
        lb123.setTextFill(Color.BLACK);
        lb124.setTextFill(Color.BLACK);
        lb125.setTextFill(Color.BLACK);
        lb126.setTextFill(Color.BLACK);
        lb127.setTextFill(Color.BLACK);
        
         for(int k = 0; k < 127; k++)
        {
             //Left Top 64
            //for(int k = 0; k < 32; k++)
            //{
             gp.setConstraints(lb1, 0, 0);
             gp.setConstraints(lb2, 1, 0);
             gp.setConstraints(lb3, 2, 0);
             gp.setConstraints(lb4, 3, 0);
             gp.setConstraints(lb5, 4, 0);
             gp.setConstraints(lb6, 5, 0);
             gp.setConstraints(lb7, 6, 0);
             gp.setConstraints(lb8, 7, 0);
             gp.setConstraints(lb9, 8, 0);
             gp.setConstraints(lb10, 9, 0);
             gp.setConstraints(lb11, 10, 0);
             gp.setConstraints(lb12, 11, 0);
             gp.setConstraints(lb13, 12, 0);
             gp.setConstraints(lb14, 13, 0);
             gp.setConstraints(lb15, 14, 0);
             gp.setConstraints(lb16, 15, 0);
             gp.setConstraints(lb17, 16, 0);
             gp.setConstraints(lb18, 17, 0);
             gp.setConstraints(lb19, 18, 0);
             gp.setConstraints(lb20, 19, 0);
             gp.setConstraints(lb21, 20, 0);
             gp.setConstraints(lb22, 21, 0);
             gp.setConstraints(lb23, 22, 0);
             gp.setConstraints(lb24, 23, 0);
             gp.setConstraints(lb25, 24, 0);
             gp.setConstraints(lb26, 25, 0);
             gp.setConstraints(lb27, 26, 0);
             gp.setConstraints(lb28, 27, 0);
             gp.setConstraints(lb29, 28, 0);
             gp.setConstraints(lb30, 29, 0);
             gp.setConstraints(lb31, 30, 0);
             gp.setConstraints(lb32, 32, 0);
               
            //}
            
            //Left Top 32
            //for(int k = 0; k < 16; k++)
            //{
             gp.setConstraints(lb17, 0, 1);
             gp.setConstraints(lb18, 1, 1);
             gp.setConstraints(lb19, 2, 1);
             gp.setConstraints(lb20, 3, 1);
             gp.setConstraints(lb21, 4, 1);
               gp.setConstraints(lb22, 5, 1);
               gp.setConstraints(lb23, 6, 1);
               gp.setConstraints(lb24, 7, 1);
               gp.setConstraints(lb25, 8, 1);
               gp.setConstraints(lb26, 9, 1);
               gp.setConstraints(lb27, 10, 1);
               gp.setConstraints(lb28, 11, 1);
               gp.setConstraints(lb29, 12, 1);
               gp.setConstraints(lb30, 13, 1);
               gp.setConstraints(lb31, 14, 1);
               gp.setConstraints(lb32, 15, 1);
               gp.setConstraints(lb16, 16, 1);
            }
          /*  
         for(int i=0; i<4; i++) 
         {
            //Left Top 16
            for(int k = 0; k < 8; k++)
            {
   
                gp.setConstraints(label, k, 2);
            }
            
            //Left Top 8
            for(int k = 0; k < 4; k++)
            {
                 gp.setConstraints(label, k, 3);
            }
            
            //Left Top 4
            for(int k = 0; k < 2; k++)
            {
                gp.setConstraints(label, k, 4);
            }
            
            //Left Top 2
            for(int k = 0; k < 1; k++)
            {
                gp.setConstraints(label, k, 5);
            }
            
            //Number One
            gp.setConstraints(lb64, k, 6);
            
            //Right Top 2
            for(int k = 0; k < 1; k++)
            {
                 gp.setConstraints(label, k, 7);
            
            
            //Right Top 4
            for(int k = 0; k < 2; k++)
            {
                gp.setConstraints(label, k, 8);
            }
            
            //Right Top 8
            for(int k = 0; k < 4; k++)
            {
                gp.setConstraints(label, k, 9);
            }
            
            //Right Top 16
            for(int k = 0; k < 8; k++)
            {
                gp.setConstraints(label, k, 10);
            }
            
            //Right Top 32
            for(int k = 0; k < 16; k++)
            {
                gp.setConstraints(label, k, 11); 
            }
            
            //Right Top 64
            for(int k = 0; k < 32; k++)
            {
                gp.setConstraints(label, k, 12);
            }   
        
        
        
        gp.getChildren().addAll(lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10,
                                lb11, lb12, lb13, lb14, lb15, lb16, lb17, lb18, lb19, lb20,
                                lb21, lb22, lb23, lb24, lb25, lb26, lb27, lb28, lb29, lb30,
                                lb31, lb32, lb33, lb34, lb35, lb36, lb37, lb38, lb39, lb40,
                                lb41, lb42, lb43, lb44, lb45, lb46, lb47, lb48, lb49, lb50,
                                lb51, lb52, lb53, lb54, lb55, lb56, lb57, lb58, lb59, lb60,
                                lb61, lb62, lb63, lb64, lb65, lb66, lb67, lb68, lb69, lb70,
                                lb71, lb72, lb73, lb74, lb75, lb76, lb77, lb78, lb79, lb80,
                                lb81, lb82, lb83, lb84, lb85, lb86, lb87, lb88, lb89, lb90,
                                lb91, lb92, lb93, lb94, lb95, lb96, lb97, lb98, lb99, lb100,
                                lb101, lb102, lb103, lb104, lb105, lb106, lb107, lb108, lb109, lb110,
                                lb111, lb112, lb113, lb114, lb115, lb116, lb117, lb118, lb119, lb120,
                                lb121, lb122, lb123, lb124, lb125, lb126, lb127);
      
    }*/
    
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
