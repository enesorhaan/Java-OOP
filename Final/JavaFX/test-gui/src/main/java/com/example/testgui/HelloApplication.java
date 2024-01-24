package com.example.testgui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    private List<Personel> personelListesi = new ArrayList<>();
    private TextArea personelTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Design Preview [Ornek]");

        // UI elemanları
        Label adLabel = new Label("Personel Adı");
        TextField ad = new TextField();

        Button ekleButton = new Button("Arka Plana Ekle");
        ekleButton.setOnAction(e -> arkaPlanaEkle(ad.getText()));

        Button gosterButton = new Button("Tümünü Göster");
        gosterButton.setOnAction(e -> tumunuGoster());

        Button sorgulaButton = new Button("İsimle Sorgula");
        sorgulaButton.setOnAction(e -> isimleSorgula(ad.getText()));

        personelTextArea = new TextArea();

        // Layout
        VBox layout = new VBox(10);

        // Üst kısım
        HBox ustKisim = new HBox(10);
        ustKisim.getChildren().addAll(adLabel, ad, ekleButton);
        ustKisim.setPadding(new Insets(0, 0, 10, 0));

        // Orta kısım
        HBox ortaKisim = new HBox(10);
        ortaKisim.getChildren().addAll(gosterButton, sorgulaButton);
        ortaKisim.setPadding(new Insets(0, 0, 10, 0));

        // Alt kısım
        layout.getChildren().addAll(ustKisim, ortaKisim, personelTextArea);
        layout.setPadding(new Insets(10, 10, 10, 10));

        // Scene
        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);

        stage.show();
    }

    private void arkaPlanaEkle(String ad) {
        try {
            if (!ad.isEmpty()) {
                Personel yeniPersonel = new Personel(ad);
                personelListesi.add(yeniPersonel);
                personelTextArea.appendText(yeniPersonel + "\n");

                clearTextFields();
            } else {
                throw new Exception("İsim alanı boş olamaz.");
            }
        } catch (Exception ex) {
            System.out.println("Hata: " + ex.getMessage());
        }
    }

    private void tumunuGoster() {
        personelTextArea.clear();

        for (Personel personel : personelListesi) {
            personelTextArea.appendText(personel + "\n");
        }
    }

    private void isimleSorgula(String isim) {
        personelTextArea.clear();
        for (Personel personel : personelListesi) {
            if (personel.getAd().startsWith(isim)) {
                personelTextArea.appendText(personel + "\n");
            }
        }
    }

    private void clearTextFields() {
        personelTextArea.clear();
    }

    public static class Personel {
        private String ad;

        public Personel(String ad) {
            this.ad = ad;
        }

        public String getAd() {
            return ad;
        }

        @Override
        public String toString() {
            return ad;
        }
    }
}