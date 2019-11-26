public class ContrastTest {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        Nomal.run();
        long end=System.currentTimeMillis();
        System.out.println("--------------------运行时间： "+(end-start)+"ms");
    }
}
