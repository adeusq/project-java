public class ListaEstatica {
    private int[] vetor_elementos;
    private int numero_elementos;

    public ListaEstatica(int t) {
        vetor_elementos = new int[t];
        numero_elementos = 0;
    }

    public void adicionarFinal(int valor) {
        if (lista_Cheia()) {
            System.out.println("Lista cheia!");
        }else{
            vetor_elementos[numero_elementos] = valor;
            numero_elementos++;
        }

    }

    public void adicionarPosicao(int valor, int pos) {
        if (lista_Cheia()) {
            System.out.println("Erro: Lista está cheia!");
        } else {
            if (pos <= 0) {
                adicionarInicio(valor);

            } else if (pos >= numero_elementos) {
                adicionarFinal(valor);

            } else {
                for (int indice = numero_elementos; indice > pos; indice--) {
                    vetor_elementos[indice] = vetor_elementos[indice-1];
                }
                    vetor_elementos[pos] = valor;
                    numero_elementos = numero_elementos + 1;
                }
            }
        }
    

    public void adicionarInicio(int valor) {
        if(lista_Cheia()) {
            System.out.println("Erro: Lista está cheia!");
        } else {
            for (int indice = numero_elementos; indice > 0; indice--) {
                vetor_elementos[indice] = vetor_elementos[indice-1];
            }
            
            vetor_elementos[0] = valor;
                numero_elementos++;
            }
        }

    public int removerFinal() {
        int elementoRemovido = -1;
        if(lista_Vazia()){
            System.out.println("Lista vazia");
        }else{
            int indice = numero_elementos - 1;
            elementoRemovido = vetor_elementos[indice];
            numero_elementos = indice;
        }
        return elementoRemovido;
    }

    public int removerPosicao(int pos) {
        if (lista_Vazia()) {
            System.out.println"Erro: Estrutura vazia!");
        } else if (pos <= 0) {
            return removerInicio();
        } else if (pos >= numero_elementos) {
            return removerFinal();
        } else {
            int elemento_removido;
            elemento_removido = vetor_elementos[pos];
            for (int indice = pos; indice < numero_elementos - 1; indice++) {
                vetor_elementos[indice] = vetor_elementos[indice + 1];
            }
            numero_elementos = numero_elementos - 1;
            return elemento_removido;
        }
    }    

    public int removerInicio() {
        if(lista_Vazia()) {
            System.out.println("Erro: Lista está vazia!");
        } else {
            int elementoRemovido;
            elementoRemovido = vetor_elementos[0];
            for(int indice = 1; indice <= numero_elementos; indice++) {
                vetor_elementos[indice - 1] = vetor_elementos[indice];
            }
            numero_elementos = numero_elementos - 1;
            return elementoRemovido;
            }
        }

        public int buscarPorValor(int valor) {
            for (int indice = 0; indice < numero_elementos; indice++) {
                if (vetor_elementos[indice] == valor) {
                    return indice;
                }
            }
            return -1;
        }
        
    public boolean lista_Vazia() {
        if (numero_elementos == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean lista_Cheia(){
        if (numero_elementos == vetor_elementos.length) {
            return true;
        }else{
            return false;
        }
    }

    public int getNumero_elementos() {
        return numero_elementos;
    }

    public void exibir() {
        for (int i = 0; i < numero_elementos; i++) {
            System.out.print(vetor_elementos[i] + " ");
        }

        System.out.println("");
    }

    /// Questao 1.
    //1) Fazer um metodo detro da classe ListaEstatica para retornar o elemento do meio da lista (suponha que existe meio - tamanho impar);

    public int retornarElementoMeio() {

    }
    //Questao 2
    //2) Fazer um metodo para trocar o primeiro com iltimo elemento da lista (ultimos serao os primeiros);
    public void trocarPrimeiroUltimo() {

    }

    //Questao 3
    // 3) Implementar o metodo get(int pos) -> retorna o elemento da lista da posicao pos;
    public int retornarElemento(int pos) {

    }
    //Questao 4
    //4) Implementar um metodo na classe ListaEstatica para invertar a lista. Exemplo {13, 17, 45, 50, 25} ===> {25,50,45,17,13};

    public void inverterLista() {


    }

    //TODO: Verificar se tem elementos repetidos na lista
    public boolean temRepetidos() {

    }

    //TODO: Verificar se a lista esta ordenada
    public boolean estaOrdenada() {

    }

    public void eliminarRepetidos() {

    }

}