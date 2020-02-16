package Program2;

import java.util.HashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(1);
        productOfNumbers.add(2);
        productOfNumbers.add(4);
        productOfNumbers.add(6);
        System.out.println(productOfNumbers.getProduct(3));
    }
}

class ProductOfNumbers {

    private int[] nums = new int[40000];
    private int count = 0;

    public ProductOfNumbers() {

    }

    public void add(int num) {
        nums[count] = num;
        count++;
    }

    public int getProduct(int k) {
        int result = 1;
        for (int i = count - 1; i >= count - k; i--)
            result *= nums[i];
        return result;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */