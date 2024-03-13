
public class MainQuadrado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado primeiroQuadrado = new Quadrado();
		primeiroQuadrado.base = 10;
		primeiroQuadrado.altura = 20;
		
		Quadrado segundoQuadrado = new Quadrado();
		segundoQuadrado.altura = 30;
		segundoQuadrado.base = 40;
		
		System.out.println(primeiroQuadrado.calcularArea());
		System.out.println(segundoQuadrado.calcularArea());
	}
}
