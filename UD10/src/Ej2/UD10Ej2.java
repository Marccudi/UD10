package Ej2;

import exeptions.newException;

public class UD10Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {
			throw new newException();
		} catch (newException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
