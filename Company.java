public class Company {
	//Attributes
	private String name;
	private String owner;
	private double budget;
	private int Employees;

	//Constructors
	public Company() {
		this.name = "";
		this.owner = "";
		this.budget = 0.0;
		this.Employees = 0;
}

	public Company(String name, String owner, double budget, int Employees) {
		this.name = name;
		this.owner = owner;
		this.budget = budget;
		this.Employees = Employees;
}

	public Company(String name) {
		this.name = name;
		this.owner = "Gabriel";
		this.budget = 1000.0;
		this.Employees = 5;
}
	//Setters
	public void setName(String n) {
		this.name = n;
}

	public void setOwner(String owner) {
		this.owner = owner;
}

	public void setBudget(double budget) {
		this.budget = budget;
}

	public void setNumEmployees(int nEmp) {
		this.Employees = nEmp;
}

	//Getters
	public String getName() {
		return this.name;
}

	public String getOwner() {
		return this.owner;
}

	public double getBudget() {
		return this.budget;
}

	public int getNumEmployees() {
		return this.Employees;
}

	//Equals
	public boolean equals(Object mObject) {
		if(this == mObject)
			return true;
		if(mObject instanceof Company) {
			Company c1 = (Company) mObject;
			if(this.name.equals(c1.name)) {
				if(this.owner.equals(c1.owner)) {
					if((this.budget - c1.budget)< 0.0001) {
						if(this.Employees == c1.Employees) {
							return true;
					}
				}
			}
		}
	}
	return false;
}
	//toString
	public String toString() {
		return "Company:name" + getName() + "Owner" + getOwner() + "Budget" + getBudget() + "Employees" + getNumEmployees();
}












}
