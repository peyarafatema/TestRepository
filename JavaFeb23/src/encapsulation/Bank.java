package encapsulation;

public class Bank {
	
	
	int accountNumber = 12345678;
	int pinNumber = 1234;
	double amount = 150000;
	
	public void drawMoney(int acctNo, int pinNo, int amount) {
		
      if(acctNo == accountNumber && pinNO == pinNumber) {
    	  
    	  if(amount <=balance ) {
    	 balance = balance - amount;
    	System.out.println("Amount withdrawn : "+ amount);
    	  } else {
    		  System.out.println("Insufficieent balance");
    	  }
    	  }else {
    		    System.out.println("Inalid credentials");
      }
	}
      public void  updatePIn(int accountNo, int oldPin, int newPin) {
    	  
    	  if(accountNo == accountNo && oldPin == pinNumber) {
    		  pinNumber = newPin;
    		  
    	  }else {
    		  System.out.println("Pin is updated");
    		  
    	  }
      }
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
