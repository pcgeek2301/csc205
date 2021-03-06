

//This will run test cases for the Term class.   It will not prompt for input,
//but is expecting input of the form "testing <what to test>"

public class AbstractTester_Minilab_4_Abstract
{
	public static void main(String[ ] args)
	{
		//get the arguments for the test - note no prompt!
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();

		if (test.equalsIgnoreCase("testing parameterized constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------");
			boolean printDescription = true;
			boolean checkChanges = false;

			try
			{
				String name = "Bill Gates";
				int id = 123456;
				int rating = 5;
				if (printDescription)
					System.out.println("\n==>Testing Tech's parameterized constructor: passing in " + name + " and " + rating + " and " + id);
				Tech aTech = new Tech(name, rating, id);
				System.out.println("toString() returns: " + aTech);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Mark Zuckerberg";
				int id = 777777;
				int rating = 5;
				double bonus = 1000.00;
				if (printDescription)
					System.out.println("\n==>Testing Tech's parameterized constructor: passing in " + name + " and " + rating + " and " + id + " and " + bonus);
				Processor aProcessor = new Processor(name, rating, id, bonus);
				System.out.println("toString() returns: " + aProcessor);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Elon Musk";
				int id = 999999;
				int rating = 4;
				double bonus = 3000.00;
				double profits = 500;
				if (printDescription)
					System.out.println("\n==>Testing Tech's parameterized constructor: passing in " + name + " and " + rating + " and " + id + " and " + bonus + " and " + profits);
				Specialist aSpecialist = new Specialist(name, rating, id, bonus, profits);
				System.out.println("toString() returns: " + aSpecialist);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing illegal ratings") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------");
			boolean printDescription = true;
			boolean checkChanges = true;

			try
			{
				String name = "Tekkie0";
				int id = 1234;
				int rating = 0;
				if (printDescription)
					System.out.println("\n==>Testing Tech's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id);
				Tech aTech = new Tech(name, rating, id);
				System.out.println(aTech);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Tekkie4";
				int id = 5678;
				int rating = 6;
				if (printDescription)
					System.out.println("\n==>Testing Tech's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id);
				Tech aTech = new Tech(name, rating, id);
				System.out.println(aTech);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Pro-1";
				int id = 33333;
				int rating = -1;
				double bonus = 1500.50;
				if (printDescription)
					System.out.println("\n==>Testing Processor's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id + " and " + bonus);
				Processor aPro = new Processor(name, rating, id, bonus);
				System.out.println(aPro);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Pro5";
				int id = 44444;
				int rating = 7;
				double bonus = 1000.25;
				if (printDescription)
					System.out.println("\n==>Testing Processor's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id + " and " + bonus);
				Processor aPro = new Processor(name, rating, id, bonus);
				System.out.println(aPro);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Spec0";
				int id = 1;
				int rating = 0;
				double bonus = 1.5;
				double profit = 2.3;
				if (printDescription)
					System.out.println("\n==>Testing Specialist's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id + " and " + bonus + " and " + profit);
				Specialist aSpec = new Specialist(name, rating, id, bonus, profit);
				System.out.println(aSpec);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "Spec4";
				int id = 5;
				int rating = 6;
				double bonus = 1.50;
				double profit = 2.7;
				if (printDescription)
					System.out.println("\n==>Testing Specialist's parameterized constructor with illegal rating: passing in " + name + " and " + rating + " and " + id + " and " + bonus + " and " + profit);
				Specialist aSpec = new Specialist(name, rating, id, bonus, profit);
				System.out.println(aSpec);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
		}


		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing calculateBonus") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------");
			boolean printDescription = true;
			boolean checkChanges = false;

			//-------------------------------------------------------------
			try
			{
				String name = "Tekkie";
				int id = 1234;
				int rating = 2;
				double multiplier = 2.4;
				if (printDescription)
					System.out.println("\n==>Testing Tech's calculateBonus, with a multiplier of " + multiplier);
				Tech aTech = new Tech(name, rating, id);
				System.out.println("created: " + aTech);
				System.out.println("calculateBonus(" + multiplier + ") returned: " + aTech.calculateBonus(multiplier));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "GoPro";
				int id = 1234;
				int rating = 1;
				double bonus = 1000.0;
				double multiplier = 2.4;
				if (printDescription)
					System.out.println("\n==>Testing Processor's calculateBonus, with a multiplier of " + multiplier);
				Processor aProcessor = new Processor(name, rating, id, bonus);
				System.out.println("created: " + aProcessor);
				System.out.println("calculateBonus(" + multiplier + ") returned: " + aProcessor.calculateBonus(multiplier));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "GoPro";
				int id = 1234;
				int rating = 3;
				double bonus = 1500.0;
				double multiplier = .75;
				if (printDescription)
					System.out.println("\n==>Testing Processor's calculateBonus, with a multiplier of " + multiplier);
				Processor aProcessor = new Processor(name, rating, id, bonus);
				System.out.println("created: " + aProcessor);
				System.out.println("calculateBonus(" + multiplier + ") returned: " + aProcessor.calculateBonus(multiplier));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "SpecialK";
				int id = 1111;
				int rating = 4;
				double bonus = 2000.0;
				double profit = 1000.0;
				double multiplier = 1.6;
				if (printDescription)
					System.out.println("\n==>Testing Specialist's calculateBonus, with a multiplier of " + multiplier);
				Specialist aSpecialist = new Specialist(name, rating, id, bonus, profit);
				System.out.println("created: " + aSpecialist);
				System.out.println("calculateBonus(" + multiplier + ") returned: " + aSpecialist.calculateBonus(multiplier));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

			try
			{
				String name = "SpecialK";
				int id = 987654;
				int rating = 5;
				double bonus = 3000.0;
				double profit = 1500.0;
				double multiplier = 3.2;
				if (printDescription)
					System.out.println("\n==>Testing Specialist's calculateBonus, with a multiplier of " + multiplier);
				Specialist aSpecialist = new Specialist(name, rating, id, bonus, profit);
				System.out.println("created: " + aSpecialist);
				System.out.println("calculateBonus(" + multiplier + ") returned: " + aSpecialist.calculateBonus(multiplier));
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}

		}


		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing compareTo") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = false;

				int numTests;
				int numErrors;
				String[ ] workerTypes = {"Tech", "Processor", "Specialist" };

				//for all worker types
				for (int thisWorkerIndex=0; thisWorkerIndex<workerTypes.length; thisWorkerIndex++)
					for (int otherWorkerIndex=0; otherWorkerIndex<workerTypes.length; otherWorkerIndex++)
					{
						if (printDescription)
							System.out.println("\n==>Testing <a " + workerTypes[thisWorkerIndex] + ">.compareTo(<a " + workerTypes[otherWorkerIndex] +
									">) with combinations of their ratings/ids");

						try
						{
							numTests = 0;
							numErrors = 0;

							//for all combinations of their rankings/ids
							for (int thisRating=1; thisRating<=5; thisRating++)   //1-5
								for (int otherRating=1; otherRating<=5; otherRating++)   //1-5
									for (int thisID = 1; thisID<4; thisID+=2)     //1,3
										for (int otherID = 1; otherID<4; otherID+=2)     //1,3
										{
											//create one to  call and one to pass in.  They can both be Worker because we
											//will use polymorphism to make the compareTo and toString calls.
											Worker thisWorker;
											if (thisWorkerIndex==0)
												thisWorker = new Tech("teck1", thisRating, thisID);
											else if (thisWorkerIndex==1)
												thisWorker = new Processor("pro1",thisRating, thisID, 10.);
											else
												thisWorker = new Specialist("spec1",thisRating, thisID,  30, 40);

											Worker otherWorker;
											if (otherWorkerIndex==0)
												otherWorker = new Tech("teck2", otherRating, otherID);
											else if (otherWorkerIndex==1)
												otherWorker = new Processor("pro2",otherRating, otherID,  20.);
											else
												otherWorker = new Specialist("spec2",otherRating, otherID,  50, 60);

											//do the compareTo
											numTests++;
											int result =  thisWorker.compareTo(otherWorker);

											//check results
											String stringResult;
											if (result > 0)
												stringResult = "a positive number";
											else if (result < 0)
												stringResult = "a negative number";
											else
												stringResult = "0";

											int realResult = (thisRating-otherRating==0 ? thisID-otherID : thisRating-otherRating);

											if (result < 0 && realResult >= 0)   //bad
											{
												numErrors++;
												if (numErrors<4)    //just PRINT first 3 errors
													System.out.println(thisWorker + "    .compareTo(    " + otherWorker + ")     FAILED (returned " + stringResult + ")");
											}
											else if (result > 0 && realResult <= 0)   //bad
											{
												numErrors++;
												if (numErrors<4)    //just PRINT first 3 errors
													System.out.println(thisWorker + "    .compareTo(    " + otherWorker + ")     FAILED (returned " + stringResult + ")");
											}
											else if (result == 0 && realResult != 0)   //bad
											{
												numErrors++;
												if (numErrors<4)    //just PRINT first 3 errors
													System.out.println(thisWorker + "    .compareTo(    " + otherWorker + ")     FAILED (returned " + stringResult + ")");
											}
										}

							if (numErrors==0)    //for this combination of ranking/rating
								System.out.println("All " + numTests + " tests passed!");
							else
								System.out.println("(Only the first 3 errors will be printed)");
						}
					catch (Throwable ex)
					{
						System.out.println(ex.getClass().getName());
						//ex.printStackTrace();         //in case the user wants more information on the exception
					}
				}
		}

	}
}
