module no.ntnu.idata2001.juliangm.fxmlwithglisten {
    requires javafx.controls;
    requires javafx.fxml;

    opens no.ntnu.idata2001.juliangm.fxmlwithglisten to javafx.fxml;
    exports no.ntnu.idata2001.juliangm.fxmlwithglisten;
}
