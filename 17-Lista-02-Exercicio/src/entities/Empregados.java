package entities;

public class Empregados {

	private Integer id;
	private String name;
	private Double salary;
	
	//Construtores
	public Empregados() {
	}
	public Empregados(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	//get / set
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary = percentage / 100 * salary + salary;
	}
	
	
}
