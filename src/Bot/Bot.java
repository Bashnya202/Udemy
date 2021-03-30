package Bot;

public class Bot {



    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Privet ymnik";
        } else if ("Пока.".equals(question)) {
            rsl="До скорой встречи.";
        }
        return rsl;
    }


    public static void main(String[] args) {
        String rsl = Bot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = Bot.answer("Пока.");
        System.out.println(rsl);
    }


}

   /* Вам необходимо разработать программу "Глупый бот".
        Бот должен принимать строку и возвращать ответ.
        Бот наш глупый. Он знает только три фразы.
        Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
        Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
        Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
        Помните, что строки можно сравнивать только через методы equals. Нельзя использовать ==.
        Давайте составим каркас класса.

        package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            /* заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ...;
        } else if (....) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. */
            /* заменить ... на правильный ответ rsl = "ответ по заданию".
            rsl = ..;
        }
        return rsl;
    }


    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}
*/