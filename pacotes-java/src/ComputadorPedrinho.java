import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.Telegram;

/*
 * Simulação do uso da classe apps.MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}