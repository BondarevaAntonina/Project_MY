package homeworks.abstract_work.writer;

/**
 * Создать абстрактный класс родителя Writer c методом modifyText, который реализует интерфейс Writable
 * c абстрактными методом write. Создать потомка, который будет писать данные в текстовый файл Poem.txt.
 * Данные вводит юзер с консоли. К  данным введенным юзером в методе modifyText добавлять строку "I'm ready for writting to file".
 * Создать абстрактный класс родителя Reader c методом modifyText, который реализует интерфейс Readable c абстрактным
 * методом read. Создать потомка, который будет читать данные из текстового файла Poem.txt и вывести данные в консоль.
 * Перед выводом в консоль в методе modifyText заменить строку  "I'm ready for writting to file" на "I'm from file".
 */
public abstract class Writer implements Writable {

    public String modifyText(String text) {

        return text.concat(" I'm ready for writting to file \n");

    }
}



