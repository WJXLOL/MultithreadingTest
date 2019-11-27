class Sl extends Thread{
    private int ticket = 500;
    public void run(){
        while (ticket>=0){
            System.out.println(Thread.currentThread().getName()+" ticket = " + ticket--);
            try {
                Thread.sleep(100);
            }catch (Exception ignored){}
        }
    }
}


class S implements Runnable{
    private int ticket = 500;
    public void run(){
       while (ticket>=0){
                System.out.println(Thread.currentThread().getName()+" ticket = " + ticket--);
                try {
                    Thread.sleep(100);
                }catch (Exception ignored){}
            }
        }
    }


class Nomal {
    static void run(){
        int ticket = 500;
        while (ticket>=0){
            System.out.println(Thread.currentThread().getName()+" ticket = " + ticket--);
            try {
                Thread.sleep(100);
            }catch (Exception ignored){}
        }
    }
}



public class ThreadTest{
    public static void main(String[] args){
        boolean i = true;
        S my = new S();
        long start=System.currentTimeMillis();//获取开始时间
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
        while (i){
            if(Thread.activeCount()==2)
            {
                long end=System.currentTimeMillis();        //获取结束时间
                System.out.println("--------------------运行时间： "+(end-start)+"ms");
                i = false;
            }
        }
    }
}

//Nomal.run();
//new Sl().start();new Sl().start();new Sl().start();new Sl().start();