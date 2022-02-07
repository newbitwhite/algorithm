package leetcode101.greedy.queue_reconstruction_by_height;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 406. Queue Reconstruction by Height
 * @author ：xiaobai
 * @date ：2022/1/21 14:05
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        //sort array people:algorithm_4th.element[1] min to max, if algorithm_4th.element[1] eq , algorithm_4th.element[0] max to min
        Arrays.sort(people, (o1, o2) -> {
            int compare = Integer.compare(o2[0], o1[0]);
            if (compare == 0){
                return Integer.compare(o1[1], o2[1]);
            }
            return compare;
        });

        LinkedList<int[]> list = new LinkedList<>();
        //two layers of circulation:insert algorithm_4th.element into reconstructQueue
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[people.length][]);
    }
}
