public class exe {
    public static void main(String[] args) {
        checkNumber(15);
    }

    public static void checkNumber(int number){
        if(number > 0) {
            System.out.println("positive");
        }else if(number < 0) {
            System.out.println("negative");
        }else
            System.out.println("equal to 0");
    }
}
