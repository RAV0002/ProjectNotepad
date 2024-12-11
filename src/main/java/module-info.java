module com.mynotepad.mynotepad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.mynotepad.mynotepad to javafx.fxml;
    exports com.mynotepad.mynotepad;
}