class Testing {

    public static void main(String s[]) {

        Float pi = new Float(3.14f);

        try {
            if (pi.compareTo(new Float(3)) > 0) {
                System.out.print("pi is big");
            } else {
                System.out.print("pi is not big");
            }
        } finally {
            System.out.println(" Have a nice day.");
        }
    }
}
