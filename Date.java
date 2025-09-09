
public class Date {
    private int month;
    private int day;
    private int year;

    public static boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public Date(int month, int day, int year) {
        if (year < 1) {
            throw new IllegalArgumentException("year invalido");
        }

        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month invalido");
        }

        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("day invalido");
        }

        if (month == 2 && day == 29) {
            if (!isBissexto(year)) {
                throw new IllegalArgumentException("day invalido");
            }
        }

        if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            throw new IllegalArgumentException("day inválido: mês não tem 31 dias");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }
}
