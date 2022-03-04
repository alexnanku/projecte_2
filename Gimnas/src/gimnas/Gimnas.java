package gimnas;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gimnas {
    
    private String nom;
    private String CIF;
    private int telefon;

    boolean exit;
    boolean exit2;
    Scanner keyboard = new Scanner(System.in);
    
    private Client client = new Client();

    ArrayList<Client> clients;
    ArrayList<Activitat> activitats;
    ArrayList<Reserva> reserves;
    
    public Gimnas(){
        this.clients = new ArrayList();
        this.activitats = new ArrayList();
        this.reserves = new ArrayList();
    }

    public void gestionarGimnas() throws SQLException {
    
        do {
            System.out.println("GESTOR D'INVENTARI");
            System.out.println("1. Gestió client");
            System.out.println("2. Visaualitzar clients per criteri");
            System.out.println("3. Visualitzar activitats del dia");
            System.out.println("4. Guardar");
            System.out.println("5. Sortir");
            System.out.println("\nTria una opcio");

            // Declarem que el int opció es pugui introduir per consola mitjançant la funció
            // nextInt.
            int opcio = keyboard.nextInt();

            switch (opcio) {
                case 1:
                    do {
                        System.out.println("Gestió Client");
                        System.out.println("1. Consulta Client");
                        System.out.println("2. Alta");
                        System.out.println("3. Baixa");
                        System.out.println("4. Modificació");
                        System.out.println("5. Enrere");
                        System.out.println("\nTria una opcio");

                        int opcio2 = keyboard.nextInt();

                        switch (opcio2) {
                            case 1:
                                
                               client.consultaClient();
                                break;
                            case 2:
                               client.altaClient();
                                break;
                            case 3:
                               
                                break;
                            case 4:
                                
                                break;
                            case 5:
                                exit2 = true;
                                break;
                            default:
                                System.out.println("La opció sel·leccionada no és vàl·lida");
                        }
                    } while (!exit2);
                    break;
                case 2:
                    do {
                        
                        System.out.println("2. Visualitzar clients per cognom");
                        System.out.println("3. Visualitzar clients per edat");
                        System.out.println("4. Visualitzar clients per reserves");
                        System.out.println("5. Enrere");
                        System.out.println("\nTria una opcio");

                        int opcio2 = keyboard.nextInt();

                        switch (opcio2) {
                            case 1:
                                this.clients = client.getClientsOrdenatsCognom();
                                visualitzarClients();
                                break;
                            case 2:
                                
                                break;
                            case 3:
                               
                                break;
                            case 4:
                                exit2 = true;
                                break;
                            default:
                                System.out.println("La opció sel·leccionada no és vàl·lida");
                        }
                    } while (!exit2);
                    break;
                case 3:
                    
                    break;
                case 4:

                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("La opció sel·leccionada no és vàl·lida");
            }

            System.out.println("\nOpció: " + opcio);

        } while (!exit);
    }

    public Gimnas(String nom, String cIF, int telefon) {
        this.nom = nom;
        CIF = cIF;
        this.telefon = telefon;
    }
    
    private void visualitzarClients() {
        for(Client cli: this.clients){
            System.out.println(cli);
        }
    }
}