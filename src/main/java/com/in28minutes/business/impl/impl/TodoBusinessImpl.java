package com.in28minutes.business.impl.impl;


import com.in28minutes.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user){

        List<String> filteredToDos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);

        for(String todo : todos ){
            if(todo.contains("Spring")){
                filteredToDos.add(todo);
            }
        }

        return filteredToDos;
    }
}
