package be.com.alura.ExercicioThread02;



public class ImprimeString {
	
	public static void main(String[] args) {
		
		Runnable tarefa = new CodeRun();
		Thread executar = new Thread(tarefa, "Imprimindo uma mensagem");
		executar.start();
	}

}
