package HomeWork.HomeWork1;
//5*. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5 {
    static int[] nums =  {3, 2, 2, 3};
    
    public static void main(String[] args) {
        int countLeft = 0;
        int countRight = nums.length - 1;
        int val = 3;
        int [] numsRes = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                numsRes[countRight] = val;
                countRight -= 1;
            }
            else {
                numsRes[countLeft] = nums[i];
                countLeft += 1;
            }
        }
        for (int v : numsRes)
            System.out.print(v);
    }
}

