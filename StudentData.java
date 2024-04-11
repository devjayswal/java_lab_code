import java.util.Scanner;

class StudentData {
    public static void main(String args[]) {
        System.out.println("Dev Jayswal \n0901AM221031");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scan.nextLine();
        System.out.println("Enter your Enrollment No.");
        String enroll = scan.nextLine();
        System.out.println("Enter your Branch");
        String branch = scan.nextLine();
        System.out.println("Enter your CGPA");
        double CGPA = scan.nextDouble();
        System.out.println(name);
        System.out.println(enroll);
        System.out.println(branch);
        System.out.println(CGPA);
        String nameconcat = name.concat(" Hero");
        System.out.println(nameconcat);
        System.out.println("The length of name is " + name.length());
        System.out.println(name.equals(enroll));
        System.out.println(name.compareTo(enroll));
        System.out.println(name == enroll);
        String str[] = nameconcat.split(" ");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println(name.substring(0, Math.min(2, name.length())));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("r"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
