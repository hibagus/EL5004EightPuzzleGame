/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el5004eightpuzzlegame;

/**
 *
 * @author Bagus Hanindhito
 * This GameParameter class defines the parameter of the games. 
 */
public class GameParameter
{
    // Adjustable
    public static final int GameSquareLength = 3;
    public static final int GameOriginCoordinate = 0;
    
    // Not adjustable
    public static int MinimumHorizontalCoordinate = GameOriginCoordinate;
    public static int MinimumVerticalCoordinate = GameOriginCoordinate;
    public static int GameNumofTile = GameSquareLength * GameSquareLength;
    public static int MaximumHorizontalCoordinate = MinimumHorizontalCoordinate + GameSquareLength - 1;
    public static int MaximumVerticalCoordinate = MinimumVerticalCoordinate + GameSquareLength - 1;
}
