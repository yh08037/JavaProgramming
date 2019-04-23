public class DeckOfCards2Dim {
    public static void main(String[] args) {
        int[][] deck = new int[13][4];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        /* initializing */
        for ( int i = 0; i < deck.length; i++ ) {
            for ( int j = 0; j < deck[i].length; j++ ) {
                deck[i][j]  = i * deck[i].length + j;
            }
        }

        /* Shuffle the cards */
        for ( int i = 0; i < deck.length; i++ ) {
            for ( int j = 0; j < deck[i].length; j++ ) {
                /* Generate index randomly */
                int row_idx = (int) (Math.random() * deck.length);
                int col_idx = (int) (Math.random() * deck[i].length);
                int temp = deck[i][j];
                deck[i][j] = deck[row_idx][col_idx];
                deck[row_idx][col_idx] = temp;
            }
        }

        /* display first four cards */
        for ( int i = 0; i < 4; i++ ) {
            String suit = suits[deck[0][i] / 13];
            String rank = ranks[deck[0][i] % 13];
            System.out.println("Card number " + deck[0][i] + ": " + rank + " of " + suit);
        }

    }
}
