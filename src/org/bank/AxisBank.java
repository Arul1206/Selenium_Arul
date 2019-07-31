package org.bank;

public class AxisBank extends BankInfo{
@Override
public void deposit() {
	// TODO Auto-generated method stub
	System.out.println("15%");
}
public static void main(String[] args) {
	AxisBank a=new AxisBank();
	a.saving();
	a.fixed();
	a.deposit();
}
}
