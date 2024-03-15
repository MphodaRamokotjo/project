package com.example.somethingamzing;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.CacheHint;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private int count=0;
    private String css = getClass().getResource("app.css").toExternalForm().toString();
    private Label label1,label2,label4;
    private String[] url = {getClass().getResource("1.jpeg").toExternalForm().toString(),getClass().getResource("2.jpeg").toExternalForm().toString(),getClass().getResource("3.jpeg").toExternalForm().toString(),
                            getClass().getResource("4.jpeg").toExternalForm().toString(),getClass().getResource("5.jpeg").toExternalForm().toString(),getClass().getResource("6.jpeg").toExternalForm().toString(),
                            getClass().getResource("7.jpeg").toExternalForm().toString(),getClass().getResource("8.jpeg").toExternalForm().toString(),getClass().getResource("9.jpeg").toExternalForm().toString()};
    private Stage stage;
    private Button button;
    private ImageView imageView,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8;
    private Stage stage1;
    @Override
    public void start(Stage stage) throws IOException {
        Image image = new Image(url[0]);
        imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(200);

        //image number2
        Image image1 = new Image(url[1]);
        imageView1 = new ImageView(image1);
        imageView1.setFitWidth(200);
        imageView1.setFitHeight(200);

        //image number3
        Image image2 = new Image(url[2]);
        imageView2 = new ImageView(image2);
        imageView2.setFitWidth(200);
        imageView2.setFitHeight(200);

        Image image3 = new Image(url[3]);
        imageView3 = new ImageView(image3);
        imageView3.setFitWidth(200);
        imageView3.setFitHeight(200);
        //image number2
        Image image4 = new Image(url[4]);
        imageView4 = new ImageView(image4);
        imageView4.setFitWidth(200);
        imageView4.setFitHeight(200);

        //image number3
        Image image5 = new Image(url[5]);
        imageView5 = new ImageView(image5);
        imageView5.setFitWidth(200);
        imageView5.setFitHeight(200);

        Image image6 = new Image(url[6]);
        imageView6 = new ImageView(image6);
        imageView6.setFitWidth(200);
        imageView6.setFitHeight(200);
        //image number2
        Image image7 = new Image(url[7]);
        imageView7 = new ImageView(image7);
        imageView7.setFitWidth(200);
        imageView7.setFitHeight(200);

        //image number3
        Image image8 = new Image(url[8]);
        imageView8 = new ImageView(image8);
        imageView8.setFitWidth(200);
        imageView8.setFitHeight(200);

        //HBox
        HBox hBox = new HBox(50);
        hBox.getChildren().addAll(imageView,imageView1,imageView2);

        //Label
        label1 = new Label("DESIGNERS");

        Line line = new Line();
        line.setStartX(0);
        line.setTranslateX(110);
        line.setEndX(676);
        line.setStrokeWidth(4);

        Line line1 = new Line();
        line1.setStartX(0);
        line1.setTranslateX(110);
        line1.setEndX(676);
        line1.setStrokeWidth(4);

        Line line2 = new Line();
        line2.setStartX(0);
        line2.setTranslateX(110);
        line2.setEndX(676);
        line2.setStrokeWidth(4);
        line2.setStroke(Color.PURPLE);


        //vbox
        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(label1,line,hBox);

        //HBox1
        HBox hBox1 = new HBox(50);
        hBox1.getChildren().addAll(imageView3,imageView4,imageView5);

        label2 = new Label("PROGRAMMERS");
        Pane pane = new Pane();
        pane.getChildren().add(imageView6);
        pane.setId("pp");
        //HBox
        HBox hBox4 = new HBox(50);
        hBox4.getChildren().addAll(pane,imageView7,imageView8);

        //Label
        label4 = new Label("DATA ANALYSTS");

        //vbox
        VBox vBox4 = new VBox();
        vBox4.getChildren().addAll(label4,line1,hBox4);

        //vbox
        VBox vBox3 = new VBox();
        vBox2.getChildren().addAll(label2,line2,hBox1);
        //VBox
        VBox vBox = new VBox();
        vBox.getChildren().addAll(vBox2,vBox3,vBox4);
        BorderPane borderpane = new BorderPane();
        borderpane.setCenter(vBox);
        button = new Button();
        Scene scene = new Scene(borderpane);
        scene.getStylesheets().add(css);
       // stage = new Stage();
        stage.setTitle("Gallery");
        stage.setScene(scene);
        stage.show();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                stage1.close();
                stage.show();
            }
        });
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image,"Libakiso Redds");
                stage.close();
                stage1.show();
            }
        });
        imageView6.hoverProperty().asObject();
        imageView6.setCache(true);
        imageView6.setCacheHint(CacheHint.SPEED);
        imageView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image1,"Thabo Kofa");
                stage1.show();
                stage.close();
            }
        });
        imageView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image2,"james Bond");
                stage.close();
                stage1.show();
            }
        });
        imageView3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image3,"Ntate Likoche");
                stage.close();
                stage1.show();
            }
        });
        imageView4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image4,"Sello Tape");
                stage.close();
                stage1.show();
            }
        });

        imageView5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image5,"khalieli Sebota");
                stage.close();
                stage1.show();
            }
        });

        imageView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image6,"Mecheso Hoto");
                stage.close();
                stage1.show();
            }
        });
        imageView7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image7,"Thapelo molefe");
                stage.close();
                stage1.show();
            }
        });
        imageView8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                another(image8,"Lisebo selialia");
                stage.close();
                stage1.show();
            }
        });


    }


    private void another(Image image,String name)
    {


        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(478);
        imageView.setFitHeight(381);
        BorderPane borderpane = new BorderPane();

        Scene scene = new Scene(borderpane, 900, 800);
        button.setText("Return Back");

        button.setTextFill(Color.WHITE);
        button.setFont(Font.font(20));
        button.getStyleClass().addAll("btn");
        scene.getStylesheets().add(css);
        Button button1 = new Button("Next");
        button1.setId("btn1");

        Button button2 = new Button("previous");
        button2.setId("btn2");
        button1.getStyleClass().addAll("btn");
        button2.getStyleClass().addAll("btn");



        Image[] images = new Image[url.length];
        for (int i = 0; i < images.length; i++)
        {
            images[i]= new Image(url[i]);

        }
        ImageView imageViewToNav = new ImageView(images[count]);
        imageViewToNav.setX(1300);
        imageViewToNav.setY(700);
        imageViewToNav.setFitWidth(300);
        imageViewToNav.setFitHeight(300);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        VBox vBoxNav = new VBox(66);

        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count++;
                if(count >=images.length)
                {
                    count =0;

                }
                imageViewToNav.setImage(images[count]);


            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count--;
                if (count < 0) {
                    count = images.length - 1; // Wrap around to last image

                }
                imageViewToNav.setImage(images[count]);


            }
        });
        Label labelNav =  new Label();
        labelNav.setText("photos");
        labelNav.getStyleClass().add("navStyle");



        vBoxNav.getChildren().addAll(labelNav,imageViewToNav);
        vBoxNav.setPadding(new Insets(200,890,2000,120));
        borderpane.setRight(vBoxNav);

        HBox box = new HBox(10);
        box.getChildren().addAll(button,button1,button2);
        borderpane.setBottom(box);


        Label label = new Label(name);
        label.setTextFill(Color.WHITE);
        label.setPadding(new Insets(1));
        label.setFont(Font.font(20));

        borderpane.setBackground(new Background(new BackgroundFill(Color.GRAY,null,null)));
        borderpane.setTop(label);
        borderpane.setCenter(imageView);
        stage1 = new Stage();
        stage1.setTitle("STAKEHOLDERS");
        stage1.setScene(scene);
        stage1.show();
    }

    public static void main(String[] args) {
        launch();
    }
}