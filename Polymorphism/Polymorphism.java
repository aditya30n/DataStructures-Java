package Polymorphism;

public class Polymorphism {
public static void main(String[] args){
	SuperClass sup = new SuperClass();
	SuperClass sub = new SubClass();
	SubClass sc = new SubClass();
	  sup.showmessage();
      sub.showmessage();
}
}
