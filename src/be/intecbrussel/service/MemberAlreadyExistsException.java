package be.intecbrussel.service;

public class MemberAlreadyExistsException extends Exception{
	
	public MemberAlreadyExistsException(String s) {
		super(s);
	}
}
