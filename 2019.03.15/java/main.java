class Main {
    public static void main(String[] args) {
        int[] numList1 = new int[] {1, 2, 3, 4, 5};
        int[] numList2 = new int[] {3, 2, 1};

        int[] result1 = productOfAllButOne(numList1);
        int[] result2 = productOfAllButOne(numList2);
        for (int num : result1) {
            System.out.print(String.format("%d ",num));
        }
        System.out.println("");
        for (int num : result2) {
            System.out.print(String.format("%d ",num));
        }
    }

    public static int[] productOfAllButOne(int[] numList) {
        int[] results = new int[numList.length];
        for (int i=0; i < numList.length; i++) {
            results[i] = 1;
            for (int j=0; j < numList.length; j++) {
                if (i != j) results[i] *= numList[j];
            }
        }
        return results;
    }
}