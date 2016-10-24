package some.lesson3;

public class SecondProgram {

	
      public static void  main (String[] args){
	    Object obj = new Object();
		String str = "hello";
		Student student1 = new Student();
		student1.name = "A";
		student1.age = 12;
		
		Student student2 = new Student("D", 14);
		student2.grow();
		
		while (!student2.isDead()){
			
			System.out.println(student2);
		}
		
		System.out.println(Student.studentsqty);
		
    }
	

}
    class  Student {
	public String name; // = NULL
    public int age;
	 public int deadage = 94;
	 public static int studentsqty = 0;
	// конструктор
	public Student(Sring name, int age){
		this.name = name;
		this.age = age;
		studentsqty++;
	}
	
	public Student(Sring name, int age, int deadage){
		this.name = name; // this(name, age);
		this.age = age;
		this.deadage = deadage;	
	}
	
    public String toString(){
		if(isDead()) return "I was a student. I'm old";
	   return "I am student." + name + ". I'm " + age + "years old" ;
   }
   
	public int getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
    public boolean isDead(){
		return age >= 94;
	}
    public void grow() {
		age++;
	}   
 }
