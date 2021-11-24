package LavaJatoApp;
import javax.swing.JOptionPane;

public class LavaJatoApp {
    public static void main(String[] args) throws Exception {
    
        Lava_Jato Lava_Jato = new Lava_Jato();
           Object[] opcoes = { "Novo Veículo", "Em Processo", "Finalizado", "Alterar", "Sair" };
             int escolha = 0;
             int auto = 0;

                   do {
                     escolha = JOptionPane.showOptionDialog(null, "Seja bem vindo ao app do Lava a Jato. Escolha uma opção! ", "Lava a Jato", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
            switch (escolha) {
                 case 0:
                
                 MMD MMD = new MMD();
                    MMD.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                       MMD.setMarcaModelo(JOptionPane.showInputDialog(null, "Marca/Modelo: "));
                       MMD.setCor(JOptionPane.showInputDialog(null, "Cor: "));
                    MMD.setPlaca(JOptionPane.showInputDialog(null, "Placa: "));
                  Lava_Jato.incluir(MMD);
                break;
            case 1:
                  JOptionPane.showMessageDialog(null, Lava_Jato.verLista());
                break;
                   case 2:
                   auto = Integer.parseInt(JOptionPane.showInputDialog(null,
                        Lava_Jato.verLista() + "Excluir: "));
                    Lava_Jato.excluir(auto);
                break;
            case 3:
                 auto = Integer.parseInt(JOptionPane.showInputDialog(null,
                    Lava_Jato.verLista() + "Alterar:  "));

                         MMD MMDAlterar = new MMD();
                            MMDAlterar.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                               MMDAlterar.setMarcaModelo(JOptionPane.showInputDialog(null, "Informe marca/modelo: "));
                                 MMDAlterar.setCor(JOptionPane.showInputDialog(null, "Informe a cor: "));
                                    MMDAlterar.setPlaca(JOptionPane.showInputDialog(null, "Informe a placa: "));
                                        Lava_Jato.atualizar(auto, MMDAlterar);
                break;
            default:
                break;
            }
        } while (escolha != 4);

    }
}