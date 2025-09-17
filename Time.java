class Time {
    int hours;
    int minutes;

    public Time(int h, int m) {
        hours = h;
        minutes = m;
    }

    
    public Time addTime(Time t) {
        int totalMinutes = this.minutes + t.minutes;
        int totalHours = this.hours + t.hours + (totalMinutes / 60);
        totalMinutes = totalMinutes % 60;

        return new Time(totalHours, totalMinutes);
    }

    
    public void displayTime() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    
    public static void main(String[] args) {
        Time t1 = new Time(2, 45);
        Time t2 = new Time(1, 30);

        Time result = t1.addTime(t2); 

        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();
        System.out.print("Sum: ");
        result.displayTime();
    }
}
