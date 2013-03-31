package Puzzle43;

public class Thrower {
	private static Throwable t;
	public Thrower() throws Throwable{
		throw t;
	}
	
	public static synchronized void sneakyThrow(Throwable t) {
		Thrower.t = t;
		try{
			Thrower.class.newInstance();
		} catch (InstantiationException e){
			try {
				throw new IllegalAccessException();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IllegalAccessException e) {
			try {
				throw new IllegalAccessException();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			Thrower.t = null;
		}
	}
}

class TigerThrower<T extends Throwable> {
	public static void sneakyThrow(Throwable t) {
		new TigerThrower<Error>().sneakyThrow2(t);
	} 
	
	private void sneakyThrow2(Throwable t) throws T{
		throw (T)t;
	}
}