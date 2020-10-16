
import java.util.Collections;
import java.util.LinkedList;

public class Company {

	private String name;
	private LinkedList<Project> projects = new LinkedList<>();
	
	public Company(String name) {
		this.name = name;
	}

	public void addProject(Project project) {
		this.projects.add(project);
	}
	
	public Boolean removeProject (Project project) {
		return this.projects.remove(project);
	}

	public Project findProject (String title) {
		for (Project project: projects) {
			if (project.getTitle().equalsIgnoreCase(title)) {
				return project;
			}
		}
		return null;
	}
	
	public void displayProject (Project project) {
		System.out.println(project.toString());
	}

	public void displayAllProjects() {
		if (projects.isEmpty()) {
			System.out.println("Project list is empty");
		} else {
			Collections.sort(projects);
			for (Project project: projects) {
				displayProject(project);
			}
		}
	}

}
