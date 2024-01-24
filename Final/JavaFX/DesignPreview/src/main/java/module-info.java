module com.example.designpreview {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.designpreview to javafx.fxml;
    exports com.example.designpreview;
}