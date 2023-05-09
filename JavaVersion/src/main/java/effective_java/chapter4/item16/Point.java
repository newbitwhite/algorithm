package effective_java.chapter4.item16;

/**
 * 对于public类，使用getter、setter访问其字段
 * @author ：xiaobai
 * @date ：2023/5/9 16:04
 */
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
