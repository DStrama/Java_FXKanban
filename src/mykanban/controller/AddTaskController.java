package mykanban.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mykanban.model.KanbanModel;
import mykanban.model.Priority;
import mykanban.model.Task;


public class AddTaskController  {

    @FXML
    private TextField titleOfNewTask;

    @FXML
    private ComboBox priorityComboBox;

    @FXML
    private DatePicker dateOfNewTask;

    @FXML
    private TextArea noteOfNewTask;


    public void addButton (ActionEvent actionEvent) {

        priorityComboBox.setItems(KanbanModel.getInstance().getPriorityList());

        Task newtask = new Task( titleOfNewTask.getText(), (Priority) priorityComboBox.getValue(), dateOfNewTask.getValue(), noteOfNewTask.getText());

        KanbanModel.getInstance().getTodoList().add(newtask);

        Controller.getDoToList().setItems(KanbanModel.getInstance().getTodoList());

        Controller.getSecondaryStage().close();



    }

    public void closeAddNewTask(ActionEvent actionEvent) {

        Controller.getSecondaryStage().close();
    }
}
