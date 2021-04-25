package javaOdev;

public class Main {

	public static void main(String[] args) {

		Category category1 = new Category(1, "Programlama");

		Course course1 = new Course(1, "C# + ANGULAR",
				"Sıfırıdan sektörün yükseklerine C# ve Angular yazılım geliştirme kursu", 74);

		Course course2 = new Course(2, "JAVA + REACT",
				"Sıfırıdan sektörün yükseklerine Java ve React yazılım geliştirme kursu", 28);

		Course course3 = new Course(3, "PROGRAMLAMAYA GİRİŞ İÇİN TEMEL KURS",
				"İleri seviye programlama için temel giriş kursy", 100);

		System.out.println(category1.categoryName + " Kategorisi \n");

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.courseName);
		}

		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		System.out.println("\nEğitimci : " + instructor1.name + " " + instructor1.surname + "\n");

		CourseManager courseManager = new CourseManager();
		courseManager.addToLibrary(course1);
		courseManager.addToLibrary(course2);
		courseManager.deleteToLibrary(course1);
	}

}
