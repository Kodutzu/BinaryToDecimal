public class Main {
  public static void main(String[] args) {

    Main obj = new Main();
    obj.Converter(11111111);

    
  }

  public void Converter(long Binary) {

   boolean req = checker(Binary);
   
   if(req == true) {

      int digit = countDigit(Binary);
      int Decimal = 0;
      for(int i = 0; i < digit ; ++i) {

        long SingleDigit = Binary%10;
        Decimal += SingleDigit * Math.pow(2, i);
        Binary /=10;
      }

      System.out.println("Decimal Number: " + Decimal);
     
   } else {

     System.out.println("Not a Binary Number");
   }

   
 } 

  public boolean checker(long num) {

    boolean cond = true;
    
    while(num != 0 ) {

      long digit = num%10;
      if(digit > 1) {

        cond = false;
        break;
      }
      num /=10;
      
    }
    return cond;
    
  } 

  public int countDigit(long num) {
    
    int count = 0;
    while(num!=0) {
      num = num/10;
      ++count;
    }
    return count;
  }
  

}
