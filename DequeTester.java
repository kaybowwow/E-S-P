//Grace Cuenca
//APCS2 pd1
//HW29 -- Stress is the Best
//2017-04-05

public class DequeTester{

    public static void main (String[] args){

	Deck mine = new Deck(10);

	//since there are no elements in the AL, nothing can be removed; error exception will be thrown
	mine.removeEnd();
	System.out.println(mine);

	//since there are no elements in the AL, nothing can be removed; error exception will be thrown
	mine.removeFront();
	System.out.println(mine);

	//handles error silently (\n)
	mine.pollEnd();
	System.out.println(mine);

	//at the end of these calls, 5 should be in the front
	mine.addEnd(5);
	mine.addEnd(6);
	System.out.println(mine);

	//at the end of these calls, 9 should be in the front
	mine.addFront(9);
	System.out.println(mine);

	//at the end of these calls, it should look the same because there are no 1's in the AL
	mine.removeFirst(1);
	System.out.println(mine);

	//should print 9
	System.out.println(mine.peekFront());

	//should print 6
	System.out.println(mine.peekEnd());

	//at the end of these calls, the 9 should be gone
	mine.removeFront();
	System.out.println(mine);

	mine.addEnd(9);
	mine.addEnd(9);
	mine.addEnd(7);
	mine.addEnd(9);
	mine.addEnd(9);
	mine.addEnd(9);
	System.out.println(mine);

	//at the end of these test calls, there should only be two 9s after the 7
	mine.removeLast(9);
	System.out.println(mine);

	//should return 7
	System.out.println(mine.size());

	//should print true
	System.out.println(mine.contains(9));

	//5 at front should be gone
	mine.pollFront();
	System.out.println(mine);

	//should print 1
	System.out.println(mine.atIndex(9));
	
    }
    
}
