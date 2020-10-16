package teamMemberProgram;

public class TeamMember {

	private String name, division;
	private Integer number;
	
	public TeamMember (String name, Integer number, String division) {
		this.name = name;
		this.number = number;
		this.division = division;
	}

	public String toString() {
		return name + " (" + number + ", " + division + ")";
	}

	public String getName() {
		return name;
	}

}
