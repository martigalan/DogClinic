package dogclinic.pojos;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

// POJO
// Plain Old Java Object
// MANDATORY
// - Empty Constructor (without parameters)
// - Getters and setters
// - Hashcode and equals
//			"equals()" != "=="
// - implements Serializable
// OPTIONAL
// - toString
// - Add and Remove 

public class Dog implements Serializable {
	
	/**
	 * 
	 */
	// for the warning: add generate ServialVersionID
	private static final long serialVersionUID = 8048757518988191528L;
	private Integer id; //Integer can be null
	private String name;
	private Date dob; //Date from java.sql
	private String breed;
	private Owner owner;
	
	
	// Botón dcho: source -> generate constructor using fields
	public Dog() {
		super();
	}
	
	// Constructor w/ parameters 
	public Dog(Integer id, String name, Date dob, String breed) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.breed = breed;
	}

	//Botón dcho: source -> create getters and setters
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public Integer getId() {
		return id;
		/*Integer a,b;
		a.equals(b);*/
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	//Botón dcho: source -> generate hashcode and equals
	//pondremos lo que sea ÚNICO para mi base de datos (porque estamos trabajando con ella)
	//porque comparamos objetos que tengan la misma memory reference! OJO
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) { // toby.equals(thor)
		if (this == obj)//check if both are objects have the same memory reference (the same piece of paper)
			return true;
		if (obj == null)//if not, checks if the other object is null
			return false;
		if (getClass() != obj.getClass())//if not, check if both objects are of the same class
			return false;
		Dog other = (Dog) obj; //if they are, cast the other object to this class
		return Objects.equals(id, other.id); //compare the appropriate attributes
	}
	//the same: source -> generate ToString... and we click all parameters we want 

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", dob=" + dob + ", breed=" + breed + "]";
	}
	
	
	
	
	
}
