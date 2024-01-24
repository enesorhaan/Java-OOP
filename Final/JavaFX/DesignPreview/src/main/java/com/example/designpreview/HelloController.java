package com.example.designpreview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField adi;
    @FXML
    private TextArea liste;
    @FXML
    private Button ekle;
    @FXML
    private Button sorgula;
    @FXML
    private Button goster;

    @FXML
    protected void ekleClick() {
        if (adi.getText().equals("enes")){
            System.out.println("Success!");
        }else{
            System.out.println("Unsuccess");
        }
    }

    @FXML
    protected void sorgulaClick() {

    }

    @FXML
    protected void gosterClick() {

    }

}