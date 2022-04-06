package Chap17.EX16;

import java.util.Objects;

public class Account {

	private String ano; // ���� ��ȣ
	private String owner; // ���� �� , �̸�
	private int balance; // ���� �ݾ�,

	Account(String ano, String owner, int balance) { // ��ü ������ �ʵ��� ���� �޾Ƽ� �ʵ忡 �ε�
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return ano + owner + balance;
	}
}
