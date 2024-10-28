import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompassTest {

    @Test
    @DisplayName("Compass: rotate method should return EAST when passed NORTH & RIGHT")
    public void testRotateReturnsCorrectPoint() {
        var compass = new Compass();
        var point = Compass.Point.NORTH;
        var direction = Compass.Direction.RIGHT;

        var result = compass.rotate(point, direction);

        assertEquals(Compass.Point.EAST, result);
    }
}
