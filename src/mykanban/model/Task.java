package mykanban.model;

import java.time.LocalDate;
import javafx.stage.Window;

public class Task extends Window{

    private Priority priority;
    private LocalDate localdate;
    private String title;
    private String note;

    public Task (String title, Priority priority, LocalDate localdate, String note)  {
        this.priority = priority;
        this.localdate = localdate;
        this.title = title;
        this.note = note;
    }

    Task(){
        this.title = "Empty";
        this.note = "";
        this.localdate = null;
        this.priority = null;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString(){
        return title;
    }

}
