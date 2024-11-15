class Table{
  synchronized void printTable(int n){
    for(int i = 1; i <= 5; i++){
      System.out.println(i*n);
    }
  } 
}

class Thread1 extends Thread{
  Table t;
  Thread1(Table t){
    this.t = t;
  }
  public void run(){
    t.printTable(5);
  }
}

class Thread2 extends Thread{
  Table t;
  Thread2(Table t){
    this.t = t;
  }
  public void run(){
    t.printTable(100);
  }
}

class ThreadSync{
  public static void main(String[] args) {
      Table t = new Table();
      Thread1 t1 = new Thread1(t);
      Thread2 t2 = new Thread2(t);

      t1.run();
      t2.run();
  }
}

/*
Step 1: Start.
Step 2: Create a class named Table.
Step 3: Create a synchronized method named printTable() to print the multiplication table.
Step 4: Create a thread named MyThread1that extends Thread class.
Step 5: In MyThread1 class, define the run() to print the print the multiplication table of 5.
Step 6: Create a thread named MyThread2that extends Thread class.
Step 7: In MyThread2 class, define the run() to print the print the multiplication table of 100.
Step 8: Create a class with main function and do the following steps:
Step 9: Create an object of Table class and pass the object to the Thread classes.
Step 10: Invoke the start() method.
Step 11: Stop
 */