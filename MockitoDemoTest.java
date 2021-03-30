package com.company;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class MockitoDemoTest {
    @Test
    public void shouldReturnSizeOfTheList(){
        List<String> mockList=mock(List.class);
        when(mockList.size()).thenReturn(5);
        assertTrue(mockList.size()==5);
    }
    @Test
    public void shouldCheckIndexOfValues(){
        List<String>list=new ArrayList<>();
        List<String>list1=spy(list);
        when(list1.size()).thenReturn(5);
        assertEquals(5,list1.size());
        list1.add("orange");
        list1.add("apple");
        assertEquals("apple",list1.get(1));

    }

}