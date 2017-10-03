package level01.task09.task0915BeanLog;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Перехват выборочных исключений

1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его (вызвать метод BEAN.log)
3. Добавь в объявление метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение — логируй его. Используй try..catch

Подсказка:
Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {
 throw e;
}

Требования:
1. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен логировать исключение FileSystemException (вызвать метод BEAN.log), а затем пробросить его дальше.
3. Метод processExceptions должен только логировать (вызвать метод BEAN.log) исключение CharConversionException.
4. Метод processExceptions должен только логировать любое исключение IOException.
5. Добавь в объявление метода processExceptions класс исключения FileSystemException.
6. Метод main должен использовать try..catch.
7. Метод main должен логировать исключения, которые кидает метод processExceptions.
*/

public class Solution {

    /**
     * [1]Создается объект класса StatelessBean
     *  в этом классе (соответственно и объекте) есть два метода:
     *      log - выводит на экран сообщение об исключении и его подробности,
     *      methodThrowExceptions - генерирует число и в зависимости от того,
     *      чему оно равно выбрасывает исключение
     */
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {

        /**
         * [2]запускается функция processExceptions, в которой в созданном
         * объекте BEAN запускается метод methodThrowExceptions
         */
        try {
            processExceptions();
        }

        /**
         * Если было выброшено исключение FileSystemException, то ловит
         * его и запускает метод log
         */
        catch(FileSystemException e){
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException{

        /**
         * [3] В объекте BEAN запускается метод methodThrowExceptions,
         * который создает число и в зависимости от его значения выбрасывает
         * исключения, которые здесь обрабатываются
         */
        try {
            BEAN.methodThrowExceptions();
        }
        catch(CharConversionException exception){
            BEAN.log(exception);
        }

        /**
         * В отличии от остальных catch, здесь выбрасывается исключение
         * FileSystemException. Чтобы можно было его выбросить, в методе
         * прописано throws FileSystemException
         */
        catch(FileSystemException exception){
            BEAN.log(exception);
            throw exception;
        }
        catch(IOException exception){
            BEAN.log(exception);
        }

    }

    /**
     * [5]В метод log передается значение исключения. Выводится на экран его
     * сообщение и имя.
     * Сообщение можно задать в методе methodThrowExceptions
     */
    public static class StatelessBean {
        public void log(Exception exception) {
            /**
             * Определение потока, сделано для наглядности
             */
            StackTraceElement[] stack = Thread.currentThread().getStackTrace();
            System.out.println("Я метод " +stack[1].getMethodName()+
                    " меня запустили со строки "+stack[2].getLineNumber()+" мой лог:");

            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        /**
         * [4] Создается рандомное число от 0,0 до 1,0 и умножается на 3,
         * также оно приводится к типу int, т.е. отрезается дробная часть.
         * И, в зависимости от числа выбрасывается то или иное исключение
         */
        public void methodThrowExceptions() throws CharConversionException,
                FileSystemException, IOException {
            int i = (int) (Math.random() * 3);

            /**
             * Отображение числа i, сделано для наглядности
             */
            System.out.println("Сгенерированное число i равно "+i);

            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}