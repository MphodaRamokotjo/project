module com.example.somethingamzing {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.somethingamzing to javafx.fxml;
    exports com.example.somethingamzing;
}