class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int sumGas = Arrays.stream(gas).sum();
        int sumCost = Arrays.stream(cost).sum();

        if (sumGas < sumCost) {
            return -1;
        }

        int total = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            if (total < 0) {
                total = 0;
                result = i + 1;
            }
        }
        return result;

    }
}