import java.util.ArrayList;
import java.util.List;

public class Faculty {

	private Employee dean;
	private String name;
	private List<Institute> institutes;

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
		this.institutes = new ArrayList<>();
	}

	/**
	 * Добавляет институт к факультету.
	 *
	 * @param institute институт для добавления
	 */
	public void addInstitute(Institute institute) {
		institutes.add(institute);
	}

	/**
	 * Удаляет институт из факультета.
	 *
	 * @param institute институт для удаления
	 */
	public void removeInstitute(Institute institute) {
		institutes.remove(institute);
	}

	/**
	 * Устанавливает декана факультета.
	 *
	 * @param dean новый декан
	 */
	public void setDean(Employee dean) {
		this.dean = dean;
	}

	/**
	 * Возвращает декана факультета.
	 *
	 * @return декан факультета
	 */
	public Employee getDean() {
		return dean;
	}

	/**
	 * Возвращает список институтов факультета.
	 *
	 * @return список институтов
	 */
	public List<Institute> getInstitutes() {
		return institutes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setInstitutes(List<Institute> institutes) {
		this.institutes = institutes;
	}
}
