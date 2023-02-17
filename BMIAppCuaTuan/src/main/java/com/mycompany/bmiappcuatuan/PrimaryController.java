package com.mycompany.bmiappcuatuan;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a = 10;
        if (a > 10) {
            System.out.println("Youtuber Duong Huu Thanh");
            App.setRoot("Secondary");
        }
    }
}
