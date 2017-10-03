package level01.task08.task0800Time;
import java.util.*;


public class Solution {

    public static void main(String[] args) throws Exception {
        //Сколько дней прошло с начала года:
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance / msDay);
        System.out.println("Days from start of year: " + dayCount);


        //Получение текущей даты:
        Date today = new Date();
        System.out.println("Current date: " + today);


        //Вычисление разницы между двумя датами:

        Date currentTime2 = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время
        long msDelay = newTime.getTime() - currentTime2.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");

        //Наступило ли уже некоторое время:
        Date startTime = new Date();
        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);
        Thread.sleep(3000);              // ждем 3 секунды
        Date currentTime3 = new Date();
        if (currentTime3.after(endDate))//проверяем что время currentTime после endDate
        {
            System.out.println("End time!");
        }


        //Сколько прошло времени с начала сегодняшнего дня:
        Date currentTime4 = new Date();
        int hours = currentTime4.getHours();
        int mins = currentTime4.getMinutes();
        int secs = currentTime4.getSeconds();
        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

        //Сколько дней прошло с начала года:
        Date yearStartTime2 = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);
        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        Date currentTime5 = new Date();
        long msTimeDistance2 = currentTime5.getTime() - yearStartTime2.getTime();
        long msDay2 = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount2 = (int) (msTimeDistance2/msDay2); //количество целых дней
        System.out.println("Days from start of year: " + dayCount2);

        //!!!!!!!!
        Calendar a = new GregorianCalendar();
    }

}