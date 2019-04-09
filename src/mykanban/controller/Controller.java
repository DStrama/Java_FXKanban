package mykanban.controller;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import mykanban.model.KanbanModel;
import mykanban.model.Priority;
import mykanban.model.Task;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Controller {

        @FXML
        private ListView<Task> listToDo;

        @FXML
        private ListView<Task>  listInProgress;

        @FXML
        private ListView<Task>  listInDone;

        public static ListView<Task> doToList;
        public static ListView<Task> progressInList;
        public static ListView<Task> doneInList;


        public Button addNewTaskButton;

        public AnchorPane content;

        private static Stage secondaryStage = new Stage();

        private static ObservableList<Task> toDoObservableList = FXCollections.observableArrayList();
        private static ObservableList<Task> inProgressObservableList = FXCollections.observableArrayList();
        private static ObservableList<Task> doneObservableList = FXCollections.observableArrayList();
        private static ObservableList<Task> actualObservableList = FXCollections.observableArrayList();


        private static ContextMenu contextMenu;
        private static Task selectedTask;
        private static int selectedTaskIndex;
        private static Scene addnewscene;
        private static Scene addScene;
        private static Scene addItemScene;
        private static Stage addElementStage;
        public static  Scene getAddScene(){
        return addScene;
      }



        public static ObservableList<Task> getToDoObservableList() {
        return toDoObservableList;
        }

         public static Stage getAddElementStage() {
            return addElementStage;
         }

        public static Stage getSecondaryStage() {
            return secondaryStage;
        }

        public static Scene getNewScene() {
        return addnewscene;
        }

        public static Scene getAddItemScene() {
            return addItemScene;
         }

        public void closeWindow(){

            System.exit(0);
        }


        public void alert(ActionEvent event){


            Alert a1 = new Alert(Alert.AlertType.INFORMATION);
            a1.setTitle("Alert");
            a1.setHeaderText("Application is made by Dominik Strama");
            a1.setContentText("Dominik Strama is a second year IT student at AGH.");
            a1.showAndWait();
        }


    public static ListView<Task> getDoToList() {
        return doToList;
    }

    public void addNewTaskAcctionButton(ActionEvent actionEvent) throws IOException {

            try{

                FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../view/add_task_view.fxml"));
                Controller.getSecondaryStage().setTitle("Add new task");
                Parent root2 = loader.load();
                Scene scene = new Scene(root2);
                Controller.getSecondaryStage().setScene(scene);
                ComboBox<Priority> combo = (ComboBox<Priority>) scene.lookup("#priorityComboBox");
                combo.setItems(KanbanModel.getInstance().getPriorityList());
                combo.getSelectionModel().selectFirst();
                Controller.getSecondaryStage().show();

                doToList = listToDo;
                progressInList = listInProgress;
                doneInList = listInDone;








            }
            catch(IOException e){
                System.out.println("Can not open new window");
            }

        }

        public void buttonActionFromToDoButtonToInProgress (ActionEvent actionEvent) {

           try{
             if(toDoObservableList.size() > 0 ) {
                 listToDo.setCellFactory(callback);

              }
           }
           catch{



           }
        }
        public void buttonActionFromInProgressButtonToDone (ActionEvent actionEvent) {


        }



    }





