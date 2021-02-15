package application;

public class Verticle {
	
	
	private int id;
	private String name;
	Project[] projects;
	int size;
	public Verticle() {
	}
	
	public Verticle(int id, String name, int size,Project[] projects) {
		this.id = id;
		this.name = name;
		this.projects = projects;
		this.size=size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project[] getProjects() {
		return projects;
	}
	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	

}
