public class MyCalendar {
    ArrayList<int[]> lst;

    MyCalendar() {
        lst = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] arr: lst) {
            if (arr[0] < end && start < arr[1])
                return false;
        }
        lst.add(new int[]{start, end});
        return true;
    }
}