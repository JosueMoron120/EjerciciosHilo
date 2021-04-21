package Tarea1;

public class Principal {
	public static void main(String[] args) {
		String[] nombres = {"Josue", "Andre" , "Leonardo", "Sesar", "Kevin", "Elias", "Manuel", "Maria" , "David", "Benjamin"};
		for (String nomb:nombres){
			Hilo1 h = new Hilo1(nomb);
			Thread t = new Thread(h);
			t.start();
		}
		{

		}
	}
	
}
