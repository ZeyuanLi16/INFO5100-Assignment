package code.week1;

public class ClassRoom {
	public static void main(String args[]) {
		Professor siva = new Professor();
		siva.name = "Siva";
		Student rose = new Student();
		rose.name = "Rose";
		rose.programmingExperience = false;
		Student star = new Student();
		star.name = "Vishal";
		star.programmingExperience = true;
		star.programmingLanguages = "Python, C++";
		rose.introduce();
		star.introduce();
		siva.introduce();
	}
}

class Student {
	String name;
	boolean programmingExperience;
	String programmingLanguages;

	// void means no output
	void introduce() {
		System.out.println("__________________________");

		System.out.println("Name -> " + name);

		if (programmingExperience) {
			System.out.println("I hava programming experience");
		}
		if (!programmingExperience) {
			System.out.println("I don't have programming experience");
		}
		// System.out.println("Programming Experience -> " +
		// programmingExperience);
		// if (No Programmiing experience -> don't print it)

		if (programmingExperience) {
			System.out.println("Programming Languages -> " + programmingLanguages);
		}
		System.out.println("__________________________");
	}

}

class Professor {
	String name;

	void introduce() {
		System.out.println("I'm a professor " + name);
	}
}