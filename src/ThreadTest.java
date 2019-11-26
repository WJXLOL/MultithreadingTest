class Sl extends Thread{
    private int ticket = 250;
    public void run(){
        for (int i=0;i<10;i++)
        {
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName()+"ticket = " + ticket--);
            }
        }
    }
}


class S implements Runnable{
    private int ticket = 500000;
    public void run(){
       while (ticket!=0){
                System.out.println(Thread.currentThread().getName()+" ticket = " + ticket--);
            }
        }
    }


class Nomal {
    static void run(){
        int ticket = 500000;
        while (ticket!=0){
            System.out.println(Thread.currentThread().getName()+" ticket = " + ticket--);
        }
    }
}



public class ThreadTest{
    public static void main(String[] args){
        boolean i = true;
        S my = new S();
        long start=System.currentTimeMillis();   //获取开始时间
        new Thread(my).start();new Thread(my).start();
        new Thread(my).start();new Thread(my).start();
        new Thread(my).start();new Thread(my).start();//获取结束时间
        while (i){
            if(Thread.activeCount()==2)
            {
                long end=System.currentTimeMillis();
                System.out.println("--------------------运行时间： "+(end-start)+"ms");
                i = false;
            }
        }
    }
}

//Nomal.run();
//new Sl().start();new Sl().start();new Sl().start();new Sl().start();