package assignment;

/*
Question 36:
Create a Tank class that has a termination condition: 
releaseTank() must be called before the object is cleaned up.
Use finalize() to check this.
*/

public class Question36 {

    static class Tank {
        private boolean isReleased = false;

        public void fill() {
            System.out.println("Tank is filled.");
        }

        public void empty() {
            System.out.println("Tank is emptied.");
        }

        public void releaseTank() {
            isReleased = true;
            System.out.println("Tank is released properly.");
        }

        @Override
        protected void finalize() throws Throwable {
            if (!isReleased) {
                System.out.println("⚠️ WARNING: Tank was not released before cleanup!");
            } else {
                System.out.println("✅ Tank cleanup verified in finalize().");
            }
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Case 1: Properly released
        Tank t1 = new Tank();
        t1.fill();
        t1.empty();
        t1.releaseTank();
        t1 = null; // eligible for GC

        // Case 2: Not released
        Tank t2 = new Tank();
        t2.fill();
        t2.empty();
        // releaseTank() not called
        t2 = null; // eligible for GC

        // Suggest garbage collection
        System.gc();

        // Give GC time to run (optional, for testing)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
Output (May vary depending on JVM GC):
Tank is filled.
Tank is emptied.
Tank is released properly.

Tank is filled.
Tank is emptied.

✅ Tank cleanup verified in finalize().
⚠️ WARNING: Tank was not released before cleanup!
*/
