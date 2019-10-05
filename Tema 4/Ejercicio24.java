
public class Ejercicio24 {
	
	public static void main (String[] args) {
		
    // Introducción programa
    System.out.println("Generador de nómina");
    System.out.println("-------------------");
    System.out.println("1. Programador junior");
    System.out.println("2. Programador senior");
    System.out.println("3. Jefe de proyecto");
    
    // Entrada de datos
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
    int cargoEmpleado = Integer.parseInt(System.console().readLine());
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    int diasViaje = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su estado civil (1. Soltero, 2. Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    // Calculo sueldo base
    
    double sueldoBaseEmpleado = 0;
    
    switch (cargoEmpleado) {
      case 1:
        sueldoBaseEmpleado = 950;
        break;
      case 2:
        sueldoBaseEmpleado = 1200;
        break;
      case 3:
        sueldoBaseEmpleado = 1600;
        break;
      default:
        System.out.println("Ese cargo no existe.");
    }
    
    // Calculo dietas viajes
    
    double dietasViajes = diasViaje * 30; // Cada día de viaje son 30 euros en dietas
    
    // Calculo sueldo bruto
    
    double sueldoBruto = sueldoBaseEmpleado + dietasViajes;
    
    // Calculo IRPF
    
    int IRPF = 0;
    
    switch (estadoCivil) {
      case 1:
        IRPF = 25;
        break;
      case 2:
        IRPF = 20;
        break;
      default:
        System.out.println("Ese estado civil no existe.");
    }
      
    double retencionIRPF = sueldoBruto * IRPF / 100;
      
    // Calculo sueldo neto
    
    double sueldoNeto = sueldoBruto - retencionIRPF;
    
    // Salida a pantalla de los datos
    
    System.out.printf("-------------------------------\n");
    System.out.printf("| Sueldo base         %6.2f |\n", sueldoBaseEmpleado);
    System.out.printf("| Dietas (%d viajes)    %6.2f |\n", diasViaje, dietasViajes);
    System.out.printf("------------------------------\n");
    System.out.printf("| Sueldo bruto        %6.2f |\n", sueldoBruto);
    System.out.printf("| Retención IRPF       %6.2f |\n", retencionIRPF);
    System.out.printf("------------------------------\n");
    System.out.printf("| Sueldo neto         %6.2f |\n", sueldoNeto);
    System.out.printf("-------------------------------\n");
      
	}
}

