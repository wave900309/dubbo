package net.ken.core;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Yang, Haiqiang on 2018/11/08.
 */
public class QueueLearning {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        queue.put("1");
        queue.put("2");
        queue.put("3");
        queue.remove("2");
        queue.put("2.2");
        System.out.println(queue);
        RM rm = new RM<>(queue);
        rm.run();
        queue.put("4");
        System.out.println(queue);
        Thread.sleep(50);
        System.out.println(queue);
    }

    static class RM<E> implements Runnable {

        ArrayBlockingQueue<E> queue;

        RM(ArrayBlockingQueue<E> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("remove done");
            queue.remove();
        }
    }
}
