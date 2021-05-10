package Business.concretes;

import Business.abstracts.UserService;
import Core.abstracts.InputVerificationService;
import Core.abstracts.ValidatorService;
import DataAccess.abstracts.UserDaoService;
import Entities.concretes.User;

public class UserManager implements UserService {
	InputVerificationService memberInformationValidation;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(InputVerificationService memberInformationValidation, UserDaoService userDaoService,
			ValidatorService validatorService) {
		super();
		this.memberInformationValidation = memberInformationValidation;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!memberInformationValidation.isValid(user) ) {
			System.out.println("Kullan�c� bilgileri yanl�� formatta kay�t i�lem ba�ar�s�z..");
		}else if(!userDaoService.emailCheck(user)) {
			System.out.println("Bu email adresi daha �nce al�nm�� = "+user.getEmail()+"n"+"Kay�t i�lemi ba�ar�s�z..");
		}else{
			userDaoService.add(user);
			validatorService.sendVarificationMail();
		}
		
	}

	@Override
	public void login(String email, String password) {
		if (userDaoService.loginByCheck(email, password)) {
			System.out.println("Giri� ba�ar�l�");
			
		}else {
			System.out.println("Kullan�c� ad� yanl��");
		}
		
	}

}
