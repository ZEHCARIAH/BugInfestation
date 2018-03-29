package roachProgram;
import java.util.Scanner;
/**
 * This class define a roach program.</br>
 * This roach program has public static void main method and public void method.</br>
 * Main method call calculator void method </br>
 * void calculate method deal with detail information about how to get calculate roach in the room.</br>
 * @author MG
 *
 */

public class RoachProgram {	//this is RoachProgram class


	final double One_Bug_volume =0.002;	// One_Bug_volume is constant number and declare double shape and have 0.002 value
	final double GROWTH=0.95;	//GROWTH is constant number and declare double shape and have 0.95 value
	
	public static void main(String[] args) {	//this is public static void main method
		RoachProgram my=new RoachProgram();	// RoachProgram my member declare new RoachProgram
		my.calculate();	//my member can work calculate method
}
public void calculate() {	//this is void calculate
		
		Scanner myScanner=new Scanner(System.in);	// data can be entered from the keyboard using
		
		System.out.println("Enter the total volume of your house");	//can printout Enter the total volume of your house
		System.out.println("in cubic feet: ");	//can printout in cubic feet:
		double housevolume =myScanner.nextDouble();	//housemember(dobule) can work by using type keyboard 
		System.out.println("Enter the estimated number of\nroaches in your house: ");	//can printout Enter the estimated number of\nroaches in your house
		double startPopulation =myScanner.nextDouble();	//startPopulation(double) can work by using type keyboard
		double population =startPopulation;	//double population equal startPopulation
		double totalBugvolume =population *One_Bug_volume;	//double totalBugvolume equal population multiply One_Bug_volume

		int countweek=0;	//declare integer countweek is 0;

		while(totalBugvolume<housevolume)	//declare while construction and give information that totalBugvolume<housevolume
		{
			double newBugs = population*GROWTH;	//double newBugs equal population multiply GROWTH
			double newBugsVolume= newBugs*One_Bug_volume;	//double newBugsVolume equal newBugs multiply One_Bug_volume
			population=population+newBugs;	//population equal population plus newBugs
			totalBugvolume= totalBugvolume+newBugsVolume;	//total Bugvolume equal totalBugvolume plus newBugsVolume
			countweek=countweek+1;	//countweek equal countweek plus one
		}

		System.out.println("Staring with a roach population of "+(int)startPopulation);	//printout Staring with a roach population of and startPopulation member (integer)
		System.out.println("and a house with a volume of "+housevolume+" cubic feet \nafter"+countweek+"weeks,");	//printout and a house with a volume of and add housevolume member, cubic feet and show, next line, after add countweek member, weeks
		System.out.println("the house will be filled with "+(int)population+" roaches.");	//printout the house will be filled with plus population member(integer) roaches.
		System.out.println("They will fill a volume of "+(int)totalBugvolume+" cubic feet.");	//printout They will fill a volume of plus totalBugvolume member(integer), cubic  feet.
		System.out.println("Better call Debugging Experts Inc");	//printout Better call Debugging Experts Inc.

	}

}
	
