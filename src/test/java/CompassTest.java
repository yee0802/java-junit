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

    @Test
    @DisplayName("Compass: rotate method should return correct Point with Direction RIGHT")
    public void testRotateReturnsCorrectPointWithDirectionRight() {
        var compass = new Compass();
        var direction = Compass.Direction.RIGHT;

        var northPoint = Compass.Point.NORTH;
        var eastPoint = Compass.Point.EAST;
        var westPoint = Compass.Point.WEST;
        var southPoint = Compass.Point.SOUTH;

        var result1 = compass.rotate(northPoint, direction);
        var result2 = compass.rotate(eastPoint, direction);
        var result3 = compass.rotate(southPoint, direction);
        var result4 = compass.rotate(westPoint, direction);

        assertAll(
                "Grouped Assertions for rotate",
                () -> assertEquals(eastPoint, result1),
                () -> assertEquals(southPoint, result2),
                () -> assertEquals(westPoint, result3),
                () -> assertEquals(northPoint, result4)
        );
    }

    @Test
    @DisplayName("Compass: rotate method should return correct Point with Direction LEFT")
    public void testRotateReturnsCorrectPointWithDirectionLeft() {
        var compass = new Compass();
        var direction = Compass.Direction.LEFT;

        var northPoint = Compass.Point.NORTH;
        var eastPoint = Compass.Point.EAST;
        var westPoint = Compass.Point.WEST;
        var southPoint = Compass.Point.SOUTH;

        var result1 = compass.rotate(northPoint, direction);
        var result2 = compass.rotate(westPoint, direction);
        var result3 = compass.rotate(southPoint, direction);
        var result4 = compass.rotate(eastPoint, direction);

        assertAll(
                "Grouped Assertions for rotate",
                () -> assertEquals(westPoint, result1),
                () -> assertEquals(southPoint, result2),
                () -> assertEquals(eastPoint, result3),
                () -> assertEquals(northPoint, result4)
        );
    }
}
