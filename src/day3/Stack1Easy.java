package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack1Easy {

    public void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10000];

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0 ; i < count; i++){
            String[] input = bufferedReader.readLine().split(" ");
            if(input.length == 1){
                int result = input[0].equals("empty") ? empty(array) : top(array);
                System.out.println(result);
            }else{
                push(array, Integer.parseInt(input[1]));
            }
        }
        bufferedReader.close();
    }

    private int empty(int[] array){
        for (int j : array) {
            if (j != 0)
                return 0;
        }
        return 1;
    }

    private int top(int[] array){
        for(int i= array.length-1 ; i >= 0; i--){
            if(array[i] != 0){
                return array[i];
            }
        }
        return -1;
    }

    private void push(int[] array, int x){
        for(int k=0; k < array.length; k++){
            if(array[k] == 0){
                array[k] = x;
                return;
            }
        }
    }
}
