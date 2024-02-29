public class Pilha {
    int vetor_elementos[];
    int numero_elementos;

    public Pilha(int t){
        vetor_elementos = new int [t];
        numero_elementos = 0;
    }

    public boolean pilhaVazia(){
        if(numero_elementos == 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean pilhaCheia(){
        if(numero_elementos >= vetor_elementos.length){
            return true;
        }else{
            return false;
        }
    }
   public void empilhar(int e){
        if(pilhaCheia()){
            System.out.println("Lista Cheia");
        }else{
            int indice = numero_elementos;
            vetor_elementos[indice] = e;
            numero_elementos = numero_elementos + 1;
        }
    }

    public int desempilhar(){
        if(pilhaVazia()){
            System.out.println("Lista Vazia");
        }else{
            int indice = numero_elementos - 1;
            int elemento_removido = vetor_elementos[indice];
            numero_elementos = indice;
            return elemento_removido;
        }
    }


    public int getQuantidade(){
        return numero_elementos;
    }
    public int retornarElemento(){
        return vetor_elementos[numero_elementos-1];
    }
