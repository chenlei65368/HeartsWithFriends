package org.bitcoma.hearts;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.bitcoma.hearts.model.PassingCardsInfo;

public class SmartAttack implements IHeartsHandler {

    public SmartAttack() {
        // nothing
    }

    public LinkedList<Long> playerIds;
    public Map<Long, String> names;
    public Game game;

    public static final int PLAYER_IDX = 3;

    public void constructGame() {
        game = new Game(playerIds, this);
    }

    public static void main(String[] args) {
        SmartAttack smartAttack = new SmartAttack();

        smartAttack.playerIds = new LinkedList<Long>();
        smartAttack.playerIds.add((long) 1);
        smartAttack.playerIds.add((long) 2);
        smartAttack.playerIds.add((long) PLAYER_IDX);
        smartAttack.playerIds.add((long) 25);

        smartAttack.names = new HashMap<Long, String>();
        System.out.println("Are you smarter than Smartie Pants, Michael Scott and uhm.. Eric Cartman? Let's see!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String playerName = scan.nextLine();

        smartAttack.names.put(smartAttack.playerIds.get(0), "Smartie Pants");
        smartAttack.names.put(smartAttack.playerIds.get(1), "Michael Scott");
        smartAttack.names.put(smartAttack.playerIds.get(2), "Eric Cartman");
        smartAttack.names.put(smartAttack.playerIds.get(PLAYER_IDX), playerName);

        smartAttack.constructGame();
        while (true) {
            // setting player 4 to be you - the NON BOT
            int i = 0;

            System.out.println("Please enter the index numbers of the cards you want to pass:");
            int index1 = scan.nextInt();
            int index2 = scan.nextInt();
            int index3 = scan.nextInt();

            List<Card> cardsToPlay = new LinkedList<Card>();
            for (Card c : smartAttack.game.getUserHand(smartAttack.playerIds.get(PLAYER_IDX))) {
                if (i == index1 || i == index2 || i == index3) {
                    cardsToPlay.add(c);

                    if (cardsToPlay.size() == 3)
                        break;
                }
                i++;
            }
            // Card not found
            if (cardsToPlay.size() != 3) {
                cardsToPlay.clear();
                continue;
            }

            // Invalid card played
            if (!smartAttack.game.playCard(smartAttack.playerIds.get(PLAYER_IDX), cardsToPlay))
                continue;
            // Cards to pass have been excepted
            else
                break;
        }

        while (!smartAttack.game.isGameOver()) {

            // setting player 4 to be you - the NON BOT
            int i = 0;

            System.out
                    .println("Your cards are: " + smartAttack.game.getUserHand(smartAttack.playerIds.get(PLAYER_IDX)));
            System.out.println("Please enter the index number of the card you want to play:");
            int index = scan.nextInt();

            List<Card> cardsToPlay = new LinkedList<Card>();
            for (Card c : smartAttack.game.getUserHand(smartAttack.playerIds.get(PLAYER_IDX))) {
                if (i == index) {
                    cardsToPlay.add(c);
                    break;
                }
                i++;
            }
            // Card not found
            if (i == smartAttack.game.getUserHand(smartAttack.playerIds.get(PLAYER_IDX)).size())
                continue;

            // Invalid card played
            if (smartAttack.game.playCard(smartAttack.playerIds.get(PLAYER_IDX), cardsToPlay))
                continue;
        }

    }

    @Override
    public void handleSingleCardPlayed(Long srcId, Card cardPlayed) {
        System.out.println("Player " + names.get(srcId) + " played : " + cardPlayed);
    }

    @Override
    public void handleCardsPassed(List<PassingCardsInfo> passingCardInfo) {
        System.out.println("Card passing complete.");
        System.out.println("Your new cards are: " + game.getUserHand(playerIds.get(PLAYER_IDX)));
    }

    @Override
    public void handleScoreUpdate(Map<Long, Byte> userIdToGameScore, Map<Long, Byte> userIdToRoundScore) {
        System.out.println("************* SCORE UPDATE *****************");
        for (Long userId : userIdToGameScore.keySet()) {
            System.out.println("Player " + names.get(userId) + " Game score : " + userIdToGameScore.get(userId)
                    + " Round score: " + userIdToRoundScore.get(userId));
        }
    }

    @Override
    public void handleTrickEnded(Trick finishedTrick) {
        System.out.println("############# Trick OVER ###############\n");
    }

    @Override
    public void handleRoundEnded(Round finishedRound) {
        System.out.println("^^^^^^^^^^^ ROUND OVER ^^^^^^^^^^^^\n");
    }

    @Override
    public void handleRoundStarted(Round startedRound) {
        Map<Long, LinkedList<Card>> userIdCardsMap = startedRound.getUserIdToHand();
        for (Long playerId : playerIds) {
            System.out.println("Player " + names.get(playerId) + " cards : " + userIdCardsMap.get(playerId));
        }
        System.out.println();
    }

    @Override
    public void handleGameEnded(Game finishedGame) {
        System.out.println("$#@$#$@#$@#$@#$ GAME OVER #@$#$@#$@#$@$@#$");

        System.out.println("~~Game Summary~~");

        for (Long id : finishedGame.userIdToGameScore.keySet()) {
            System.out.println(names.get(id) + ": " + finishedGame.userIdToGameScore.get(id));
        }

        System.out.println("Winners are " + finishedGame.findWinner());
    }

}