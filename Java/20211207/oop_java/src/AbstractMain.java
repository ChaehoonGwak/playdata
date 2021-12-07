import test.model.util.Animal;
import test.model.util.Bird;
import test.model.util.SuperMan;

public class AbstractMain {

	public static void main(String[] args) {

		Animal [] aniAry = new Animal [2]	;
		aniAry[0] = new Bird()	;
		aniAry[1] = new SuperMan()	;
		for(int i=0 ; i < aniAry.length ; i++ ) {
			aniAry[i].fly();
		}
	}

}
