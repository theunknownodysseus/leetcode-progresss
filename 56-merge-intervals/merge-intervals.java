class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        //Arrays.sort(intervals, (a,b) -> a[0]>b[0]?1:a[0]==b[0]?0:-1);
        // compare -> neg, pos, 0 
        List<int[]> merged = new ArrayList<>();
        //[1,3], [4,6] 3<4
        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.get(merged.size()-1)[1]<interval[0]){
                merged.add(interval);
            }
            else
            {
                merged.get(merged.size()-1)[1]=Math.max(
                  merged.get(merged.size()-1)[1], interval[1]
                );
            }
        }
        return merged.toArray(new int[merged.size()][]);
        
    }
}