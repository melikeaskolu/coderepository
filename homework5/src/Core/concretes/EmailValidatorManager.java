package Core.concretes;

import Core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVarificationMail() {
		System.out.println("Do�rulama maili g�nderildi. L�tfen Mail adresinizi kontrol ediniz.");
		
	}

}
