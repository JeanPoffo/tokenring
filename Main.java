
import control.ControllerSystem;
import view.ViewSystem;

/**
 * Classe Main do Sistema
 * @author Jean Poffo
 * @since 02/11/2018
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControllerSystem.getInstance().addObserver(new ViewSystem(ControllerSystem.getInstance()));
    }
}