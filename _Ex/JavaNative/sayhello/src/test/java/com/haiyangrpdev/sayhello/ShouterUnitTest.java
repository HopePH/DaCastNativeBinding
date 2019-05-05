package com.haiyangrpdev.sayhello;

import android.content.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ShouterUnitTest {

    @Mock
    Context mockContext;

    @Test
    public void testShowToast() {
        Shouter shouter = new Shouter(mockContext);
        shouter.ShoutHello(true);
        assertEquals("Toast success!",shouter.getMessage());
    }

    @Test
    public void testNullContext() {
        try {
            Shouter shouter = new Shouter(null);
        }
        catch (Exception e) {
            assertEquals("context == null", e.getMessage());
        }
    }
}
