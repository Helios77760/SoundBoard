/*
 * Copyright (c) Dylan Brasseur 2018. All Rights Reserved
 * This file is part of a project released under the MIT License.
 * See file LICENSE.md or go to https://opensource.org/licenses/MIT for full license details.
 */

package control;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static final int MAIN_VERSION = 0;
    public static final int SECONDARY_VERSION = 1;
    public static final int TERTIARY_VERSION = 0;
    public static final String BUILD_NUMBER = "3";
    public static final String VERSION_NUMBER = MAIN_VERSION+"."+SECONDARY_VERSION+"."+TERTIARY_VERSION+" BUILD "+BUILD_NUMBER;


    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Soundboard " + VERSION_NUMBER);
        primaryStage.setScene(new Scene(new BorderPane(), 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
