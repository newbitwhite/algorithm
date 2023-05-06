package algorithm.leetcode101.greedy.queue_reconstruction_by_height;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QueueReconstructionByHeightTest {

    @Test
    public void test_reconstruct_queue(){
//        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        int[][] reconstructQueue = new QueueReconstructionByHeight().reconstructQueue(people);
        for (int[] r: reconstructQueue) {
            System.out.println(Arrays.toString(r));
        }
//        int[][] expected = {{5,0},{7,0},{5,2},{6,1},{4,4},{7,1}};
        int[][] expected = {{4,0},{5,0},{2,2},{3,2},{1,4},{6,0}};
        Assertions.assertArrayEquals(expected, reconstructQueue);
    }

}
