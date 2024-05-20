module fes.aragon.leveldevil {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens fes.aragon.leveldevil to javafx.fxml;
    exports fes.aragon.leveldevil;
}