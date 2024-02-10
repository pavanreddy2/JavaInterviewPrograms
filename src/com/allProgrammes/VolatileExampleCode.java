package com.allProgrammes;

class VolatileExample{
    private volatile boolean flag = false;

    public void toggleFlag(){
     flag = !flag;
    }

    public boolean isFlag (){
     return flag;
    }
}
 public class VolatileExampleCode {
  public static void main(String[] args) {
   VolatileExample ex = new VolatileExample();
   Thread thread1 = new Thread(() -> {
      ex.isFlag();
      System.out.println("Flag set to true by thread1");
     try {
      Thread.sleep(1000);
     }catch (InterruptedException e){
      e.printStackTrace();
     }
   });
    Thread thread2 = new Thread(() -> {
     try {
      Thread.sleep(500);
     } catch (InterruptedException e){
      e.printStackTrace();
     }
    boolean result = ex.isFlag();
     System.out.println("Falg value read by Thread2 "+result);
    });

    thread1.start();
    thread2.start();
  }
}
