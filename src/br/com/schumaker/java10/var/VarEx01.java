package br.com.schumaker.java10.var;

import java.util.List;

/**
 *
 * @author Hudson Schumaker
 */
public class VarEx01 {
    public static void main(String[] args) {
        var letters = List.of("a", "b", "c", "d", "e", "f");
        for (var nr : letters) {
            System.out.print(nr + " ");
        }
        System.out.println();
        for (var i = 0; i < letters.size(); i++) {
            System.out.print(letters.get(i) + " ");
        }
    }
}
