module com.mycompany.bmiappcuatuan {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmiappcuatuan to javafx.fxml;
    exports com.mycompany.bmiappcuatuan;
}
