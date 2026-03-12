public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Ana", "(11) 99999-1111", "ana@email.com");
        Contato contato2 = new Contato("Carlos", "(21) 98888-2222", "carlos@email.com");
        Contato contato3 = new Contato("Marina", "(31) 97777-3333", "marina@email.com");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        agenda.listarContatos();

        agenda.removerContato("Carlos");

        agenda.listarContatos();
    }
}
