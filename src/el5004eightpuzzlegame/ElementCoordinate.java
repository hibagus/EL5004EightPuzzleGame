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
    
    public void moveOneStepNorth()
    {
        /*
        * This Method will move the coordinate one to the north.
        * Please verify if moving to the north is a legal move first otherwise
        * the resulting coordinate will out of the boundaries.
        */
        setVerticalCoordinate(getVerticalCoordinate() + 1);
    }
    
    public void moveOneStepSouth()
    {
        /*
        * This Method will move the coordinate one to the south.
        * Please verify if moving to the south is a legal move first otherwise
        * the resulting coordinate will out of the boundaries.
        */
        setVerticalCoordinate(getVerticalCoordinate() - 1);
    }
    
    public void moveOneStepEast()
    {
        /*
        * This Method will move the coordinate one to the east.
        * Please verify if moving to the east is a legal move first otherwise
        * the resulting coordinate will out of the boundaries.
        */
        setHorizontalCoordinate(getHorizontalCoordinate() + 1);
    }
    
    public void moveOneStepWest()
    {
        /*
        * This Method will move the coordinate one to the west.
        * Please verify if moving to the west is a legal move first otherwise
        * the resulting coordinate will out of the boundaries.
        */
        setHorizontalCoordinate(getHorizontalCoordinate() - 1);
    }
    
    public boolean isMoveOneStepNorthValid()
    {
        /*
        * Validate whether moving one step to the north is a legal move or not.
        */
        return getVerticalCoordinate() < GameParameter.MaximumVerticalCoordinate;
    }
    
    public boolean isMoveOneStepSouthValid()
    {
        /*
        * Validate whether moving one step to the south is a legal move or not.
        */
        return getVerticalCoordinate() > GameParameter.MinimumVerticalCoordinate;
    }
    
    public boolean isMoveOneStepEastValid()
    {
        /*
        * Validate whether moving one step to the east is a legal move or not.
        */
        return getHorizontalCoordinate() < GameParameter.MaximumHorizontalCoordinate;
    }
    
    public boolean isMoveOneStepWestValid()
    {
        /*
        * Validate whether moving one step to the west is a legal move or not.
        */
        return getHorizontalCoordinate() > GameParameter.MinimumHorizontalCoordinate;
    }
    
}
