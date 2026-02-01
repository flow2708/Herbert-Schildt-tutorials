public class Stack {
    int[] stack = new int[10];
    int ios;
    public Stack() {
        ios = -1;
    }
    public void push(int item) {
        if (ios == stack.length-1) {
            System.out.println("Стек полон!");
        } else {
            stack[++ios] = item;
        }
    }
    public int pop() {
        if (ios < 0) {
            System.out.println("Стек пуст!");
            return 0;
        } else {
            int temp = stack[ios];
            stack[ios] = 0;
            ios--;
            return temp;
        }
    }
    public int peek() {
        if (ios < 0) {
            System.out.println("Стек пуст!");
            return 0;
        }
            return stack[ios];
    }
    public boolean isEmpty() {
        return ios < 0;
    }
    public boolean isFull() {
        return ios == stack.length - 1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(2);
        System.out.println("До изменений: \n");
        for (Integer num : stack.stack) {
            System.out.println(num);
        }
        System.out.println("Извлечено: " + stack.pop() + "\n");
        System.out.println("После изменений:\n");
        for (Integer num : stack.stack) {
            System.out.println(num);
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
    }
}
