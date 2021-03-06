package com.example.javafxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Button button = new Button("点击运行");

        StackPane stackPane = new StackPane();  //布局方式，同时作为容器
        stackPane.getChildren().add(button);    //将button放入容器中。
        Scene scene = new Scene(stackPane, 320, 240);  //定义场景。
        stage.setTitle("Hello!");
        stage.setScene(scene);                  //定义舞台
        stage.show();                           //显示
    }

    public static void main(String[] args) {
        launch();
    }
}