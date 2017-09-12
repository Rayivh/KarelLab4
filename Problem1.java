
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        while(frontIsClear()){
            move();
        }
        turnRight();
        while (frontIsClear()){
            move();
            checkForExit();
        }   
    }
    public void checkForExit() {
        while (frontIsClear()){
            turnLeft();
            if (frontIsClear()){
                move();
                turnOff();
            }
            turnRight();
            move();
        }
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

