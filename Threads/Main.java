class MultiThread{
  int limit;
  int count = 1;

  MultiThread(int n) {
    this.limit = n;
  }
  
  synchronized void printOdd(){
    while(count <= limit){
      if(count % 2 == 0){
        try {
          wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println(count);
      count++;
      notify();
    }
  }

  synchronized void printEven(){
    while(count <= limit){
      if(count % 2 != 0){
        try {
          wait();
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
      }
      System.out.println(count);
      count++;
      notify();
    }
  }
}

class Main{
  public static void main(String[] args) {
      MultiThread thread0 = new MultiThread(10);

      Thread t1 = new Thread(
        new Runnable() {
          public void run(){
            thread0.printOdd();
          }
        }
      );
      Thread t2 = new Thread(
        new Runnable() {
          public void run(){
            thread0.printEven();
          }
        }
      );

      t1.start();
      t2.start();
  }
}