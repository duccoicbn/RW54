package Assignment_1;

public class typeQuestion {
	public enum TypeName {
		ESSAY, MULTIPLE_CHOICE
	}
	private int id;
	private TypeName name;
	public typeQuestion(int id, TypeName name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TypeName getName() {
		return name;
	}
	public void setName(TypeName name) {
		this.name = name;
	}
	public String toString() {
		return "TypeQuestion [id = " + id + ", name = " + name + "]";
	}
}
