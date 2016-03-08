package by.it.akhmelev.JD02_01;

class Threads_07_ExceptMain {
    static class SimpleThread extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
            System.out.println("end of SimpleThread");
        }
    }
    //=======================================================
    public static void main(String[ ] args) {
            new SimpleThread().start();
            System.out.println("end of main with exception");
            throw new RuntimeException();
        }
}

