package Entities;

public class SavingAccount extends Account{
	private Double InterestRate;
	   
	   public SavingAccount() {
	   }
	   
	   public SavingAccount(Integer number,String holder, Double balance, Double InterestRate) {
		   super(number, holder, balance);
		   this.InterestRate = InterestRate;
	   }

		public Double getInterestRate() {
			return InterestRate;
		}
		
		public void setInterestRate(Double interestRate) {
			InterestRate = interestRate;
		}
		
		public void updateBalance() {
			balance += balance*InterestRate;
		}
		
		@Override
		public  void saque(double amount) {
			balance -= amount;
		}
}
