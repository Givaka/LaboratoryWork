package FirstSemester.lab3;
public class ShowCurrentTimeGMT {
    public static void main(String[] args) {
        // Объявление констант и промежуточных переменных программы
        final int MsPS = 1000;  // 1 секунда содержит 1000 миллисекунд
        final int SPM = 60;     // 1 минута содержит 60 секунд
        final int MPH = 60;     // 1 час содержит 60 минут
        final int HPD = 24;     // 1 сутки содержат 24 часа
        final int GMT = 5;      // Часовой пояс Екатеринбурга
        // Получить общее кол-во миллисекунд, прошедших с 00:00:00 GMT 01/01/1970
        long totalMilliseconds  = System.currentTimeMillis();  //  общее  кол-во  миллисекунд,  прошедших  с  00:00:00  GMT 01/01/1970
        // Вычислить общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        long totalSeconds       = totalMilliseconds/MsPS; // общее кол-во секунд, прошедших с 00:00:00 GMT 01/01/1970
        // Вычислить текущее кол-во секунд
        long currentSecond      = totalSeconds%SPM; // текущее кол-во секунд
        // Вычислить общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        long totalMinutes       = (totalSeconds - currentSecond)/SPM; // общее кол-во минут, прошедших с 00:00:00 GMT 01/01/1970
        // Вычислить текущее кол-во минут
        long currentMinute      = totalMinutes%MPH; // текущее кол-во минут
        // Вычислить общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        long totalHours         = (totalMinutes - currentMinute)/MPH; // общее кол-во часов, прошедших с 00:00:00 GMT 01/01/1970
        // Вычислить текущее кол-во часов по Гринвичу
        long currentHour        = totalHours%HPD; // текущее кол-во часов по Гринвичу
        // Отобразить текущее время по Гринвичу
        for (int i =0; i<GMT; i++){
            currentHour++;
            if (currentHour == 24) currentHour = 0;
        }

        System.out.println("Текущее время "+currentHour+":"+currentMinute+":"+currentSecond+" GMT" + GMT);
    }
}
