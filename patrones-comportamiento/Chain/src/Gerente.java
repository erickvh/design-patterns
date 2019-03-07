
public class Gerente implements Autorizador{


@Override
public void autorizar(int num) {

		System.out.println("Gerente autoriza, "+num);
}
}
