module com.example.f22comp1011ass2_200474224 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.net.http;

    opens com.example.f22comp1011ass2_200474224 to javafx.fxml;
    exports com.example.f22comp1011ass2_200474224;
}