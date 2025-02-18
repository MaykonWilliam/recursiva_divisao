package recursiva_divisao;

public class DivisaoRecursiva {
	public static int restoDivisao(int dividendo, int divisor) {

		if (dividendo < divisor) {
			return dividendo;
		}
		
		return restoDivisao(dividendo - divisor, divisor);
	}
}
