package ar.edu.unju.escmi.poo.dominio;

import java.text.DecimalFormat;
import ar.edu.unju.escmi.poo.tablas.TablaProducto;

import ar.edu.unju.escmi.poo.tablas.TablaPlan;

public abstract class Cliente extends Persona {

	public Cliente() {
	}

	public Cliente(String usuario, String contrasenia,long dni) {
		super(usuario, contrasenia,dni);
	}

	public void crearPlan(Plan compra) {
        for(int i=0;i<TablaProducto.productos.size();i++){
            for(int o=0;o<compra.getCarritos().size();o++)
            if(TablaProducto.productos.get(i).getModelo()==compra.getCarritos().get(o).getModelo()) {
                TablaProducto.productos.get(i).setStock(TablaProducto.productos.get(i).getStock()-compra.getCarritos().get(o).getCantidad());
            }
        }
        TablaPlan.planes.add(compra);
    }

	public void listarPlan(Persona logeado) {
        Plan aux=new Plan();
        DecimalFormat formato1 = new DecimalFormat("#.00");
        for (int i = 0; i < TablaPlan.planes.size(); i++) {
            if (TablaPlan.planes.get(i).getTitular() == logeado.getUsuario()) {
                aux.setTitular(TablaPlan.planes.get(i).getTitular());
                if (logeado instanceof Particular) {
                    System.out.println("Su plan es de " + Linea1.LIMITE_CUOTAS + " cuotas de "
                            + formato1.format(TablaPlan.planes.get(i).getMontoPorCuota())  + "$, con un precio final de "
                            + formato1.format(TablaPlan.planes.get(i).getMontoTotal())  + "$");
                    System.out.println(
                            "A usted le queda por pagar " + TablaPlan.planes.get(i).getCantCuotas() + " cuotas");
                    System.out.println("Monto que queda por pagar "
                            + formato1.format((TablaPlan.planes.get(i).getMontoPorCuota() * TablaPlan.planes.get(i).getCantCuotas()))) ;
                } else {
                    System.out.println("Su plan es de " + Linea2.LIMITE_CUOTAS + " cuotas de "
                            + formato1.format(TablaPlan.planes.get(i).getMontoPorCuota())  + "$, con un precio final de "
                            + formato1.format(TablaPlan.planes.get(i).getMontoTotal())  + "$");
                    System.out.println(
                            "A usted le queda por pagar " + TablaPlan.planes.get(i).getCantCuotas() + " cuotas");
                    System.out.println("Monto que queda por pagar "
                            + formato1.format((TablaPlan.planes.get(i).getMontoPorCuota() * TablaPlan.planes.get(i).getCantCuotas())));
                }
            }
        }
        if(aux.getTitular()==null) {
            System.out.println("Este Cliente aun no efectuo ninguna compra");
        }
    }
	
	public void pagarCuota(Persona logeado){
        Plan aux=new Plan();
        for (int i=0;i< TablaPlan.planes.size();i++) {

            if(TablaPlan.planes.get(i).getTitular() == logeado.getUsuario()) {
                if(TablaPlan.planes.get(i).getCantCuotas()==0) {
                    System.out.println("Usted ya termino de pagar todas sus cuotas");
                    return;
                }else {
                    TablaPlan.planes.get(i).setCantCuotas(TablaPlan.planes.get(i).getCantCuotas()-1);
                    aux.setTitular(TablaPlan.planes.get(i).getTitular());
                }

            }
        }
        if(aux.getTitular()==null) {
            System.out.println("Este Cliente aun no efectuo ninguna compra");
        }else {
            System.out.println("Su pago fue realizado");
        }
    }
}
