module com.example.nrew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nrew to javafx.fxml;
    exports com.example.nrew;
}