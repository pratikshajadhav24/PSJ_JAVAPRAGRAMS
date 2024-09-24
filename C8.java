class ArrayConstructor {
    int[] numbers;

    // Constructor with array parameter
    ArrayConstructor(int[] nums) {
        numbers = nums;
    }

    void display() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayConstructor ac = new ArrayConstructor(arr);
        ac.display();
    }
}

