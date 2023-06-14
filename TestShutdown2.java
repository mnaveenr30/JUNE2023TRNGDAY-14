class TestShutdown2{
    public static void main(String args[]){
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new Thread(){
            public void run(){
                System.out.println("Shut Down Hook task Completed...");
            }
        });
        System.out.println("Now main sleeping....press ctrl+c to exit");
        try{
            Thread.sleep(10000);
        }catch(Exception e){}
    }
}