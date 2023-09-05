import javax.swing.JOptionPane;
//pacote padrão: java.lang: importador automatico    
    public class SomaDoisNumeros{
        public static void main(String [] args){
            //declaração de variável

            double primeiroOperando;
            double segundoOperando; 
            double resultado; 

            //entrada
            primeiroOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

            segundoOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));

            //processamento 
            
            resultado = primeiroOperando + segundoOperando;

            //saída
            JOptionPane.showMessageDialog(null, resultado);
        } 
    } 