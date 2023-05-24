package business;


import com.example.demo.business.DataService;
import com.example.demo.business.SomeBusinessImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class someBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;
    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario(){
//        DataService dataServiceMock = mock(DataService.class); -- replaced with @Mock
//        dataServiceMock.retrieveAllData() => new int[]{25, 15,5}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 15,5});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);-- replaced with @InjectMocks
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue(){
//        DataService dataServiceMock = mock(DataService.class); -- replaced with @Mock
//        dataServiceMock.retrieveAllData() => new int[]{25, 15,5}
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);-- replaced with @InjectMocks
        assertEquals(25, businessImpl.findTheGreatestFromAllData());
    }

}

