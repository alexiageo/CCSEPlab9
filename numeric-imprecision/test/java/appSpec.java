package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Usability unit tests")
public class appSpec {
    @Test
    public void amount_100_return_110() {
        assertEquals(String.valueOf(Main.getTaxedTotal("100")), "110.0");
    }

}
