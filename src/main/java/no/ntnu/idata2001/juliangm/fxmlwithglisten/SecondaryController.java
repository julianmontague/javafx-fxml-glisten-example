/*
Copyright 2022 Julian Montague

This file is part of FXMLWithGlisten.

FXMLWithGlisten is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License as published by the Free Software
Foundation, either version 3 of the License, or (at your option) any later
version.

FXMLWithGlisten is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with
FXMLWithGlisten. If not, see <https://www.gnu.org/licenses/>. 
*/

package no.ntnu.idata2001.juliangm.fxmlwithglisten;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}