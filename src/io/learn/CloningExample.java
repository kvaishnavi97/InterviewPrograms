package io.learn;

public class CloningExample implements Cloneable {

	public static void main(String[] args) {

		College college = new College("MIT", new Library("History of Shivaji Maharaj"));
		// college.clone(); //The method clone() from the type Object is not visible

		CloningExample cloneEx = new CloningExample();
		// cloneEx.clone(); //allowed

	}

//	@Override
//	public Object clone() throws CloneNotSupportedException {
//	
//		CloningExample cloneEx=new CloningExample();
//		cloneEx.clone();
//		
//	    return cloneEx;
//		
//	}

	@Override
	public Object clone() {

		CloningExample cloneEx = new CloningExample();
		cloneEx.clone();
		return cloneEx;

	}

}
