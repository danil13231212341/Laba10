public class Course {

	public int id;
	public String name;
	public float hours;
	public Lecturer lecturer;

	public Course(int id, String name, float hours, Lecturer lecturer) {
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.lecturer = lecturer;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public float getHours() {
		return this.hours;
	}

	/**
	 * 
	 * @param hours
	 */
	public void setHours(float hours) {
		this.hours = hours;
	}

	public Lecturer getLecturer() {
		return this.lecturer;
	}

	/**
	 * 
	 * @param lecturer
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

}