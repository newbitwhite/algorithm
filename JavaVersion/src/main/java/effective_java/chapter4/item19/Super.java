package effective_java.chapter4.item19;

/**
 * @author ：xiaobai
 * @date ：2023/5/11 15:35
 */

// Class whose constructor invokes an overridable method. NEVER DO THIS!
public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }

    public void overrideMe() {
    }
}
