package HW4;

import Main.hw4.Book;
import Main.hw4.BookRepository;
import Main.hw4.BookService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * Задание 1. Ответьте письменно на вопросы:
 * <p>
 * 1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
 * <p>
 * --Заглушки могут заменить реальные зависимости модуля и позволить тестировать его изолировано. Такой подход позволяет тестировать модуль отдельно и независимо,
 * подход улучшает скорость и надежность теста.--
 * <p>
 * 2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
 * <p>
 * --Mock позволяет проследить вызывался ли метод и с какими параметрами он вызывался.--
 * <p>
 * 3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
 * <p>
 * --Если нужно вернуть определенное значения, то используется stub. Stub — объекты, также называемые заглушками,
 * которые возвращают заранее определенные значения на определенные входные данные.--
 * <p>
 * 4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
 * <p>
 * --Fake - небольшие фрагменты кода, которые имитируют поведение частей, которые они заменяют.--
 */

public class BookServiceTest {

    @Test
    void testBookService() {

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        String id = "1";
        String title = "Beach";
        String author = "Garland";

        when(bookRepository.findById(id)).thenReturn(new Book(id, title, author));
        Book book = bookRepository.findById(id);
        verify(bookRepository, times(1)).findById(id);
    }
}
