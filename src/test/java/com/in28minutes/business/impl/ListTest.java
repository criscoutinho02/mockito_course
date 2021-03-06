package com.in28minutes.business.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void letsMockListsSizeMethodTest(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("Cris").thenReturn("Rocky");


        assertEquals("Cris" , listMock.get(3));
        assertEquals("Rocky" , listMock.get(5));



    }

    @Test
    public void letsMockListsGet_BDD(){
        //Given
        List<String> listMock = mock(List.class);
        given(listMock.get(anyInt())).willReturn("Cris");
        //When
        String result = listMock.get(3);
        //Then
        Assert.assertThat(result , is("Cris"));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockLists_throwsAnException(){
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something Wrong"));

        listMock.get(0);



    }

    @Test(expected = RuntimeException.class)
    public void letsMockLists_mixingUp(){
        List listMock = mock(List.class);
        when(listMock.subList(anyInt() , 5)).thenThrow(new RuntimeException("Something Wrong"));

        listMock.get(0);



    }
}
