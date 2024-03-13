import java.util.Scanner;

public class DNAComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Length of the string SS
            scanner.nextLine(); // Consume the newline character

            String S = scanner.nextLine(); // Input string SS

            // StringBuilder to store the complementary strand
            StringBuilder complementaryStrand = new StringBuilder();

            for (int i = 0; i < N; i++) {
                char nucleotide = S.charAt(i);
                char complementaryNucleotide = getComplementaryNucleotide(nucleotide);
                complementaryStrand.append(complementaryNucleotide);
            }

            System.out.println(complementaryStrand.toString());
        }
    }

    // Function to get complementary nucleotide
    private static char getComplementaryNucleotide(char nucleotide) {
        switch (nucleotide) {
            case 'A':
                return 'T';
            case 'T':
                return 'A';
            case 'C':
                return 'G';
            case 'G':
                return 'C';
            default:
                // Handle invalid nucleotide
                return ' ';
        }
    }
}
