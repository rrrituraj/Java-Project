package com.tcs.OOPS.Inheritence;

public class LoanTest {

	public static void main(String[] args) {
		HLoan hl = new HLoan();
		hl.loanType();
		hl.getInterestRate();
		VLoan vl = new VLoan();
		vl.loanType();
		vl.getInterestRate();
		PLoan pl = new PLoan();
		pl.loanType();
		pl.getInterestRate();

	}

}
