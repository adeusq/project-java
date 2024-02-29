
public class Fila {
    int vetor_elementos[];
    int numero_elementos;

    public Fila(int t){
        vetor_elementos = new int [t];
        numero_elementos = 0;
    }

    public boolean filaVazia(){
        if(numero_elementos == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean filaCheia(){
        if(numero_elementos >= vetor_elementos.length){
            return true;
        }else{
            return false;
        }
    }

    public void enfileirar(int e){
        if(filaCheia()){
            System.out.println("Lista está cheia");
        }else{
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int desenfileirar(){
        if(filaVazia()){
            System.out.println("Lista está vazia");
            return -1;
        }else{
            int elemento_removido = vetor_elementos[0];
            for (int indice = 1; indice <= numero_elementos-1 ; indice++) {
                vetor_elementos[indice - 1] = vetor_elementos[indice];
            }
            numero_elementos = numero_elementos - 1;
            return elemento_removido;
        }
    }

    public int getQuantidade(){
        return numero_elementos;
    }


    public int retornarElemento(){
        return vetor_elementos[0];
    }
   
    public Fila() {

    }
}

