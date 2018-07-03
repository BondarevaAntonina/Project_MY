package homeworks.abstract_work;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 Создать абстрактный класс родителя Writer c методом modifyText, который реализует интерфейс Writable
 c абстрактными методом write. Создать потомка, который будет писать данные в текстовый файл Poem.txt.
 Данные вводит юзер с консоли. К  данным введенным юзером в методе modifyText добавлять строку "I'm ready for writting to file".
 Создать абстрактный класс родителя Reader c методом modifyText, который реализует интерфейс Readable c абстрактным
 методом read. Создать потомка, который будет читать данные из текстового файла Poem.txt и вывести данные в консоль.
 Перед выводом в консоль в методе modifyText заменить строку  "I'm ready for writting to file" на "I'm from file".
 */
public abstract class Writer implements Writable{

    private String text;

    public Writer(String text) {
        this.text = text;
    }

    public void modifyText(String text){

    }
}

class DescendantWriter extends Writer{

    public DescendantWriter(String text) {
        super(text);
    }

    @Override
    public void modifyText(String text) {
        super.modifyText(text);
    }

    @Override
    public void write(String log) {

        Path path = Paths.get("./Logs", "Poem.txt");

        try {

            Files.write(path, ("\n" + log).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}

