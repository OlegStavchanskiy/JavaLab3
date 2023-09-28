module ch.makery.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.makery.lab3 to javafx.fxml;
    exports ch.makery.lab3;
}