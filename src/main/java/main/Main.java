package main;

public class Main {
    public static void main(String[] args) {

    }

    static int[] getRepetitions(int[] arr, int repeat) {
        int[] secondArr = new int[arr.length];
        int count = 0, index = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count >= repeat) {
                        for (int value : secondArr) {
                            if (value == arr[i]) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            flag = false;
                            break;
                        } else {
                            secondArr[index] = arr[i];
                            index++;
                            break;
                        }
                    }
                }
            }
            count = 0;
        }
        int[] temp = new int[index];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = secondArr[i];
        }
        return temp;
    }

    static int[] getRepetitions(int[][] arr, int repeat) {
        int count = 0;
        for (int[] value : arr) {
            for (int nvalue : value) {
                count++;
            }
        }
        int[] temp = new int[count];
        count = 0;
        for (int[] value : arr) {
            for (int nvalue : value) {
                temp[count] = nvalue;
                count++;
            }
        }
        return getRepetitions(temp, repeat);
    }
}
