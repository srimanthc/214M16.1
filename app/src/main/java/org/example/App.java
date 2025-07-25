
package org.example;

import java.util.Arrays;

public class App {

    // FOR LOOP VERSIONS

    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) min = num;
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / nums.length;
    }

    // STREAM VERSIONS

    public int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public int averageUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).average().orElseThrow();
    }
}

