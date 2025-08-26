package funcoes;

import objetos.Cliente;
import javax.swing.JOptionPane;

public class FuncoesBanco {

    public static Cliente consultarCliente(String agencia, String conta) {
        if(agencia.equals("123") && conta.equals("456")) {
            Cliente c = new Cliente();
            c.setAgencia(agencia);
            c.setConta(conta);
            c.setNome("Lucas Martins");
            c.setEndereco("Rua Exemplo, 100");
            c.setTelefone("99999-9999");
            c.setCpf("123.456.789-00");
            c.setTipoConta("Corrente");
            return c;
        }
        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        return null;
    }

    public static void atualizarCliente(Cliente c) {
        JOptionPane.showMessageDialog(null, "Dados do cliente atualizados com sucesso!");
    }
}
