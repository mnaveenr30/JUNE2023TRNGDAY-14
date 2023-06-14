class Task extends Thread{
    String Threadname;
    public Task(String name){Threadname=name;}
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(Threadname+" is Daemon Thread");
        }
        else{System.out.println(Threadname+" is User Thread");}
    }
    public static void main(String RGS[]){
        Task Thread1=new Task("Thread1");
        Task Thread2=new Task("Thread2");
        Thread1.setDaemon(true);
        Thread1.start();
        Thread2.start();
    }
}