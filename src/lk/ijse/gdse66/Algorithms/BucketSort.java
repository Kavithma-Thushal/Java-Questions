package lk.ijse.gdse66.Algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 8:44 PM - 12/28/2023
 **/
public class BucketSort {
    public static void main(String[] args) {
        double[] array = {0.897, 0.565, 0.656, 0.1234, 0.665, 0.3434};
        System.out.println("Original Array : " + Arrays.toString(array));

        bucketSort(array);
        System.out.println("Sorted Array   : " + Arrays.toString(array));
    }

    public static void bucketSort(double[] array) {
        int n = array.length;

        // Create buckets
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place elements into buckets
        for (double value : array) {
            int bucketIndex = (int) (n * value);
            buckets[bucketIndex].add(value);
        }

        // Sort each bucket
        for (ArrayList<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate the sorted buckets into the original array
        int index = 0;
        for (ArrayList<Double> bucket : buckets) {
            for (double value : bucket) {
                array[index++] = value;
            }
        }
    }
}