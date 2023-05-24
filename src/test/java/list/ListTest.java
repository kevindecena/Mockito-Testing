package list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void simpleTest(){
        List listMock = mock(List.class);

//        listMock.size() => 3;
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void multipleReturns(){
        List listMock = mock(List.class);

//        listMock.size() => 3;
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    @Test
    void parameters(){
        List listMock = mock(List.class);
//        listMock.size() => 3;
        when(listMock.get(0)).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals(null, listMock.get(1));
    }

    @Test
    void genericParameter(){
        List listMock = mock(List.class);
//        listMock.size() => 3;
        when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals("Some String", listMock.get(2));
        assertEquals("Some String", listMock.get(1));
    }


}
