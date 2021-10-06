package Ejercicios3;

public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.printf("s\n%s: %d\n%s: %b\n%s: %b\n%s: %b\n\n",
                "AND condicional (&&)", "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true)
                );
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "OR concidional (||)", "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "AND logico booleano (&)", "flase & flase", (false & false),
                "false & true", (false & true),
                "true & flase", (true & false),
                "true % true", (true & true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "OR inclusivo booleano (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "OR exculsivo logico booleano (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "!false", (!false), "!true", (!true));
    }
}
