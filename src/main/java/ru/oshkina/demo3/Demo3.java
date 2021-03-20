package ru.oshkina.demo3;

import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        A obj = new A();
        //obj.f().g(); - это не сработает
        //если объект, получаемый в результате вызова obj.f() != null, то у него вызывается метод g()
        //иначе вернется пустой объект типа Optional<U>
        final Optional<U> u = obj.f().flatMap(T::g);
    }
}
