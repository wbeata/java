
import java.util.Random;
import javax.swing.JOptionPane;


public class participante  {
    public String pergunta,resposta,totalPotos="0";
    public int pontos=0,quantidadePulo=0,numeroPerguntas=0;
            ;
    public boolean ajuda=true;
    Random gera=new Random();
    
 
    
    public String geraPergunta(){
 int numeroPergunta=gera.nextInt(10);
    if(numeroPergunta==1){
        //JOptionPane.showMessageDialog(null,"Resposta correta + 1 ponto");
        resposta="pelo ar, contato fisico e contato de superfícies";
    return pergunta=" Como é a transmissão?";
    
  }// fim da pergunta 1
    
    if(numeroPergunta==2){
    resposta="nariz escorrendo, dor de garganta, tosse e dificuldade para respirar";
    return pergunta="Quais são os sintomas da doença ?";
    }//fim da pergunta 2
    
    if(numeroPergunta==3){
    resposta="higienizar as mãos";
    return pergunta="Como prevenir o coronavírus ?";
    }//fim da perguta 3
    
    if(numeroPergunta==4){
    resposta="o tratamento indicado é repouso e consumo de bastante água";
    return pergunta= "Como é feito o tratamento?";
    }//fim da perguta 4
    
    if(numeroPergunta==5){
    resposta="álcool em gel, agua e sabão";
    return pergunta="Que produtos de limpeza matam o coronavírus?";
    
    }//fim da pergunta 5
    
    if(numeroPergunta==6){
    resposta="não";
    return pergunta="Há vacina contra o coronavírus?";
    
    }// fim da pergunta 6
    
    if(numeroPergunta==7){
    resposta="não";
    return pergunta="O coronavírus tem cura?";
    
    }//fim da pergunta 7
    
    if(numeroPergunta==8){
    resposta="ate 3 dias em contato com platico ou aço";
    return pergunta=" Quanto tempo o novo coronavírus sobrevive em uma superfície ou no ar?";
    }//fim da pergunta8
   
    if(numeroPergunta==9){
    resposta="consumo de carne de um mamífero";
    return pergunta="Qual é a origem do novo coronavírus?";
    }//fim da pergunta 9
    
    
    resposta="álcool gel 70%";
    return pergunta=" Coronavírus: qual o tipo de álcool recomendado para higienizar as mãos?";
    
    
    
    }
}
