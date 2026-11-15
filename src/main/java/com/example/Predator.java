package com.example;

import java.util.List;

public interface Predator {

    List<String> eatMeat() throws Exception;

}


// Predator будет реализовывать класс Feline
// Создать в классе Lion приватное поле типа Predator
// Создать к-р с параметром того же типа, что и интерфейс. Внутри к-ра передаем значение параметра в созданное поле