package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Square {
  int calculate(int x);
}

class FunctionalInterfaceExample {
  public static void main(String args[])
  {
      int a = 10;

      // lambda expression to define the calculate method
      Square s = (int x) -> x * 2;
      
      // parameter passed and return type must be
      // same as defined in the prototype
      int ans = s.calculate(a);
      System.out.println(ans);
      
      //Consumer functional interface
      Consumer<Integer> consumer = (value) -> System.out.println(value*value);
      consumer.accept(a);
      
      //function interface
      Function<Integer, Double> half = value -> value / 2.0;
      System.out.println(half.apply(a));
     
      half = half.andThen(value -> 3 * value);
      System.out.println(half.apply(a));
      
      //predicate interface
   // Creating predicate
      Predicate<Integer> lesserthan = i -> (i < 18); 

      // Calling Predicate method
      System.out.println(lesserthan.test(20)); 
      
  }
}
