module JavaFxApplication {

    requires javafx.fxml;
    requires javafx.controls;
    requires javax.persistence;

    opens view;
    opens controller;
    opens main;
}