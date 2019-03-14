// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
// Bonus: Can you do this in one pass?

class Main {
    public static void main(String[] args) {
        int[] numList = new int[] {10, 15, 3, 7};
        int k = 17;
        System.out.println(doesItAddUp(numList, k));
    }

    public static boolean doesItAddUp(int[] numList, int k) {
        for (int i=0; i < numList.length-1; i++) {
            for (int j=i+1; j < numList.length; j++) {
                if (numList[i] + numList[j] == k) return true;
            }
        }
        return false;
    }
}