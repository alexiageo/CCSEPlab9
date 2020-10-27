package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Security unit tests")
@Tag("security")
public class appSecuritySpec {
    // Test to ensure that passing 1000000.1 returns 1100000.11
    @Test
    public void amount_1000000dot1_return_1100000dot11() {
        // Test
    }

    // Test to ensure that passing an amount larger than the max
    // value for a Double throws an exception
    @Test
    public void amount_bigger_than_doubleMax_throw_exception() {
        // Test
    }

    // Test to ensure that passing an amount smaller than the min
    // value for a Double throws an exception
    @Test
    public void amount_less_than_doubleMin_throw_exception() {
        // Test
    }

    // Test to ensure a negative amount throws an exception
    @Test
    public void amount_negative_throw_exception() {
        // Test
    }

    // Test to ensure that an amount of 0 throws an exception
    @Test
    public void amount_zero_throw_exception() {
        // Test
    }
}
