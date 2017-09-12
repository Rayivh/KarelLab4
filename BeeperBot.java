
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void runRace() {
        faceEast();
        while (frontIsClear()){
            collectBeepers();
            
        }   
    }
    public void collectBeepers() {
         findBeeperColumn();
         fetchBeepers();
    }
    public void faceEast() {
         while(!facingEast()){
             turnLeft();
         }
    }
    public void findBeeperColumn() {
         while (!nextToABeeper() && frontIsClear()){
             move();
         }
         turnLeft();
         fetchBeepers();
         turnLeft();
         turnLeft();
         while(frontIsClear()){
             move();
         }
         faceEast();
    }
    public void fetchBeepers() {
         while (nextToABeeper()){
             pickBeeper();
             move();
         }
    }
}