/********************************************************************************************
 *   COPYRIGHT (C) 2022 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  HelloWorld.java file
 *   Project:  JavaFX Hello World Application
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/
package demos;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This class demonstrates a simple JavaFX application with two buttons.
 */
public class HelloWorld extends Application {

    /**
     * The main method to launch the application.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * Overrides the start method of Application class to initialize the JavaFX application.
     * @param primaryStage The primary stage of the application.
     * @throws Exception If any error occurs during application start.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create buttons
        Button btn = new Button("Click Me");
        Button exit = new Button("Exit");
        
        // Set actions for buttons
        exit.setOnAction(e -> {
        	System.out.println("exit this app"); // Business logic comment: Print exit message
        	System.exit(0);
        });
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!"); // Business logic comment: Print Hello World message
                System.out.println("Hello World!");
            }
        });
        
        // Create layout
        VBox root=new VBox();
        Scene scene=new Scene(root,500,300);
        root.getChildren().addAll(btn,exit);
        
        // Set the scene
		primaryStage.setTitle("My title"); // Global variable comment: Set the title of the stage
		primaryStage.setScene(scene); // Global variable comment: Set the scene to the primary stage
        primaryStage.show(); // Business logic comment: Show the primary stage
    }
}
