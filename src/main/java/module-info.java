module com.example.lab_5_ecology {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab_5_ecology to javafx.fxml;
    exports com.example.lab_5_ecology;
}