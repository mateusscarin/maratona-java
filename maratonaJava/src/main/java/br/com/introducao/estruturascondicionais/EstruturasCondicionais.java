package br.com.introducao.estruturascondicionais;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        
        int idade = 20;
        if(idade >= 18){
            System.out.println("Autorizado a compra bebida alcólica");
        }else{ System.out.println("Não autorizado a comprar bebida alcólica");}
    
        idade = 17;
        if(idade<=15){
            System.out.println("Categoria Infantil");
        }else if ((idade>15)&&(idade<18)){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Categoria Adulta");
        }
        
        //Ternário = (condicao) ? verdadeiro : falso;
        
        double salario = 6000;
        String mensagemDoar = "Doar";
        String mensagemNaoDoar = "Não Doar";
        
        String resultado = salario > 5800 ? mensagemDoar : mensagemNaoDoar;
        
        System.out.println(resultado);
    
    }
    
}
