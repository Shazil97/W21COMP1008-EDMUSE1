import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000,2,24);
        LocalDate birthday2 = LocalDate.of(2000,3,25);
        LocalDate birthday3 = LocalDate.of(2000,4,26);
        LocalDateTime timestamp = LocalDateTime.now();

        System.out.printf("%d years, %d months, %d days old%n", Period.between(birthday,today).getYears(),
                                                                Period.between(birthday,today).getMonths(),
                                                                Period.between(birthday,today).getMonths());

        System.out.printf("%d years, %d months, %d days old%n", Period.between(birthday2,today).getYears(),
                                                                Period.between(birthday2,today).getMonths(),
                                                                Period.between(birthday2,today).getMonths());

        System.out.printf("%d years, %d months, %d days old%n", Period.between(birthday3,today).getYears(),
                                                                Period.between(birthday3,today).getMonths(),
                                                                Period.between(birthday3,today).getMonths());
    }
}
