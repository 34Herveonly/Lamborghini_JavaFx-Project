module org.mavenproject1.javafx_1st_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens org.mavenproject1.javafx_1st_project to javafx.fxml;
    exports org.mavenproject1.javafx_1st_project;
}