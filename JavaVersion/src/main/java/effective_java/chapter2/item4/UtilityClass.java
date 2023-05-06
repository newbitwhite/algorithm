package effective_java.chapter2.item4;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 10:51
 */
public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError("工具类禁止实例化 & 继承");
    }

    public static void main(String[] args) {
        UtilityClass utilityClass = new UtilityClass();

    }
}
