package learning_class;

public class Constructor_parameter_multiple {

	int modelYear;
	String modelName;

	public Constructor_parameter_multiple(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public Constructor_parameter_multiple(int year) {
		modelYear = year;
	}
	public static void main(String[] args) {
		Constructor_parameter_multiple myobj = new Constructor_parameter_multiple(1969, "Mustang");
		System.out.println(myobj.modelYear + " " + myobj.modelName);

		Constructor_parameter_multiple myobj1 = new Constructor_parameter_multiple(1969);
		System.out.println(myobj1.modelYear);

	}

}
