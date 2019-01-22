public class Person {

	private int age;
	private String name;

	public Person(int age, String name) {
		ageValidator(age);
		nameValidator(name);
	}

	private int age() {
		return this.age;
	}

	private String name() {
		return this.name;
	}


	private void setAge(int age) {
		this.age = age;
	}

	private void setName(String name) {
		this.name = name;
	}


	public void ageValidator(int age) {
		if(age > 120) {
			throw new IllegalArgumentException("Age cannot be over 120.");
		} else {
			setAge(age);
		}
		return;
	}

	public void nameValidator(String name) {
		if(name == null || name.equals("") || name.length() > 40) {
			throw new IllegalArgumentException("Name cannot be null, empty, or over 40 characters.");
		} else {
			setName(name);
		}
		return;
	}


}