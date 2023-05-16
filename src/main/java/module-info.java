module com.example.finalcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.finalcalculator to javafx.fxml;
    exports com.example.finalcalculator;
}