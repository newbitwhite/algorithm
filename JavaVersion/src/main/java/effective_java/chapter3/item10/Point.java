package effective_java.chapter3.item10;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 17:53
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /** 0. 添加 Override 注解 **/
    @Override
    public boolean equals(Object o) {
        // 1.使用＝＝操作符检查“参数是否为这个对象的引用.如果是，则返回 true
        if (this == o) {
            return true;
        }
        //2. 使用 nstanceof 操作符检查“参数是否为正确的类型” 如果不是，则返回 false
        if (!(o instanceof Point)) {
            return false;
        }
        //3. 把参数转换成正确的类型 (因为转换之前进行过且stanceof 测试，所以确保会成功)
        Point point = (Point) o;
        //4. 对于该类中的每个“关键”字段，检查参数中的字段是否与该对象中对应的字段相匹配
        return x == point.x && y == point.y;
    }

    // Broken - violates Liskov substitution principle (违反里氏替换原则)
//    @Override public boolean equals(Object o) {
//        if (o == null || o.getClass() != getClass()) {
//            return false;
//        }
//        Point p = (Point) o;
//        return p.x == x && p.y == y;
//    }

    @Override public int hashCode()  {
        return 31 * x + y;
    }



}
