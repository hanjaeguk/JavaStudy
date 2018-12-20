package modifer;

public class Account {
	private int balance = 0;

	static final int MIN_BALANCE = 0; // ��� ����(���� ���� ���ϰ�)
	static final int MAX_BALANCE = 1000000;
   
   
   int getBalance() {
      return this.balance;
   }
   
   void setBalance(int balance) {
      if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
         this.balance = balance;         
      }
   }
}

