package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        for (int i = 1; i < elements.length; i++) {
            int val = elements[i];
            int idx = i;
            while (idx > 0 && val < elements[idx - 1]) {
                elements[idx] = elements[idx - 1];
                idx--;
            }
            elements[idx] = val;
        }
        return elements;
    }

   
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int smallestidx = i;
            int smallest = elements[i];
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < smallest) {
                    smallest = elements[j];
                    smallestidx = j;
                }
            }
            if (smallestidx != i) {
                int temp = elements[i];
                elements[i] = elements[smallestidx];
                elements[smallestidx] = temp;
            }
        }
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String string = words.get(i);
            int idx = i;
            while (idx > 0 && string.compareTo(words.get(idx - 1)) < 0) {
                words.set(idx, words.get(idx - 1));
                idx--;
            }
            words.set(idx, string);
        }
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int smallestidx = i;
            String smallest = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(smallest) < 0) {
                    smallest = words.get(j);
                    smallestidx = j;
                }
            }
            if (smallestidx != i) {
                String temp = words.get(i);
                words.set(i, words.get(smallestidx));
                words.set(smallestidx, temp);
            }
        }
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}