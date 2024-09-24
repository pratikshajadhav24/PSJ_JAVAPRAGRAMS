class Blocks {
    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    Blocks() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks();
    }
}

