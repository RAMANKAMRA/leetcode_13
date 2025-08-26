import java.util.Arrays;

class Solution {
    static class Meeting {
        int start, end;
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Meeting[] arr = new Meeting[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Meeting(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(arr, (a, b) -> a.end - b.end);

        int count = 1;  
        int end = arr[0].end;

        for (int i = 1; i < n; i++) {
            if (arr[i].start >= end) {
                count++;
                end = arr[i].end;
            }
        }

        return n - count; 
    }
}
