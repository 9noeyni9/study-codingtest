package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queue1Easy {
    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int queueSize = Integer.parseInt(bufferedReader.readLine());

        int countNumber = Integer.parseInt(bufferedReader.readLine());

        int[] queue = new int[queueSize];
        for (int i = 0; i < countNumber; i++) {
            String input = bufferedReader.readLine();
            if (input.contains("enqueue")) {
                int number = Integer.parseInt(input.substring(8, 9));
                enqueue(queue, number);
            } else if (input.contains("size")) {
                System.out.println(size(queue));
            } else if (input.contains("isEmpty")) {
                System.out.println(isEmpty(queue));
            }
        }
    }

    public void enqueue(int[] queue, int number) {
        if (size(queue) == queue.length) {
            System.out.println("Full");
        } else {
            for (int j = 0; j < queue.length; j++) {
                if (queue[j] == 0) {
                    queue[j] = number;
                    break;
                }
            }
        }
    }

    public int size(int[] queue) {
        int intCount = 0;
        for (int i : queue) {
            if (i != 0) {
                intCount++;
            }
        }
        return intCount;
    }
    public int isEmpty(int[] queue){
        return size(queue) == 0 ? 1 : 0;
    }
}
