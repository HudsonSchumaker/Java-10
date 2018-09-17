package br.com.schumaker.java10.var;

import java.util.List;

/**
 *
 * @author hudson.schumaker
 */
public class VarEx01 {
    public static void main(String[] args) {
        var numbers = List.of("a", "b", "c", "d", "e");
        for (var nr : numbers) {
            System.out.print(nr + " ");
        }
        System.out.println();
        for (var i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}