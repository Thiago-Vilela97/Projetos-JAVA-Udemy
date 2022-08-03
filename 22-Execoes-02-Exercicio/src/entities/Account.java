package entities;

import exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void deposit(Double amount) {
		balance =+ amount;
	}
	public void withDraw(Double amount) throws DomainException {
		if (amount > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit!");
		}
		if (balance - amount < 0) {
			throw new DomainException("Not enought balance");
		}
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "Nem balance $ "
				+String.format("%.2f", balance) ;
	}
	
	
}
