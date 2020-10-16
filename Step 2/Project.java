package teamMemberProgram;

import java.util.ArrayList;

public class Project {

	private String title, startDate, endDate;
	ArrayList<TeamMember> teamMembers = new ArrayList<>();
	
	public Project (String title, String startDate, String endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public void addTeamMember(TeamMember teamMember) {
		this.teamMembers.add(teamMember);
	}

	public Boolean removeTeamMember (TeamMember teamMember) {
		return this.teamMembers.remove(teamMember);
	}

	public TeamMember findTeamMember(String name) {
		for (TeamMember teamMember: teamMembers) {
			if (teamMember.getName().equalsIgnoreCase(name))
				return teamMember;
		}
		return null;
	}
	
	public void displayTeamMembers() {
		if (teamMembers.isEmpty()) {
			System.out.println("Team members list is empty");
		} else {
			for (TeamMember teamMember: teamMembers) {
				System.out.println(teamMember.toString());
			}
		}
	}

}
