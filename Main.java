// PARTNER NAME:Blake Luna-Beltran
// PARTNER NAME:
// CS111 SECTION #:3033
// DATE: 04/18/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname;
		String givenName;
		String category;
		String cardNum, birthCountry, termsAndConditions,birthMonth;
		int uscis1, uscis2, uscis3, birthDay, birthYear,
		validDay, validMonth, validYear, expireMonth, expireDay,expireYear;
		char sex;

		//INPUT SECTION
		surname = "Luna-Beltran";
		givenName = "Blake";
		category = "C09";
		cardNum = "SRC9876543210";
		birthCountry = "USA";
		termsAndConditions = "None";
		sex = 'M';

		uscis1 = 123;
		uscis2 = 456;
		uscis3 = 789;
		birthDay = 22;
		birthMonth = "NOV";
		birthYear = 1996;
		validDay = 2;
		validMonth = 2;
		validYear = 2020;
		expireDay = 2;
		expireMonth = 2;
		expireYear = 2027;

		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+ surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+ givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " +uscis1+"-"+uscis2+"-"+uscis3 +"    "+category+ "        " + cardNum );
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsAndConditions +" ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ birthDay +" "+ birthMonth + " " + birthYear +"     " + sex);
		System.out.println("║                       Valid From:     "+validDay+"/"+validMonth+"/"+validYear);
		System.out.println("║                       Card Expires:   "+expireDay+"/"+expireMonth+"/"+expireYear);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}