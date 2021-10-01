public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.enQueue(1);
        s.enQueue(2);
        s.enQueue(23);
        s.enQueue(3);
        s.enQueue(4);
        s.enQueue(0);
        System.out.println("-----");
        s.displayQueue();
        System.out.println("----");
        System.out.println(s.deQueue().data);
        System.out.println("-----");
        s.displayQueue();
    }

}
