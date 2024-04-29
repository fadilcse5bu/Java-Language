package Inheritance;

public class GarbageCollector {
	public static void main(String[]  args) {
		GC obj = new GC(); // this is a garbage
		// garbage collector will collect the garbage while need some memory otherwise not 
		obj = new GC(); 
		
		GC obj2 = new GC();
		obj2 = new GC();
		System.gc(); // we can manually call for collecting the garbage;
	}
}

class GC extends Object {
	// this method is in Object class, 
	// called every time while garbage collector collects the garbage
	protected void finalize() { // overrided from the Object class
		System.out.println("Destroyed");
	}
}
