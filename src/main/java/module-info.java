module com.ajikhoji.flipcard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ajikhoji.flipcard to javafx.fxml;
    exports com.ajikhoji.flipcard;
}