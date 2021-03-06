package com.snake.game;

import com.badlogic.gdx.*;
import com.snake.game.gamescreens.BestResultsScreen;
import com.snake.game.gamescreens.EndScreen;
import com.snake.game.gamescreens.MainGameScreen;
import com.snake.game.gamescreens.MenuScreen;

/**
 * Game abstraction, actually responsible for changing game screens and starts rendering
 */
public class SnakeGame extends Game {

    @Override
    public void create() {
        MenuScreen menuScreen = new MenuScreen(this);
        setScreen(menuScreen);
    }

    public void changeGameScreenToMainGameScreen() {
        System.out.println("CHANGE SCREEN TO GAME");
        setScreen(new MainGameScreen(this));
    }

    public void changeGameScreenToEndScreen(String winner, int playerPoints, int aiPoints) {
        System.out.println("WINNER: " + winner);
        setScreen(new EndScreen(this, winner, playerPoints, aiPoints));
    }

    public void changeGameScreenToBestResultsScreen(String resultsFilename) {
        setScreen(new BestResultsScreen(this, resultsFilename));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
    }

}
