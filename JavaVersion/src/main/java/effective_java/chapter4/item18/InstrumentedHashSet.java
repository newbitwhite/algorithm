package effective_java.chapter4.item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Broken - Inappropriate use of inheritance!
 * <p>不恰当的使用继承</p>
 * @author ：xiaobai
 * @date ：2023/5/9 17:13
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int addCount;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }


    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());  //should out put : 3, output: 6
    }
}
