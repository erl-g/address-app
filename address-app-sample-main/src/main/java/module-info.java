module erl.addressapp {
    requires transitive javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires jakarta.xml.bind;

    requires java.prefs;

    requires net.datafaker;

    opens dev.erl.app to javafx.fxml;
    opens dev.erl.app.overview to javafx.fxml;
    opens dev.erl.app.overview.form to javafx.fxml;
    opens dev.erl.models.person to jakarta.xml.bind;
    opens dev.erl.app.About to javafx.fxml;

    exports dev.erl;
    exports dev.erl.models.person;
    exports dev.erl.libs.xml.adapter;
    exports dev.erl.app.About;
    
}
