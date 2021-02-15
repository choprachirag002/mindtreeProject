package application;

public class Project {
	private int id;
	private String name;
	private String lifeCycle;
	private String pType;
	private int teamSize;
	private String[] technology;
	private String startDate;
	private String endDate;
	public Project() {
	}


	public Project(int id, String name, String lifeCycle,String pType, int teamSize, String[] technology, String startDate,
			String endDate) {
		this.id = id;
		this.name = name;
		this.lifeCycle = lifeCycle;
		this.teamSize = teamSize;
		this.technology = technology;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pType=pType;
	}


	public String getpType() {
		return pType;
	}


	public void setpType(String pType) {
		this.pType = pType;
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


	public String getLifeCycle() {
		return lifeCycle;
	}


	public void setLifeCycle(String lifeCycle) {
		this.lifeCycle = lifeCycle;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public String[] getTechnology() {
		return technology;
	}


	public void setTechnology(String[] technology) {
		this.technology = technology;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

}
