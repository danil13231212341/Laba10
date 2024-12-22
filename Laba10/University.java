import java.util.ArrayList;
import java.util.List;

public class University {

	public int numberOfEmployers;
	private List<Faculty> faculties;



	public University(int numberOfEmployers) {
		this.numberOfEmployers = numberOfEmployers;
		this.faculties = new ArrayList<>();
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}

	/**
	 * 
	 * @param faculty
	 */
	public void removeFaculty(Faculty faculty) {
		faculties.remove(faculty);
	}

	public int getNumberOfEmployers() {
		return this.numberOfEmployers;
	}
	public List<Faculty> getFaculties() {
		return faculties;
	}

}