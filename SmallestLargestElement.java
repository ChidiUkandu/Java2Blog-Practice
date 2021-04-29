package com.company;

public class SmallestLargestElement {

    public static void main(String[] args) {
	// find smallest and largest numbers in array

        //use 2 pointers
        //pointer 1 will iterate thru array and compare each element with previous

        Integer[] numberArray = {1,5,8,22,7,10};

        int maxNum = numberArray[0];
        int minNum = numberArray[0];

        for(int i=0; i<numberArray.length-1; i++) {
            if(numberArray[i] > maxNum) {
                maxNum = numberArray[i];
            }
            else if(numberArray[i]<minNum) {
                minNum = numberArray[i];
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
