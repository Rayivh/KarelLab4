
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        while (frontIsClear()){
            doTheThing();
            turnRight();
        }
        
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void  doTheThing() {
        while (frontIsClear()){
            turnLeft();
            putBeeper();
            if (frontIsClear()){
                move();
                putBeeper();
                turnLeft();
            }
            else {
                turnRight();
            }
            move();
            if(nextToABeeper()){
                turnOff();
            }
        }
    }
}

