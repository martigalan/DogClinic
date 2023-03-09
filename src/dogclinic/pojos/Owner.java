package dogclinic.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Owner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5851939304888153158L;
	private Integer id;
	private String name;
	private Integer phone;
	private String email;
	private List<Dog> dogs; //List is an interface, so we can't create instances of it
	//It's better this than only put ArrayList, bc, by this way, we can change the type of list or write whatever we want
	
	//Constructor without parameters 
	public Owner() {
		super();
		dogs = new ArrayList<Dog>(); //bc an owner can have several dogs, so we need a list
	}
	
	//Constructor w/ parameters
	public Owner(Integer id, String name, Integer phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		dogs = new ArrayList<Dog>(); //IMPORTANT: IN ALL CONSTRUCTORS WE'VE TO INICIALIZED LISTS!!!
	}




	public List<Dog> getDogs() {
		return dogs;
	}


	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}
	
	// if we want to add a dog to the list
	public void addDog(Dog dog) {
		if (!dogs.contains(dog)) {
			dogs.add(dog);
		}
	}
	
	// if we want to remove a dog of the list
	public void removeDog(Dog dog) {
		if (dogs.contains(dog)) {
			dogs.remove(dog);
		}
	}
	
	public Integer getId() {
		return id;
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


	public Integer getPhone() {
		return phone;
	}


	public void setPhone(Integer phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", dogs=" + dogs + "]";
	}
	
	

}
