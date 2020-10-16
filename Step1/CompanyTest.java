
public class CompanyTest {

	public static void main(String[] args) {
		Company company = new Company("Test");
		String projectTitle, startDate, endDate;
		Integer option;

		while (true) {
			while (true) {
				try {
					option = Input.getInteger("\n-----Menu-----\n" +
							"1) Add a project\n" +
							"2) Remove a project\n" +
							"3) Find a project\n" +
							"4) Display all projects\n" +
							"0) Quit\n" +
							"Option: ");
					break;
				} catch (Exception exception) {
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
					projectTitle = Input.getString("Project title: ");
					if (company.findProject(projectTitle) == null) {
						startDate = Input.getString("Project start date: ");
						endDate = Input.getString("Project end date: ");
						company.addProject(new Project(projectTitle, startDate, endDate));
						System.out.println("The project " + '"' + projectTitle + '"' + " has been added");
					} else {
						System.out.println("The project " + '"' + projectTitle + '"' + " already exists");
					}
					break;
				case 2:
					projectTitle = Input.getString("Project title: ");
					if (company.removeProject(company.findProject(projectTitle))) {
						System.out.println("The project " + '"' + projectTitle + '"' + " has been removed");
					} else {
						System.out.println("The project " + '"' + projectTitle + '"' + " could not be found");
					}
					break;
				case 3:
					projectTitle = Input.getString("Project title: ");
					if (company.findProject(projectTitle) == null) {
						System.out.println("The project " + '"' + projectTitle + '"' + " could not be found");
					} else {
						System.out.println("The project " + '"' + projectTitle + '"' + " has been found:");
						company.displayProject(company.findProject(projectTitle));
					}
					break;
				case 4:
					company.displayAllProjects();
					break;
				default:
					System.out.println("Please enter a valid option from the menu");
			}
		}
	}

}
