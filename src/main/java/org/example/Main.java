package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[args.length];
        System.out.println("Before sorting:");
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            int minIndex = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = tmp;
        }
        System.out.println("After sorting:");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}