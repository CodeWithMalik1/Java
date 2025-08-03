import java.util.Stack;

public class StockSpanProblem {
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> stack = new Stack<>();
        span[0]=1;
        stack.push(0);
        for (int i = 0; i < span.length; i++) {
            int currprice = stocks[i];
            while (!stack.isEmpty() && currprice >= stocks[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                span[i] = i + 1; // All previous prices are less than or equal to current price
            } else {
                span[i] = i - stack.peek(); // Span is the difference between current index and index of last higher price
            }
            stack.push(i); // Push current index onto the stack
            
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        stockSpan(stocks,span);
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]+" ");
        }
    }
    
}
