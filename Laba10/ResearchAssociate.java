import java.util.ArrayList;
import java.util.List;

public class ResearchAssociate extends Employee {

	private String fieldOfStudy;
	private List<Project> projects;

	public ResearchAssociate(String ssn, String name, String email, int counter, String fieldOfStudy) {
		super(ssn, name, email, counter);
		this.fieldOfStudy = fieldOfStudy;
		this.projects = new ArrayList<>();
	}

	/**
	 * Устанавливает область исследований.
	 *
	 * @param fieldOfStudy новая область исследований
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 * Возвращает область исследований.
	 *
	 * @return область исследований
	 */
	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	/**
	 * Добавляет проект к списку проектов.
	 *
	 * @param project проект для добавления
	 * @param hours количество часов, затраченных на проект
	 */
	public void addProject(Project project, int hours) {
		// Добавляем проект в список
		projects.add(project);
		// Можно добавить логику для учета часов, затраченных на проект
	}

	/**
	 * Возвращает список проектов.
	 *
	 * @return список проектов
	 */
	public List<Project> getProjects() {
		return projects;
	}
}
