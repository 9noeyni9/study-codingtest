package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack1Hard {

    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10000];

        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            if (input.length == 1) {
                int result = 0;
                switch (input[0]){
                    case "empty" -> {
                        result = empty(array);
                    }
                    case "top" -> {
                        result = top(array);
                    }
                    case "pop" -> {
                        result = pop(array);
                    }
                    case "size" -> {
                        result = size(array);
                    }
                }
                System.out.println(result);
            } else {
                push(array, Integer.parseInt(input[1]));
            }
        }
        bufferedReader.close();
    }

    private int empty(int[] array) {
        for (int j : array) {
            if (j != 0)
                return 0;
        }
        return 1;
    }

    private int top(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                return array[i];
            }
        }
        return -1;
    }

    private void push(int[] array, int x) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] == 0) {
                array[k] = x;
                return;
            }
        }
    }

    private int pop(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] != 0) {
                int printNumber = array[a];
                array[a] = 0;
                return printNumber;
            }
        }
        return -1;
    }

    private int size(int[] array) {
        int sizeCount = 0;
        for (int b = 0; b < array.length; b++) {
            if(array[b] != 0){
                sizeCount++;
            }
        }
        return sizeCount;
    }
}
