package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Drinkcontroller {


    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    smirnoff smirnoff = new smirnoff();
    royal royal = new royal();
    sevenup sevenup = new sevenup();
    rootbeer rootbeer = new rootbeer();
    mountaindew mountaindew = new mountaindew();


    public void initialize() {

        smirnoff.settaste("tastes like Sprite");
        smirnoff.setscolor("looks like sprite but has a little shade of green");

        royal.settaste("tastes sweet");
        royal.setscolor("color orange");

        sevenup.settaste("tastes like Mountain Dew");
        sevenup.setscolor("looks like Mountain Dew");

        rootbeer.settaste("tastes bitter sweet");
        rootbeer.setscolor("looks like Coke");

        mountaindew.settaste("tastes like 7up");
        mountaindew.setscolor("looks like 7up");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Smirnoff " + smirnoff.getscolor() + " and " + smirnoff.gettaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Royal " + royal.getscolor() + " and " + royal.gettaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("7up " + sevenup.getscolor() + " and " + sevenup.gettaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Root beer " + rootbeer.getscolor() + " and " + rootbeer.gettaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Mountain Dew " + mountaindew.getscolor() + " and " + mountaindew.gettaste());
            }
        
    
        alert.showAndWait();
    }
} 
