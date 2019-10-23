/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball4;
import java.io.BufferedReader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;
import java.util.Collections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.xml.bind.JAXB;


/**
 *
 * @author vlawrence6491
 */
public class BaseballController {
    
    @FXML private ListView Teams;
    @FXML private TableView players;
    @FXML private TableColumn playerName;
    @FXML private TableColumn battingAverage;
    
      String iTeam;
      String name;
      float atBats= 0;
      float hits= 0;
      float average =0;
      Scanner input = new Scanner(System.in);
      String team= "0";
      List<Player> teamPlayers = new ArrayList<Player>();
      ArrayList<Player> TeamList = new ArrayList<Player>();

         
    public void getTeams(List teamPlayers, ArrayList Teams)
    {
        for( int i= 0; i < teamPlayers.size(); i++)
        {
            if ( !Teams.contains(teamPlayers.get(i).getTeam()))
            {
                Teams.add(teamPlayers.get(i).getTeam());
            } else {
            }
        }
        System.out.println(Teams);
    }
    
    
         
    private void readFile(){
        
        try(BufferedReader inputFile = Files. newBufferedReader(Paths.get("baseball.xml")))

        {
            MLB players = JAXB.umarshal(inputFile,MLB.class);
            teamPlayers = players.getPlayers();
            getTeams(teamPlayers,Teams);
            List<Player> result = new ArrayList<>();
            float teamAdd = 0;
            
            for( int i=0; i < teamPlayers.size(); i++)
            {
                team = teamPlayers.get(i).getTeam();
                
                if( team.compareTo(iTeam) == 0)
                {
                    result.add(teamPlayers.get(i));
                    teamAdd += teamPlayers.get(i).getAverage();
                }
            }
            
            float teamAverage = teamAdd/result.size();
            
            for( int j=0; j< result.size(); j++)
            {
                if( result.get(j).getAverage() > teamAverage)
                {
                    System.out.println(result.get(j).getName());
                    System.out.println(result.get(j).getAverage());
                }
            }
            

        }catch(Exception e){
            System.out.println("Cannot open file");
            e.printStackTrace();
        }
        }



}



