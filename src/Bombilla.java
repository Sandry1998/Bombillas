public class Bombilla {

    static public boolean interruptorGeneral=true;
    private boolean interruptor;

    //constructor vacío, para crear el objeto bombilla en estado apagado
    public Bombilla() {
        this.interruptor=false;
    }

    //Método que enciende o apaga segun como este el interruptor
    public void encenderOapagar(){
        if(this.interruptor){
            this.interruptor=false;
        }else{
            this.interruptor=true;
        }
    }
    //Método para cambiar estado
    public boolean estado() {
        return interruptorGeneral && this.interruptor;
    }

    //Método para mostrar estado

    public String mostrarEstado() {
        return estado()?" Encendido " : " Apagado ";
    }
}
