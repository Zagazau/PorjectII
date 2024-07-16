module taulo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires org.glassfish.jaxb.runtime;

    opens com.example.estg.desktop.Login to javafx.fxml;
    opens ipvc.estg.desktop.rececionista to javafx.fxml;
    opens ipvc.estg.desktop.responsavelInstrutores to javafx.fxml;
    opens ipvc.estg.desktop.instrutor to javafx.fxml;

    exports ipvc.estg.desktop;
    exports ipvc.estg.desktop.Login;
    exports ipvc.estg.desktop.rececionista;
    exports ipvc.estg.desktop.responsavelInstrutores;
    exports ipvc.estg.desktop.instrutor;
}
