public class Turno {
    private String codigo;
    private boolean atendido;

    public Turno(String codigo) {
        this.codigo = codigo;
        this.atendido = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void atender() {
        this.atendido = true;

    }
}
