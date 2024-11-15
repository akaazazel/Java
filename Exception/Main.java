class NegativeNumberException extends Exception{
  NegativeNumberException(String m){
    super(m);
  }
}

class Main{
  public static void checkNumber(int n) throws NegativeNumberException{
    if(n < 0){
      throw new NegativeNumberException("number is negative");
    }else{
      System.out.println("number is positive!");
    }
  }

  public static void main(String[] args) {
    int num = 3;

    try{
      checkNumber(num);
    }catch(NegativeNumberException e){
      System.out.println("Error! "+e.getMessage());
    }
    finally{
      System.out.println("Completed!");
    }
  }
}