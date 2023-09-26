module es.ieslosmontecillos.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.helloworld to javafx.fxml;
    exports es.ieslosmontecillos.helloworld;
}