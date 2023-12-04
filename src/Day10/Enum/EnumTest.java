package Day10.Enum;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNSDAY, THURSDAY, FRIDAY, STATUDAY
}
public class EnumTest {
    Day day;

        public EnumTest(Day day){
            this.day = day;
        }

        public void tellItLikeItIs() {
            switch (day) {
                case MONDAY:
                    System.out.println("Mondays are bad.");
                    break;
                case FRIDAY:
                    System.out.println("Friday are batter");
                    break;
                case STATUDAY:
                    System.out.println("Weekends are best");
                    break;
            }
        }
}
