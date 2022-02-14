package top.truism.springbbotunittestinterface.service;

import java.util.function.Function;

public interface DemoService<T,R> {

    void printHello();

    R doFunction(Function<T,R> function);

}
