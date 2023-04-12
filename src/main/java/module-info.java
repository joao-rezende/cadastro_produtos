module com.joaorezende {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joaorezende to javafx.fxml;
    opens com.joaorezende.controllers to javafx.fxml;
    opens com.joaorezende.models to javafx.base;

    exports com.joaorezende;
}
