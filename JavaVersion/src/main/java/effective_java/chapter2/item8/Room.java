package effective_java.chapter2.item8;

import java.lang.ref.Cleaner;

/** An autocloseable class using a cleaner as a safety net (Page 32) **/
public class Room implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();

    /** Resource that requires cleaning. Must not refer to Room! **/
    private static class State implements Runnable {
        int numJunkPiles; // Number of junk piles in this room

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // Invoked by close method or cleaner
        @Override public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    /** Our cleanable. Cleans the room when it’s eligible for gc **/
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        // The state of this room, shared with our cleanable
        State state = new State(numJunkPiles);
        cleanable = CLEANER.register(this, state);
    }

    @Override public void close() {
        cleanable.clean();
    }
}
