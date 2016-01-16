package fi.daniel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class XboxTest {

    private Xbox xbox;

    @Test
    public void xboxShouldSaveToCloudStorage(){
        Storage mockStorage = Mockito.mock(CloudStorage.class);
        xbox = new Xbox(mockStorage);
        xbox.saveData();
        Mockito.verify(mockStorage).save("data");
        Mockito.verifyNoMoreInteractions(mockStorage);
    }

    @Test
    public void xboxShouldSaveToDiskStorage(){
        Storage mockStorage = Mockito.mock(DiskStorage.class);
        xbox = new Xbox(mockStorage);
        xbox.saveData();
        Mockito.verify(mockStorage).save("data");
        Mockito.verifyNoMoreInteractions(mockStorage);
    }
}