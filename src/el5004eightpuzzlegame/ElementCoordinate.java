/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el5004eightpuzzlegame;

/**
 *
 * @author Bagus Hanindhito
 * The ElementCoordinate class define the coordinate of each element in the puzzle
 * in the form of horizontal (integer) and vertical (integer) coordinate.
 * The origin (0,0) is started on the left-bottom side.
 * 
 */
public class ElementCoordinate
{
    private int HorizontalCoordinate;
    private int VerticalCoordinate;
    
    public ElementCoordinate()
    {
        this.HorizontalCoordinate = 0;
        this.VerticalCoordinate = 0;
    }
    
    public ElementCoordinate(int InitHorizontalValue, int InitVerticalValue)
    {
        this.HorizontalCoordinate = InitHorizontalValue;
        this.VerticalCoordinate = InitVerticalValue;
    }
    
    public int getHorizontalCoordinate()
    {
        return this.HorizontalCoordinate;
    }
    
    public int getVerticalCoordinate()
    {
        return this.VerticalCoordinate;
    }
    
    public void setHorizontalCoordinate(int newHorizontalValue)
    {
        this.HorizontalCoordinate = newHorizontalValue;
    }
    
    public void setVerticalCoordinate(int newVerticalValue)
    {
        this.VerticalCoordinate = newVerticalValue;
    }
}
