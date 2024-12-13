module com.example.connect {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.connect to javafx.fxml;
    exports com.example.connect;
}