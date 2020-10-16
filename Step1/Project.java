
public class Project implements Comparable<Project> {
	
	private String title, startDate, endDate;
	
	public Project (String title, String startDate, String endDate) {
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String toString() {
		return title + " (" + startDate + " - " + endDate + ")";
	}

	public int compareTo(Project project) {
		return this.title.compareTo(project.title);
	}

	public String getTitle() {
		return title;
	}

}
