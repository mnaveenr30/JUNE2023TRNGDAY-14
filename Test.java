class ChildThread extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){System.out.println(e);}
            System.out.println("ChildThread exexution :"+i);
        }
    }
}
class Test{
    public static void main(String args[])throws Exception{
        ChildThread th1=new ChildThread();
        th1.start();
        th1.join();
        System.out.println("Main Thread Compleated");
    }
}