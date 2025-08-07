using System;
namespace SingletonAtividade
{
    
class Cliente
{
    public string Nome { get; set; }
    public string Email { get; set; }
}

class SessaoUsuario
{
    private static SessaoUsuario instancia;
    private static readonly object bloqueio = new object();

    private Cliente cliente;
    private bool autenticado;

    private SessaoUsuario()
    {
        autenticado = false;
    }

    public static SessaoUsuario Instancia
    {
        get
        {
            if (instancia == null)
            {
                lock (bloqueio)
                {
                    if (instancia == null)
                        instancia = new SessaoUsuario();
                }
            }
            return instancia;
        }
    }

    public void Autenticar(Cliente cliente)
    {
        this.cliente = cliente;
        autenticado = true;
        Console.WriteLine($"Cliente {cliente.Nome} autenticado com sucesso.");
    }

    private bool VerificarAutenticacao()
    {
        if (!autenticado)
        {
            Console.WriteLine("Acesso negado: cliente não está autenticado.");
            return false;
        }
        return true;
    }

    public void AcessarPainel()
    {
        if (VerificarAutenticacao())
        {
            Console.WriteLine($"Bem-vindo ao painel, {cliente.Nome}!");
        }
    }

    public Cliente GetCliente()
    {
        if (VerificarAutenticacao())
        {
            return cliente;
        }
        return null;
    }

    public void SetInformacaoCliente(string nome, string email)
    {
        if (VerificarAutenticacao())
        {
            cliente.Nome = nome;
            cliente.Email = email;
            Console.WriteLine("Informações do cliente atualizadas.");
        }
    }
}

class Program
{
    static void Main()
    {
        SessaoUsuario.Instancia.AcessarPainel();

        Cliente cliente = new Cliente { Nome = "Sambas", Email = "sambascuking@email.com" };
        SessaoUsuario.Instancia.Autenticar(cliente);

        SessaoUsuario.Instancia.AcessarPainel();

        SessaoUsuario.Instancia.SetInformacaoCliente("Sambomblas", "sambombleu@email.com");

        Cliente atualizado = SessaoUsuario.Instancia.GetCliente();
        Console.WriteLine($"Cliente atual: {atualizado.Nome} - {atualizado.Email}");

        var outraSesh = SessaoUsuario.Instancia;
        Console.WriteLine($"É o mesmo objeto? R: {object.ReferenceEquals(SessaoUsuario.Instancia, outraSesh)}");
    }
}
}
