package homeworks.abstract_work;

/**
 *  Создать абстрактный класс родителя Reader c методом modifyText, который реализует интерфейс Readable c абстрактным
 методом read. Создать потомка, который будет читать данные из текстового файла Poem.txt и вывести данные в консоль.
 Перед выводом в консоль в методе modifyText заменить строку  "I'm ready for writting to file" на "I'm from file".
 */
public abstract class Reader  implements Readable{

    public String modifyText( String text){

        return text.replaceFirst("I'm ready for writting to file", "I'm from file");


    }

}
