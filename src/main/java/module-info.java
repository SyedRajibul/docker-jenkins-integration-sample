module com.example.dockerjenkins {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dockerjenkins to javafx.fxml;
    exports com.example.dockerjenkins;
}