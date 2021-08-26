package com.in28minutes.business.impl;

import com.in28minutes.business.impl.impl.TodoBusinessImpl;
import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock(){

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC" , "Learn Spring" , "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos =
                todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        List<String> expectedResult =  new ArrayList<String>();
        expectedResult.add("Learn Spring MVC");
        expectedResult.add("Learn Spring");

        assertEquals(expectedResult , filteredTodos);

    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList(){

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos =
                todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(0 , filteredTodos.size());

    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingBDDMock(){

        TodoService todoServiceMock = mock(TodoService.class);

        List<String> todos = Arrays.asList("Learn Spring MVC" , "Learn Spring" , "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos =
                todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        List<String> expectedResult =  new ArrayList<String>();
        expectedResult.add("Learn Spring MVC");
        expectedResult.add("Learn Spring");

        assertEquals(expectedResult , filteredTodos);

    }

}
