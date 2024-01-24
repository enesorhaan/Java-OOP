module com.example.testgui {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.testgui to javafx.fxml;
    exports com.example.testgui;
}