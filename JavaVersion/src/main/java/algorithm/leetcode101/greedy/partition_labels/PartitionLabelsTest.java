package algorithm.leetcode101.greedy.partition_labels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PartitionLabelsTest {

    @Test
    public void test_partition_labels(){
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = new PartitionLabels().partitionLabels(s);
        System.out.println(list);
        Assertions.assertEquals(Arrays.asList(9,7,8), list);
        String s2 = "aaaaaaaa";
        List<Integer> list2 = new PartitionLabels().partitionLabels(s2);
        System.out.println(list2);
        Assertions.assertEquals(Arrays.asList(8), list2);
    }

}
