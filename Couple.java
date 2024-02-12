public class Couple {

    private Person bride;
    private Person groom;

    public Couple() {
        // Optionally initialize bride and groom to null or default values
    }

    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;

        if (bride == null || groom == null) {
            throw new IllegalArgumentException("Both bride and groom must be provided.");
        }
    }

    public Person getBride() {
        return bride;
    }

    public Person getGroom() {
        return groom;
    }

    public String toString() {
        return "Couple{" +
                "bride=" + bride +
                ", groom=" + groom +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bride's first name: ");
        String brideFirstName = scanner.nextLine();

        System.out.print("Enter bride's last name: ");
        String brideLastName = scanner.nextLine();

        System.out.print("Enter groom's first name: ");
        String groomFirstName = scanner.nextLine();

        System.out.print("Enter groom's last name: ");
        String groomLastName = scanner.nextLine();

        Person bride = new Person(brideFirstName, brideLastName);
        Person groom = new Person(groomFirstName, groomLastName);

        Couple couple = new Couple(bride, groom);

        System.out.println("Congratulations to the happy couple, " + couple + "!");
    }
}
