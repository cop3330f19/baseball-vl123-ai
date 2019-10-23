/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author vlawrence6491
 */

public class MLB{
    @XmlElement(name="player")
    private List<Player> players = new ArrayList<>();
    
    public List<Player> getPlayers() {return players;}
}
