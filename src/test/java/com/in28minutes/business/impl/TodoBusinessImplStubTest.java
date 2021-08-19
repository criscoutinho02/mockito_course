package com.in28minutes.business.impl;

import com.in28minutes.business.impl.impl.TodoBusinessImpl;
import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;


//import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TodoBusinessImplStubTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub(){

        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos =
                todoBusinessImpl.retrieveTodosRelatedToSpring("Cris");
        List<String> expectedResult =  new ArrayList<String>();
        expectedResult.add("Learn Spring MVC");
        expectedResult.add("Learn Spring");

        assertEquals(expectedResult , filteredTodos);

    }


}
