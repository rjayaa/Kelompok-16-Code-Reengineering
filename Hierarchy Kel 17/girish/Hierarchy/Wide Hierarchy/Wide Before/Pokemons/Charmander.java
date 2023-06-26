package Wide_Hierarchy.Pokemons;

import Wide_Hierarchy.Move;
import Wide_Hierarchy.Types.Fire;

import java.util.ArrayList;
import java.util.Random;

public class Charmander extends Pokemon {
    public Charmander(String name) {
        super(name, Sprite(), 39, new Fire(),
                65, MakeMoveSet());
    }
    private static String Sprite(){
        String charmanderSprite = "";
        return charmanderSprite;
    }

    private static ArrayList<Move> MakeMoveSet(){
        ArrayList<Move> learnableMoves = LearnableMoves();
        ArrayList<Move> newMoveSet = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(learnableMoves.size());
            Move move = learnableMoves.get(randomIndex);
            newMoveSet.add(move);
        }

        return newMoveSet;
    }

    public static ArrayList<Move> LearnableMoves(){
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Ember", 40, 100,
                "fire"));
        return learnableMoves;
    }
}
