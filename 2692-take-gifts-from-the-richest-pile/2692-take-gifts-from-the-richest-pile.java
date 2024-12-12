
public class Solution {

    public long pickGifts(int[] gifts, int k) {
        
        List<Integer> giftsList = new ArrayList<>();
        for (int gift : gifts) {
            giftsList.add(-gift);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(giftsList);
        while(k-- > 0) {
            
            int maxElement = -pq.poll();

            
            pq.offer(-(int) Math.sqrt(maxElement));
        }

       
        long numberOfRemainingGifts = 0;
        while (!pq.isEmpty()) {
            numberOfRemainingGifts -= pq.poll(); 
        }

        return numberOfRemainingGifts;
    }
}