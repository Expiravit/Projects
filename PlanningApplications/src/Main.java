public class Main {

    public static void main(String[] args) {
	// write your code here
        Furniture stul = new Chair();
        Furniture stol = new Table();
        System.out.println(stul.getLegs());
        stol.setLegs(6);
        System.out.println(stol.getLegs());
    }
}
