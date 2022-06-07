package Test;

public class Persone {
    private String nome;
    private int età;

    public Persone(String nome, int età) throws ExceptionEtà {
        this.nome=nome;
        this.età=età;
        inseriscietà(età);
    }

    public void inseriscietà(int età) throws ExceptionEtà{
        try{
            if(età<18){
                throw new ExceptionEtà();
            }
        }catch (ExceptionEtà e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Operazione conclusa");
        }
    }
}
