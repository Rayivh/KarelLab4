 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        while (frontIsClear()){
            doTheThing();
            turnRight();
        }
    }
    public void doTheThing() {
       while (frontIsClear()){
            turnLeft();
            if (frontIsClear()){
                putBeeper();
            }
            turnRight();
            move();
            if(nextToABeeper()){
                turnOff();
            }
        } 
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}


