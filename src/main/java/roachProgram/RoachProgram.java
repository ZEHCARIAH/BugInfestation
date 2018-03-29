package roachProgram;
import java.util.Scanner;

public class RoachProgram {

	final double One_Bug_volume =0.002;
	final double GROWTH=0.95;

	public static void main(String[] args) {
		RoachProgram my=new RoachProgram();
		my.calculate();
	}

	public void calculate() {
		
		Scanner myScanner=new Scanner(System.in);
		
		System.out.println("Enter the total volume of your house");
		System.out.println("in cubic feet: ");
		double housevolume =myScanner.nextDouble();
		System.out.println("Enter the estiamted number of\nroaches in your house: ");
		double startPopulation =myScanner.nextDouble();
		double population =startPopulation;
		double totalBugvolume =population *One_Bug_volume;

		int countweek=0;

		while(totalBugvolume<housevolume)
		{
			double newBugs = population*GROWTH;
			double newBugsVolume= newBugs*One_Bug_volume;
			population=population+newBugs;
			totalBugvolume= totalBugvolume+newBugsVolume;
			countweek=countweek+1;
		}

		System.out.println("Staring with a roach population of "+(int)startPopulation);
		System.out.println("and a house with a volume of "+housevolume+"cubic feet \nafter"+countweek+"weeks,");
		System.out.println("the house will be filled with "+(int)population+" roaches.");
		System.out.println("They will fill a volume of "+(int)totalBugvolume+" cubic feet.");
		System.out.println("Beteer call Debugging Experts Inc");

	}

}

