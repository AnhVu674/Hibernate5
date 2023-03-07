package anhvu.DemoHibernate;

import javax.persistence.Id;
import org.hibernate.annotations.Entity;

@Entity
public class Alien {
	@Id
	private int id;
	private String name;
	private String color;

	public Alien(int id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Alien() {
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
