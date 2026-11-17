public class Deposit {
    public static void main(String[] args) {
        double roubles = 5000;
        double yearRate = 4;
        int numOfMonth = 36;
        double monthRefill = 1000;
        double monthMaintenance = 0.1 * roubles / 100;

        double monthRate = yearRate / 12;

        for (int i = 0; i < numOfMonth; i++) {
            double depositInterest = roubles * (monthRate / 100);
            roubles += depositInterest;
            roubles += monthRefill;
            roubles -= monthMaintenance;
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles > 41000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}
