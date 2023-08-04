// 15. Write a  java program to get the  java version you are using.

public class JavaVersion {
    public static void main(String[] args) {
        String javaVersion = Runtime.version().toString();
        System.out.println("Java Version: " + javaVersion);
    }
}
