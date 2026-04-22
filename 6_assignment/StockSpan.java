import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] price, int n) {
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        
        span[0] = 1;
        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            span[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] price = {10, 4, 5, 90, 120, 80};
        int[] span = calculateSpan(price, price.length);
        System.out.println(Arrays.toString(span));
    }
}
