public class SecondsToHoursMinutesAndSecond {
    public static void main (String[] args) {
        int input = 594837;
        
        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = (input % 60);
        
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        
        System.out.println(time);
        
    }
}