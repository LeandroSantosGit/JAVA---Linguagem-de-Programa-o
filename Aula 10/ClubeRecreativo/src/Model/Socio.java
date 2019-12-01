
package Model;

/**
 * Date 30/11/2019
 * @author Leandro
 */
public class Socio {
    private int matricula;
    private String nome;

    public Socio(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
