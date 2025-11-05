package logica;
public class Parcial {
	public double [] ecuacionsegundogrado(double a, double b, double c) throws Exception {
		double discriminante= (b*b)-(4*a*c);
		if(a == 0  ) {
			throw new Exception("Numero a no valido");
		}
		if(discriminante< 0) {
			throw new Exception("Las raices no se encuentra en los reales");
		}
		
			double raizmas = (-b+Math.sqrt(discriminante)/2*a);
			double raizmenos = (-b-Math.sqrt(discriminante)/2*a);
			double [] resultados= new double[2];
			resultados[0]=raizmas;
			resultados[1]=raizmenos;
			return resultados;
		}
	}