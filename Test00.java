class Customer{
    int amount=10000;
    synchronized void withdraw(int amount){
        System.out.println("going to Withdraw");
        if(this.amount<amount){
            System.out.println("Less Balance ; waiting for deposite...");
            try{
                wait();
            }
            catch(Exception e){}
        }
        this.amount=amount;
        System.out.println("withdraw completed...");
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposite");
        this.amount+=amount;
        System.out.println("deposit completed...");
        notify();
    }
}
class Test00{
    public static void main(String aregs[]){
        final Customer e=new Customer();
        new Thread(){
            public void run(){
                e.withdraw(15000);
            }
        }.start();
    }
}
class Test00{
    public static void main(String args[]){
        final Customer c=new Customer();
        new Customer(){
            public void run(){
                c.withdraw(15000);
            }
        }.start();
        new Thread(){
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}