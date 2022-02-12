package fundamental.queue;

import org.junit.jupiter.api.Test;

class QueueTest {
    @Test
    public void test_queue(){
        LinkedQueue<String> queue = new LinkedQueue<>();
        String[] strings = {"to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "-", "-", "-", "is"};
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("-")) {
                queue.enqueue(strings[i]);
            }else{
                System.out.println("dequeue elem: " + queue.dequeue());
            }
        }
        System.out.println("\n*****遍历队列: *****");
        System.out.println(queue);
        System.out.println(queue.size() + " left on queue");
    }
}
