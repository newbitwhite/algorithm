package effective_java.chapter3.item10.composition;

import effective_java.chapter3.item10.Point;

import java.awt.*;
import java.util.Objects;

/**
 * 基于组合而不是继承，将Point作为ColorPoint的一个成员，并提供一个返回Point类型的方法（asPoint）
 * @author ：xiaobai
 * @date ：2023/5/9 9:11
 */
public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    /**
     * 返回一个Point - color point的Point视图.
     */
    public Point asPoint() {
        return point;
    }

    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override public int hashCode() {
        return 31 * point.hashCode() + color.hashCode();
    }


    public static void main(String[] args) {
        // Point 与 ColorPoint 不是等价类，不能比较
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.red);
        System.out.println(p.equals(cp.point) + " " + cp.point.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.red);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.blue);
        System.out.printf("%s %s %s%n",
                p1.point.equals(p2), p2.equals(p3.point), p1.equals(p3));
    }
}
