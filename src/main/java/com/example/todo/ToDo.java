package com.example.todo;
import java.util.List;

public class ToDo {
    public static List<ToDo> List;
    public static void Create(String t) {
        List.add(new ToDo(t));
    }

    private String title;
    public String getTitle() {
        return title;
    }


    private boolean completed = false;
    public boolean IsComplete() {
        return completed;
    }

    public void MarkComplete() {
        completed = true;
    }

    // ToDo can only be created using the ToDo.Create method
    // forces the created ToDo into the ToDo.List
    private ToDo(String t) {
        title = t;
    }
}
