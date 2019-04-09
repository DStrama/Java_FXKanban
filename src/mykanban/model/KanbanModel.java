package mykanban.model;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;


public class KanbanModel {

    private ObservableList<Priority> priorityList;
    private ObservableList<Task> todoList;
    private ObservableList<Task> inProgressList;
    private ObservableList<Task> doneList;

    public ObservableList<Task> getTodoList() {
        return todoList;
    }

    private static KanbanModel kanbanModel = new KanbanModel();

    public static  KanbanModel getInstance() { return kanbanModel ;}



    private KanbanModel(){

        this.todoList = FXCollections.observableArrayList();
        this.inProgressList = FXCollections.observableArrayList();
        this.doneList = FXCollections.observableArrayList();
        this.priorityList = FXCollections.observableArrayList();

        priorityList.addAll(Priority.LOW,Priority.NORMAL,Priority.HIGH);


    }


    public ObservableList<Priority> getPriorityList() {
        return priorityList;
    }
}


