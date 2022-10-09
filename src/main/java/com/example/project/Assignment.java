package com.example.project;
/* 
 Module: CS4421 (ISE)
 Lecturer: Dr. Salim Saay
 Teaching Assistants: Adam J. Doherty & Ivan Guevara
*/


public class Assignment {
    
    // Please find instructions in readme.md 
    public static int findSecondSmallestItem(int[] arr){

        return 0;
    }

    // Please find instructions in readme.md 
    public static String showFrequency(int[] arr){
        
        return "";
    } 
    
    // Please find instructions in readme.md 
    public static int lowestCommonDenominator(int[] arr){

        return 0;
    }

    public static void main(String[] args) {
        
        int[] arr = new int[]{ 5, 8, 3, 2, 6};
        System.out.println(findSecondSmallestItem(arr));
        System.out.println(showFrequency(arr));
        System.out.println(lowestCommonDenominator(arr));


        int[] arr2 = new int[]{ 3, 8, 5, 2, 6 };
        System.out.println(findSecondSmallestItem(arr2));
        System.out.println(showFrequency(arr2));
        System.out.println(lowestCommonDenominator(arr2));

        int[] arr3 = new int[]{ 6, 8, 5, 2, 6};
        System.out.println(findSecondSmallestItem(arr3));
        System.out.println(showFrequency(arr3));
        System.out.println(lowestCommonDenominator(arr3));

        int[] arr4 = new int[]{ 3, 3, 3, 3, 3, 3 };
        System.out.println(findSecondSmallestItem(arr4));
        System.out.println(showFrequency(arr4));
        System.out.println(lowestCommonDenominator(arr4));

        int[] arr5 = new int[]{ 3, 4, 3, 3, 3, 3  };
        System.out.println(findSecondSmallestItem(arr5));
        System.out.println(showFrequency(arr5));
        System.out.println(lowestCommonDenominator(arr5));

        int[] arrEmpty = new int[]{};
        System.out.println(findSecondSmallestItem(arrEmpty));
        System.out.println(showFrequency(arrEmpty));
        System.out.println(lowestCommonDenominator(arrEmpty));

        int[] arrOne = new int[]{ 1 };
        System.out.println(findSecondSmallestItem(arrOne));
        System.out.println(showFrequency(arrOne));
        System.out.println(lowestCommonDenominator(arrOne));

        int[] arrordered = new int[]{ 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 };
        System.out.println(findSecondSmallestItem(arrordered));
        System.out.println(showFrequency(arrordered));
        System.out.println(lowestCommonDenominator(arrordered));
    }


}
