package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2Hard {
    public void solution() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(buffer.readLine());
        for(int a =0; a < count; a++){
            int length = Integer.parseInt(buffer.readLine());
            int[] array = new int[length];
            String[] beforeArray = buffer.readLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(beforeArray[i]);
            }
            int korean = 0; int japanese = 0; int chinese = 0;
            int koreanCount = 0; int japaneseCount = 0; int chineseCount = 0;
            for (int j = 0; j < array.length; j++) {
                if (j % 3 == 0) {
                    korean += array[j];
                    if(array[j] != 0)
                        koreanCount++;
                }
                if (j % 3 == 1) {
                    japanese += array[j];
                    if(array[j] != 0)
                        japaneseCount++;
                }
                if (j % 3 == 2) {
                    chinese += array[j];
                    if(array[j] != 0)
                        chineseCount++;
                }
            }
            System.out.println(korean + " " + japanese + " " + chinese);
            System.out.println((int)(korean/(double)koreanCount) + " " + (int)(japanese/(double)japaneseCount) + " " + (int)(chinese/(double)chineseCount));
        }
    }
}
