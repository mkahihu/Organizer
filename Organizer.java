/* Name: Cristopher Alvarado and Miller Kahihu
 * Date: 05/24/16
 * CS 406 Final Project - Organizer File
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
//import javafx.scene.Group;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NumberFormatException;
public class Organizer extends Application
{
    MenuBar mb;
    GridPane gp;
//    List<List<String>> matchups;
    Label[][] lb;
    String[] top64;
    String[] top32;
    String[] top16;
    String[] top8;
    String[] top4;
    String[] top2;
    String winner;
    private File file;

    //Initialize Variables
    public void init()
    {

        mb = new MenuBar(); //MenuBar
        gp = new GridPane(); //GridPane
        lb = new Label[33][12];
        top64 = new String[64];
        top32 = new String[32];
        top16 = new String[16];
        top8 = new String[8];
        top4 = new String[4];
        top2 = new String[2];
        winner = "noone";
        file = null;
//        matchups = new ArrayList<List<String>>(); //For manual Bracket Input
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
        //labelCode();

        ScrollPane sp = new ScrollPane(gp);
        sp.setFitToHeight(true);

        BorderPane bp = new BorderPane(sp);
        bp.setPadding(new Insets(5));

        DropShadow dpS = new DropShadow();
        dpS.setOffsetX(2.0);
        dpS.setOffsetY(0.5);

        bp.setTop(mb);
        bp.setCenter(sp);

//        Group root = new Group();
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
        MenuItem saveItem = new MenuItem("Save");
        saveItem.setOnAction( e -> {
            FileChooser fc = new FileChooser();
            fc.setTitle("Save File");
            file = fc.showSaveDialog(new Stage());
            if(file != null)
            {
                try
                {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    int count = 1;
                    writer.write("Top 64");
                    for(String k: top64)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    count = 1;
                    writer.newLine();
                    writer.newLine();
                    writer.write("Top 32");
                    for(String k: top32)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    count = 1;
                    writer.newLine();
                    writer.newLine();
                    writer.write("Top 16");
                    for(String k: top16)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    count = 1;
                    writer.newLine();
                    writer.newLine();
                    writer.write("Top 8");
                    for(String k: top8)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    count = 1;
                    writer.newLine();
                    writer.newLine();
                    writer.write("Top 4");
                    for(String k: top4)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    count = 1;
                    writer.newLine();
                    writer.newLine();
                    writer.write("Top 2");
                    for(String k: top2)
                    {
                        writer.newLine();
                        writer.write("#" + count + " "+ k);
                        count++;
                    }
                    writer.newLine();
                    writer.newLine();
                    writer.write("Winner");
                    writer.newLine();
                    writer.write(winner);
                    writer.close();
                }
                catch(IOException ex)
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error");
                    alert.setHeaderText(null);
                    alert.setContentText("Something happened with saving");
                    alert.showAndWait();
                }
            }

        });

        fileMenu.getItems().addAll(saveItem);

        //Ranking Menu
        Menu bracketMenu = new Menu("Bracket");
        MenuItem addItem = new MenuItem("Add...");
        addItem.setOnAction( e -> {
            try
            {
                int rowNum = Integer.valueOf(JOptionPane.showInputDialog("Input Row"));
                int columnNum = Integer.valueOf(JOptionPane.showInputDialog("Input Column"));
                String player = JOptionPane.showInputDialog("Input Player Name");
                if(rowNum < 33 && rowNum > 0)
                {
                    if(columnNum == 1)
                    {
                        top64[rowNum-1] = player;
                    }
                    else if(columnNum == 11)
                    {
                        top64[rowNum-1+32] = player;
                    }
                }
                if(rowNum < 17 && rowNum > 0)
                {
                    if(columnNum == 2)
                    {
                        top32[rowNum-1] = player;
                    }
                    else if(columnNum == 10)
                    {
                        top32[rowNum-1+16] = player;
                    }
                }
                if(rowNum < 9 && rowNum > 0)
                {
                    if(columnNum == 3)
                    {
                        top16[rowNum-1] = player;
                    }
                    else if(columnNum == 9)
                    {
                        top16[rowNum-1+8] =  player;
                    }
                }
                if(rowNum < 5 && rowNum > 0)
                {
                    if(columnNum == 4)
                    {
                        top8[rowNum-1] = player;
                    }
                    else if(columnNum == 8)
                    {
                        top8[rowNum-1+4] =  player;
                    }
                }
                if(rowNum < 3 && rowNum > 0)
                {
                    if(columnNum == 5)
                    {
                        top4[rowNum-1] = player;
                    }
                    else if(columnNum == 7)
                    {
                        top4[rowNum-1+2] = player;
                    }
                }
                if(rowNum == 1)
                {
                    if(columnNum == 6)
                    {
                        winner = player;
                    }
                }
                else
                {
                    System.out.println("Rows are between 1-32 & Columns are between 1-12");
                }
                lb[rowNum][columnNum].setText(player);
            }
            catch(NumberFormatException ex)
            {
                System.out.println("Please Input Integer Value");
            }

        });

        MenuItem getTop64 = new MenuItem("Top 64");
        getTop64.setOnAction( e -> {
            System.out.println(arrayToList(top64));
        });

        MenuItem getTop32 = new MenuItem("Top 32");
        getTop32.setOnAction( e -> {
            System.out.println(arrayToList(top32));
        });

        MenuItem getTop16 = new MenuItem("Top 16");
        getTop16.setOnAction( e -> {
            System.out.println(arrayToList(top16));
        });

        MenuItem getTop8 = new MenuItem("Top 8");
        getTop8.setOnAction( e -> {
            System.out.println(arrayToList(top8));
        });

        MenuItem getTop4 = new MenuItem("Top 4");
        getTop4.setOnAction( e -> {
            System.out.println(arrayToList(top4));
        });

        MenuItem getTop2 = new MenuItem("Top 2");
        getTop2.setOnAction( e -> {
            System.out.println(arrayToList(top2));
        });

        MenuItem getWinner = new MenuItem("Winner");
        getWinner.setOnAction( e -> {
            System.out.println(winner);
        });

        bracketMenu.getItems().addAll(addItem, getTop64, getTop32, getTop16, getTop8, getTop4, getTop2, getWinner);


        mb.getMenus().addAll(fileMenu, bracketMenu);
    }

    private void createLabels()
    {
        //Create a Double Array of Labels (in form of a Tournament Bracket)

        int k = 32;
        int i = 1;
        int count = 0;

        for (int c = 1; c < 12; c++)
        {
            if (c < 6)
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
            else if(c == 6)
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
            else if(c > 6)
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

    private String arrayToList(String[] list)
    {
        StringBuffer sb = new StringBuffer();
        int count = 1;
        for(int k = 0; k < list.length; k++)
        {
            sb.append("#" + count + " " + list[k] + "\n");
            count++;
        }
        return sb.toString();
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
