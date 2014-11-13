import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 6068968814570439329L;
	private String name;
	private String Id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
		
}
