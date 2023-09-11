package Basic.Beginner;

public class HelloAndDataTypes {
   public static void main(String[] args){
      //Primitive data types- size is fixed
      byte age = 12; // 1
      short ph = 45; //2
      int phone = 54673; //4
      long phone2 = 57731879789L; //8
      float pi = 3.14F; //4
      char letter = '@'; //2
      boolean isAdult = false; //1
      System.out.print("Byte age is ");
      System.out.println(age);
      System.out.print("short ph is ");
      System.out.println(ph);
      System.out.print("int phone is ");
      System.out.println(phone);
      System.out.print("long phone2 is "+phone2+"\t");
      System.out.println(phone2);
      System.out.print("float pi is ");
      System.out.println(pi);
      System.out.print("char letter is ");
      System.out.println(letter);
      System.out.print("boolean isAdult is ");
      System.out.println(isAdult);
      //Non-Primitive types -- size not fixed
      String name = "Simran";
      System.out.print("\nString name is ");
      System.out.println(name);
      //length
      System.out.print("Length of name is ");
      System.out.println(name.length());
      String smth = new String("me");
      //Concatenate
      String nice = name + smth;
      System.out.print("printing out nice ");
      System.out.println(nice);
      String nicer = name + "123" + smth;
      System.out.print("Nicer is ");
      System.out.println(nicer);
      //charAt
      System.out.print("Character at ");
      System.out.println(name.charAt(0));
      //replace
      name.replace('a', 'b');
      System.out.print("\nStrings in Java are immutable hence once you make a change they won't change like now ");
      System.out.println(name); // output doesnt replace a with b as the function was just performed but the value was not stored anywhere
      System.out.println("how the a's haven't changed to b's unlike the next one\n");
      String name2 = name.replace('a', 'b');
      System.out.print("Changed name after replacing is ");
      System.out.println(name2);
      String example = "ThisHasManyAs";
      String example2 = example.replace('a','b');
      System.out.print("\nname.replace('','') replaces all not just the first ");
      System.out.println(example2);
      System.out.println("but since java is case sensitive A is not changed\n");
      //substring
      System.out.print("Substring from nicer is ");
      System.out.println(nicer.substring(0,8));
      //to be noted the string isn't being cut or anything, as strings are immutable, we are just returning that part and printing a new temporary string
      System.out.println("must start from 0 as all start from 0 in java to the number you want +1 as it excludes that");
   }
}