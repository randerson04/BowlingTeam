//exc on pages 386-391

import java.util.*;

public class BowlingTeamDemo4
{
	public static void main(String[] args) 
	{
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		

		//input phase
		Scanner input = new Scanner(System.in);
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		

		//call to getTeamData() method
		getTeamData(teams);

		//output phase
		for(y = 0; y< NUM_TEAMS; ++y)
		{
			System.out.println("\nmenbers of team " + teams[y].getTeamName());
			//loop the process of outputting each individual mem of bowlTeam
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{	
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println();
		}

		//added feature that will allow the user to look up the roster of any existing team by entering the team name
		System.out.print("\n\nEnter a team name to see its roster >> ");
		name = input.nextLine();

		for(y = 0; y < teams.length; ++y)
		{
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
			{
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				{
					System.out.print(teams[y].getMember(x) + " ");
				}
			}
		}
	}

	public static void getTeamData(BowlingTeam[] teams)
	{
		//vars and consts
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		

		//input phase
		Scanner input = new Scanner(System.in);

		//loop for each indivdual team
		for(y = 0; y < NUM_TEAMS; ++y) 
		{
			System.out.print("please enter the team name >>");
			name = input.nextLine();
			teams[y] = new BowlingTeam();
			System.out.println("enter 4 team members please:");
			teams[y].setTeamName(name);
			//loop the process of entering memebers for the team
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}	
	}
}