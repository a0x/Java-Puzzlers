package Puzzle44;
//	��Ҫ��дһ���ܹ�̽���ඪʧ�ĳ�����ʹ�÷���
//	��Ҫ�Բ���NoClassDefFoundError�γ�����
public class Strange {
	public static void main(String[] args) throws Exception {
		try {
			Object m = Class.forName("Missing").newInstance();
		} catch (ClassNotFoundException e) {
			 System.err.println("Got it!");
		}
	}
}
