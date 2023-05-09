package effective_java.chapter3.item10.inheritance;

import effective_java.chapter3.item10.Point;

import java.util.Objects;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 17:55
 */
public class ColorPoint extends Point {

    private final String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // Broken - 违反对称性
    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        return super.equals(o) && Objects.equals(((ColorPoint) o).color, color);
    }

    // Broken - 违反传递性
//    @Override public boolean equals(Object o) {
//        if (!(o instanceof Point)) {
//            return false;
//        }
//
//        // If o is a normal Point, do a color-blind comparison
//        if (!(o instanceof ColorPoint)) {
//            return o.equals(this);
//        }
//
//        // o is a ColorPoint; do a full comparison
//        return super.equals(o) && Objects.equals(((ColorPoint) o).color, color);
//    }


    public static void main(String[] args) {
        // First equals function violates symmetry (违反对称性)
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, "red");
        System.out.println(p.equals(cp) + " " + cp.equals(p));

        // Second equals function violates transitivity (违反传递性)
        ColorPoint p1 = new ColorPoint(1, 2, "red");
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, "blue");
        System.out.printf("%s %s %s%n",
                p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
}
