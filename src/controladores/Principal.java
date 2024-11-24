package controladores;
import java.util.ArrayList;
import dto.Datos;
import java.util.Scanner;

/**
 * @author yuki
 * 24-11-2024
 * Puerta de entrada a mi aplicación
 */
public class Principal {
	
	//scanner static a nivel de clase
	public static Scanner sc = new Scanner(System.in);
	
	//arraylist static a nivel de clase
	static ArrayList<Datos> cartas = new ArrayList<>();
	
	
	/**
	 * author yuki
	 * 24-11-2024
	 * Clase controladora de mi aplicación
	 */
	public static void main(String[] args) {
		
		boolean esCerrado =false;
		
		//mostrar menu principal
		do { 
			
		
		System.out.println("Bienvenido al creador de cartas de pokemon");
		System.out.println("Por favor seleccione una opcion");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("0. Crear una carta");
		System.out.println("1. Eliminar una carta");
		System.out.println("2. Listar tu album");
		System.out.println("3. Modificar una carta");
		System.out.println("4. Salir");
		
		byte opcion=sc.nextByte();
		
		
		 switch (opcion) {
		case 0: { 
			//añadir una carta
	
		    // Crear una nueva carta
		    System.out.println("Indica el nombre de tu carta");
		    String nombre = sc.next();
		    System.out.println("Indica el tipo de tu carta");
		    String tipo = sc.next();
		    System.out.println("Indica la fase de tu pokémon " + "(0-3)");
		    byte fase = sc.nextByte();
		    System.out.println("Indica los puntos de vida de tu carta");
		    byte puntosVida = sc.nextByte();

		    // Crear una nueva instancia de Datos
		    Datos nuevaCarta = new Datos(nombre, tipo, fase, puntosVida);
		    cartas.add(nuevaCarta); // Añadir al álbum
		    System.out.println("Carta creada con éxito.");
		    break;
		}
		
		
		case 1:{
			//eliminar una carta
			System.out.println("Indica el nombre de la carta a borrar");
			String borrarCarta = sc.next();
			Datos cartaParaBorrar = new Datos(borrarCarta, borrarCarta, 0, 0);
			
			for (Datos auxCartas : cartas) {
				if (borrarCarta.equals(auxCartas.getNombre())) {
					
					cartaParaBorrar = auxCartas;
					break;
					
				}
			}
			cartas.remove(cartaParaBorrar);
			System.out.println(cartas.size());
			break;
			
		}
		
		case  2:{
			 for (Datos carta : cartas) {
		            System.out.println(carta.toString());
		        }
			 break;
		}
		
		//muestra opciones de modificación de carta
		case 3: {
		
			
			System.out.println();
			System.out.println("**MODIFICACIÓN DE CARTAS**");
			System.out.println("**INTRODUZCA UN DATO A MODIFICAR");
			System.out.println();
			
			System.out.println("1. Modificar nombre");
			System.out.println("2. Modificar tipo");
			System.out.println("3. Modificar fase");	
			System.out.println("4. Modificar puntos de vida");
			
			byte opcionCase =sc.nextByte();
			sc.nextLine();
			
		
			switch (opcionCase) {
			
//**********COMIEZO DE SUBMENU************************//
			case 1: {
				for(Datos euxCartas : cartas) {
					
					System.out.println();
					System.out.println("**MODIFICACIÓN DE NOMBRE**");
					System.out.println();
					
					System.out.println("Introduzca el nombre de la carta a modificar");
					String euxModificarNombre = sc.next();
					
						if (euxModificarNombre.equals(euxCartas.getNombre())) {
							System.out.println("Introduzca el nuevo nombre de tu carta");
							euxCartas.setNombre(sc.next());
							break;
						}
					
				}
				break;
			}
				
				case 2:{
					for(Datos iuxCartas : cartas) {
						
						System.out.println();
						System.out.println("**MODIFICACIÓN DE TIPO");
						System.out.println();
						
						System.out.println("Introduzca el nombre de la carta a modificar su tipo");
						String iuxModificarTipo = sc.next();
						
							if (iuxModificarTipo.equals(iuxCartas.getNombre())) {
								System.out.println("Introduzca el nuevo tipo de tu " + iuxModificarTipo);
								iuxCartas.setTipo(sc.next());
								break;
							}
						
					}
					break;
					
				}
				
				case 3: {
					
					for(Datos ouxCartas : cartas) {
						
						System.out.println();
						System.out.println("**MODIFICACION DE FASE**");
						System.out.println();
						
						System.out.println("Introduzca el nombre de la carta a modificar su fase");
						String iuxModificarFase = sc.next();
						
							if (iuxModificarFase.equals(ouxCartas.getNombre())) {
								System.out.println("Introduzca la nueva fase de tu " + iuxModificarFase);
								ouxCartas.setFase(sc.nextByte());
								break;
							}
						
					}
					break;
					
				}
				
				case 4: {
					
					for(Datos uuxCartas : cartas) {
						
						System.out.println();
						System.out.println("**MODIFICACION DE SALUD**");
						System.out.println();
						
						System.out.println("Introduzca el nombre de la carta a modificar su salud");
						String iuxModificarSalud = sc.next();
						
							if (iuxModificarSalud.equals(uuxCartas.getNombre())) {
								System.out.println("Introduzca los nuevos puntos de salud de tu " + iuxModificarSalud);
								uuxCartas.setPuntosVida(sc.nextByte());
								break;
							}
						
					}
					break;
					
				}
//**************FIN DE SUBMENU********************//				
				
			
			//default de submenu
			default:
				System.out.println("**SUBMENU**");
				 System.out.println("Opción inválida.");
		            break;
			}
			sc.nextLine();
			break;
		}
		
		case 4: {
			System.out.println("**Gracias por usar mi programa**");
			esCerrado = true;
			
			sc.close();
			break;
			
		}
		
		
		
		//default de menu principal
		default:
			System.out.println("**MENU**");
			 System.out.println("Opción inválida.");
	            break;
		}
		
		}while(!esCerrado);
		
		
	}
	
}
