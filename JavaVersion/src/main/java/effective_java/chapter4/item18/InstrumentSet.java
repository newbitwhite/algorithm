package effective_java.chapter4.item18;

import java.util.Collection;
import java.util.Set;

/**
 *  Wrapper class - uses composition in place of inheritance
 *  <p>包装类——使用组合代替继承</p>
 *  <p>两个类只有满足is-a关系时才应该建立继承关系。</p>
 *  <p>Java库中有很多违反这一原则的地方，如Stack不是Vector却继承了后者，Properties不是HashTable也继承了后者。这些情况本应该使用组合。</p>
 * @author ：xiaobai
 * @date ：2023/5/9 17:24
 *
 * @param <E>
 */
public class InstrumentSet<E> extends ForwardingSet<E>{

    private int addCount;

    public InstrumentSet(Set<E> s, int addCount) {
        super(s);
        this.addCount = addCount;
    }

    @Override
    public boolean add(E e) {
        this.addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        this.addCount += c.size();
        return super.addAll(c);
    }
}
