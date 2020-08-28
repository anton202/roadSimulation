
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{

    public static void main(String [] args){
        Road road = new Road(50,70);
        /* road.addHorizontalBorder(3,0,4);
        road.addHorizontalBorder(6,0,4);
        road.addVirticalBorder(8,4,3);
        road.addVirticalBorder(3,4,4);
        road.addVirticalBorder(8,10,9);*/

        road.addVirticalBorder(49,0,50);
        road.addVirticalBorder(49,8,15);
        road.addHorizontalBorder(34,8,15);
        road.addHorizontalBorder(31,8,22);
        road.addVirticalBorder2(31,30,9);
        road.addVirticalBorder2(34,23,8);
        road.addHorizontalBorder(42,23,20);

        road.fillRoadGrid();
        road.printRoad();

    }
}