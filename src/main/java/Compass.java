public class Compass {
    public enum Direction {
        LEFT,
        RIGHT
    }
    public enum Point {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
    public Point point;

    public Point rotate(Point point, Direction direction) {
        Point result = null;

        if (direction == Direction.LEFT) {
            if (point == Point.NORTH) {
                result = Point.WEST;
            } else if (point == Point.EAST) {
                result = Point.NORTH;
            } else if (point == Point.SOUTH) {
                result = Point.EAST;
            } else if (point == Point.WEST) {
                result = Point.SOUTH;
            }
        }

        if (direction == Direction.RIGHT) {
            if (point == Point.NORTH) {
                result = Point.EAST;
            } else if (point == Point.EAST) {
                result = Point.SOUTH;
            } else if (point == Point.SOUTH) {
                result = Point.WEST;
            } else if (point == Point.WEST) {
                result = Point.NORTH;
            }
        }

        return result;
    }
}
