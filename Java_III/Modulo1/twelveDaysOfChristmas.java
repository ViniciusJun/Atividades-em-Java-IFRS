package Java_III.Modulo1;

public class twelveDaysOfChristmas {
    public static void main(String[] args) {
        String[] dias = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
        };

        String[] presentes = {
            "a partridge in a pear tree.",
            "two turtle doves,",
            "three french hens,",
            "four calling birds,",
            "five gold rings,",
            "six geese a-laying,",
            "seven swans a-swimming,",
            "eight maids a-milking,",
            "nine ladies waiting,",
            "ten lords a-leaping,",
            "eleven pipers piping,",
            "twelve drummers drumming,"
        };

        // Laço que percorre os 12 dias
        for (int i = 0; i < 12; i++) {
            System.out.println("On the " + dias[i] + " day of Christmas, my love gave to me");

            // Imprime os presentes do dia atual para o primeiro (em ordem inversa)
            for (int j = i; j >= 0; j--) {
                // Para o segundo presente até o último, imprime normalmente
                if (j != 0) {
                    System.out.println(presentes[j]);
                } else {
                    // No primeiro dia: "a partridge in a pear tree."
                    // A partir do segundo dia: "and a partridge in a pear tree."
                    if (i == 0) {
                        System.out.println(presentes[0]);
                    } else {
                        System.out.println("and " + presentes[0]);
                    }
                }
            }

            System.out.println(); // Linha em branco para separar os dias
        }
    }
}

