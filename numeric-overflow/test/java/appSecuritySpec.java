package app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Security unit tests")
@Tag("security")
public class appSecuritySpec {
    // Test to make sure an amount bigger than the max value of
    // an Integer throws an ArithmeticException
    @Test
    public void amount_bigger_than_IntMax_throw_exception() {
        assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval("2147648437");
        });
    }

    // Test to make sure an amount smaller than the min value of
    // an Integer throws an ArithmeticException
    @Test
    public void amount_less_than_IntMin_throw_exception() {
         assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval(Integer.toString(Integer.MIN_VALUE));
        });
  
    }

    // Test to make sure an amount larger than the max value of
    // an Integer after the surcharge is calculated throws an ArithmeticException
    @Test
    public void amount_bigger_than_IntMax_after_surchage_throw_exception() {
           assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval(Integer.toString(Integer.MAX_VALUE - 9));
        });

    }

    // Test to make sure a negative amount throws an ArithmeticException
    @Test
    public void amount_negative_throw_exception() {
        assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval("-100");
        });
    }

    // Test to make sure an amount of 0 throws an IllegalArgumentException
    @Test
    public void amount_zero_throw_exception() {
        assertThrows(ArithmeticException.class, () -> {
            Main app = new Main();
            boolean res = app.approval("0");
        });

    }

    // Test to make sure an amount of null throws a NullPointerException
    @Test
    public void amount_null_throw_exception() {
        assertThrows(NullPointerException.class, () -> {
            Main app = new Main();
            boolean res = app.approval(null);
        });

    }

}
