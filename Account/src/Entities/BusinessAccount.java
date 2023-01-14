package Entities;

public class BusinessAccount extends Account{
	private Double loanLimit;
	   
	   public BusinessAccount() {
	   }

	   public BusinessAccount(Integer number,String holder,Double balance,Double loanLimit) {
		   super(number,holder,balance);
		   this.loanLimit = loanLimit;
	   }

		public Double getLoanList() {
			return loanLimit;
		}
		
		public void setLoanList(Double loanList) {
			this.loanLimit = loanList;
		}
		public void loan(double amount) {
			if(amount <= loanLimit) {
				balance += amount - 10.0;
			}
		}
	   
		@Override
		public void saque(double amount) {
			super.saque(amount);
			balance -= 5.0;
		}
}
