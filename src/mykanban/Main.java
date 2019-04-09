package mykanban;

import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import mykanban.model.Priority;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("view/sample.fxml"));
        primaryStage.setTitle("Kaban");
        primaryStage.setScene(new Scene(root, 600, 430));
        primaryStage.show();
        primaryStage.setResizable(false);
        priorityList.addAll(Priority.LOW,Priority.NORMAL,Priority.HIGH);


    }

    private static ComboBox<Priority> comboBox;

    private static ObservableList<Priority> priorityList = FXCollections.observableArrayList();

   // public static ObservableList<Priority> getPriorityList() {
   //     return priorityList;
   // }

    //public static void setComboBox(ComboBox<Priority> comboBox) {
    //    Main.comboBox = comboBox;
   // }

    //public static ComboBox<Priority> getComboBox() {
    //    return comboBox;
    //}

    public static void main(String[] args) {

        launch(args);
    }
}