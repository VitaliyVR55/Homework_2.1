
public class Main {
    public static void main(String[] args) {
        // Стоимость билета (ticketPrice)
        int ticketPrice = 23658;
        // Стоимость (milePrice) одной мили
        int milePrice = 20;
        // Рассчет начисленных милей
        int miles = ticketPrice / milePrice;
        // Вывод количества милей
        System.out.println("Начисленных милей: " + miles);

    }
}