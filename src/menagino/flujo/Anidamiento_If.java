package menagino.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showInternalMessageDialog(null, "Para porder Acceder al credito de la casa debes de cumplir satisfactoriamente todos los requisitos.");
		
		JOptionPane.showInternalMessageDialog(null, "A continuacion te pedire unos datos, por favor lee atentamente y llena los campos.");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		
		int valorauto = 2500;

		if (edad >= 18) {

			String carnet = JOptionPane.showInputDialog("¿Tienes Libreta de Conducir?: Si o No");

			if (carnet.equalsIgnoreCase("Si")) {

				double estadoCuenta = Double.parseDouble
						(JOptionPane.showInputDialog("Necesitas tener como minimo, tener un estado de cuenta de U$s5000 acceder al cretido ¿Cual es tu estado de cuenta?"));

				if (estadoCuenta >= 5000) {

					JOptionPane.showMessageDialog(null,"Cumples satisfactoriamente todos los requisitos para comprar el auto.");
							
					JOptionPane.showMessageDialog(null, "El valor del auto a comprar es de U$S 2500.");

					String compraOK = JOptionPane.showInputDialog("¿Deseas Finalizar la comprar?: Si o No.");

					if (compraOK.equalsIgnoreCase("si")) {

						JOptionPane.showMessageDialog(null, "Aceptamos Visa, OCA, Mastercard.");
						
						JOptionPane.showMessageDialog(null, "Para pagar Digite 1 Visa, 2 OCA, 3 MasterCard.");

						String op = JOptionPane.showInputDialog("Ingresa tu medio de pago.");

						if (op.equals("1")) {

							String pagarVisa = JOptionPane.showInputDialog("Visa ofrece 2 pagos, en cuantos pagos deceas realizar la compra.");
									
							if (pagarVisa.equals("1")) {

								JOptionPane.showMessageDialog(null,"Su compra se a realizado satisfactoriamente, el monto total es una unica couta de U$S: "+ valorauto);
										
							}

							if (pagarVisa.equals("2")) {

								int cuota = 2;
								
								JOptionPane.showMessageDialog(null,"Su compra se a realizado satisfactoriamente, y el pago son dos cuotas de U$S " + (valorauto / cuota));
																				
							}

						}
						if (op.equals("2")) {

							JOptionPane.showMessageDialog(null, "Oca Ofrece 10% de descueto a compras en una unica cuota, y hasta 4 cuotas maximo");
									
							int cuotaOCA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuotas 1, 2, 3, 4"));
									
							if (cuotaOCA == 1) {

								JOptionPane.showMessageDialog(null,"A elegido el medio de pago con 10% de descuento en una unica cuota el valor desciende de "+ valorauto + " a " + ((valorauto / 10) - valorauto));
																						
							}

							if (cuotaOCA == 2) {

								JOptionPane.showMessageDialog(null, "A seleccionado realizar el pago en 2 cuotas de U$S" + (valorauto / 2));
										
							}

							if (cuotaOCA == 3) {

								JOptionPane.showMessageDialog(null,"A seleccionado realizar el pago en 3 cuotas de U$S" + (valorauto / 3));
										
							}

							if (cuotaOCA == 4) {

								JOptionPane.showMessageDialog(null,"A seleccionado realizar el pago en 4 cuotas de U$S" + (valorauto / 4));
										
							}

						}

						if (op.equals("3")) {

							JOptionPane.showMessageDialog(null,"Has elegigo MasterCard como medio de pago, este tiene un unico pago con un descuento del 18%");
									
							JOptionPane.showMessageDialog(null,"Si deseas proceder con la compra digita 1 de lo contrario digita 2 para salir");
									
							String pagarOK = JOptionPane.showInputDialog("Ingresa tu Opsion");

							if (pagarOK.equals("1")) {

								JOptionPane.showMessageDialog(null,"Has elegido comprar con un 18% de descuento la suma asciende a " + ((valorauto + (valorauto / 100) * 18)) +".");
																						
							}

							if (pagarOK.equals("2")) {

								JOptionPane.showMessageDialog(null, "Lamentamos no poder complacerte.");
							}

						}else {
							JOptionPane.showMessageDialog(null, "Has ingresado un valor equivocado por favor vuelve a intentarlo.");
						}


					} else {

						JOptionPane.showMessageDialog(null, "Muchas gracias por visitarnos, lo espermos pronto.");
					}

				}else {
					JOptionPane.showMessageDialog(null, "No cumples con los fondos minimos para acceder al credito.");
				}

			}else {
				JOptionPane.showMessageDialog(null, "La libreta de conducir es un requisito excluyente.");
			}

		}else {

			JOptionPane.showMessageDialog(null,"Eres menor de edad o no has ingresado los datos correspondientes, por lo tanto no puedes comprarlo.");
					
		}

	}

}
