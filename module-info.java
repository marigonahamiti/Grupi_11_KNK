module sample.projectknk {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens sample.projectknk to javafx.fxml;
    exports sample.projectknk;

    requires java.sql;
    requires java.desktop;
    requires itextpdf;
}
