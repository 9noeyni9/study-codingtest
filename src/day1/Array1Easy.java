package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1Easy {
    public void solution() throws IOException {
        // 입력값 받기
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // 배열 생성 및 초기화
        int[] array = new int[10000];

        // 횟수 번호 입력
        int number = Integer.parseInt(buffer.readLine());

        // 입력 받은 만큼 반복
        for (int i = 0; i < number; i++) {

            // 실행 단어 및 숫자 입력
            String word = buffer.readLine();

            // 공백으로 수행 단어 숫자 구분해서 배열 생성
            String[] inputResult = word.split(" ");

            // 첫번째 단어
            String index0 = inputResult[0];

            // 배열 크기에 따라 변수 설정
            int index1, index2 = 0;
            if (inputResult.length > 2) {
                index1 = Integer.parseInt(inputResult[1]);
                index2 = Integer.parseInt(inputResult[2]);
            } else {
                index1 = Integer.parseInt(inputResult[1]);
            }

            // 첫번째 단어로 수행할 로직 구분
            switch (index0) {

                case "at" -> {
                    at(array, index1, index2);
                }

                case "set" -> {
                    set(array, index1, index2);
                }

                case "add" -> {
                    add(array, index1, index2, i);
                }
            }
        }
        buffer.close();
    }

    void at(int[] array, int number1, int number2) {
        if (array[number1] == 0) {
            System.out.println(0);
        } else {
            System.out.println(array[number2]);
        }
    }

    void set(int[] array, int number1, int number2) {
        if (array[number1] == 0) {
            System.out.println(0);
        } else {
            array[number1] = number2;
        }
    }

    void add(int[] array, int number1, int number2, int i) {
        if (array[number1] != 0) {
            int[] copyOfArray = array;
            for (int a = 0; a < array.length; a++) {
                copyOfArray[i] = array[i];
            }
            for (int j = number1; j < array.length; j++) {
                if (array[j] == 0) break;
                array[j + 1] = copyOfArray[j];
            }
            array[number1] = number2;
        } else {
            for (int k = 0; k < array.length; k++) {
                if (array[k] == 0) {
                    array[k] = number2;
                    break;
                }
            }
        }
    }
}
