package effective_java.chapter3.item10;

import com.google.common.base.Objects;

/**
 * @author ：xiaobai
 * @date ：2023/5/9 9:24
 */
public class PhoneNumber {

    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && prefix == that.prefix && lineNum == that.lineNum;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(areaCode, prefix, lineNum);
    }

    /**
     * 1. 覆盖 equals 时总要覆盖 hashCode
     * 2. 不要企图让 equals 方法过于智能
     * 3. 不要将 equals 声明中的 Object 对象替换为其他的类型
     */
}
