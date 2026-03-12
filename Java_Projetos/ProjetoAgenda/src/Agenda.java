import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println(contato.getNome() + " foi adicionado(a) à agenda.");
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println(contatos.get(i).getNome() + " foi removido(a) da agenda.");
                contatos.remove(i);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }

        System.out.println("\nLista de contatos:");
        for (Contato contato : contatos) {
            contato.exibirContato();
            System.out.println("-----------------------");
        }
    }
}
