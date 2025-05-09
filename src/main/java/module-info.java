module org.example.pastrygameexamproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pastrygame to javafx.fxml;
    exports com.pastrygame;
}