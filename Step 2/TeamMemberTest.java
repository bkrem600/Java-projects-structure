package teamMemberProgram;

public class TeamMemberTest {

	public static void main(String[] args) {
		Project teamMembers = new Project("Title", "05/09/19", "06/10/19");
		String memberName, memberDivision;
		Integer memberNumber, option;

		while (true) {
			while (true) {
				try {
					option = Input.getInteger("\n-----Menu-----\n" +
							"1) Add team member\n" +
							"2) Remove team member\n" +
							"3) Find team member\n" +
							"4) Display all team members\n" +
							"0) Quit\n" +
							"Option: ");
					break;
				} catch (Exception e) {
					System.out.println("Invalid value entered");
				}
			}
			switch (option) {
				case 0:
					if (Input.getString("Are you sure? (Y/N): ").equalsIgnoreCase("y")) {
						System.out.println("Confirmed. Quitting program.");
						System.exit(0);
					} else {
						break;
					}
				case 1:
					memberName = Input.getString("Team member name: ");
					if (teamMembers.findTeamMember(memberName) == null) {
						try {
							memberNumber = Input.getInteger("Team member employee number: ");
							memberDivision = Input.getString("Team member division: ");
							teamMembers.addTeamMember(new TeamMember(memberName, memberNumber, memberDivision));
							System.out.println("The team member " + '"' + memberName + '"' + " has been added");
						} catch (Exception exception) {
							System.out.println("Invalid value entered");
						}
					} else {
						System.out.println("The team member " + '"' + memberName + '"' + " already exists");
					}
					break;
				case 2:
					memberName = Input.getString("Team member name: ");
					if (teamMembers.removeTeamMember(teamMembers.findTeamMember(memberName))) {
						System.out.println("The team member " + '"' + memberName + '"' + " has been removed");
					} else {
						System.out.println("The team member " + '"' + memberName + '"' + " could not be found");
					}
					break;
				case 3:
					memberName = Input.getString("Team member name: ");
					if (teamMembers.findTeamMember(memberName) == null) {
						System.out.println("The team member " + '"' + memberName + '"' + " could not be found");
					} else {
						System.out.println("The team member " + '"' + memberName + '"' + " has been found");
						System.out.println(teamMembers.findTeamMember(memberName));
					}
					break;
				case 4:
					teamMembers.displayTeamMembers();
					break;
				default:
					System.out.println("Please enter a valid option from the menu");
			}
		}
	}

}
