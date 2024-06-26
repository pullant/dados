import java.util.Scanner;
public class test {
	public static int esDado(int dado) {
		if (!(dado >= 1 && dado <= 6)) {
			return 0;
		}
		return dado;
	}
	public static boolean esPar(int dado) {
		return dado == 0 ? false : dado % 2 == 0;
	}
	public static int calcularPuntaje(int dadoA, int dadoB) {
		if (esPar(dadoA) && esPar(dadoB)) {
			return dadoA * dadoB;
		}
		return dadoA + dadoB;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int dadoA = scanner.nextInt();
		int dadoB = scanner.nextInt();
		System.out.println(calcularPuntaje(esDado(dadoA), esDado(dadoB)));
		//System.out.println(esDado(dadoA) + "   " + esDado(dadoB));
	}
}
