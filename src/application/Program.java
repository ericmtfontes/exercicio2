package application;

import utils.Fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        long x = sc.nextLong();
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            numbers.add(Fibonacci.method(i));
        }
        System.out.println("Numero " + x + " informado pelo usuario pertence a sequencia de Fibonacci? " + numbers.contains(x));
    }
}
