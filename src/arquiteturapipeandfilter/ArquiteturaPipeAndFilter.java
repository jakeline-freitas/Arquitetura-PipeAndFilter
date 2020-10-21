
package arquiteturapipeandfilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ArquiteturaPipeAndFilter {

    
    public static void main(String[] args) throws IOException {
        
        File arquivo = NovoArquivo();
       
        PreencheArquivo(arquivo);
     
        LerArquivoMaiusculo(arquivo);
       
    }
    public static File NovoArquivo() throws IOException{
        String nome = JOptionPane.showInputDialog("Adiciono o nome do Arquivo");
        File novoArquivo = new File(nome); 
        return novoArquivo;
    }
    public static void PreencheArquivo(File arq) throws FileNotFoundException, IOException{
        FileWriter escreveArquivo = new FileWriter(arq, true);// escrever diretamente no arquivo
        try (PrintWriter formatado = new PrintWriter(escreveArquivo)) {
            String conteudo = JOptionPane.showInputDialog(null, "Adicione contéudo ao Arquivo");
            formatado.println(conteudo);
        }
    }
    public static void LerArquivoMaiusculo(File arquivo) throws IOException{
        //FileWriter gravar = new FileWriter(arquivo);
        FileReader lerArquivo = new FileReader( arquivo); //recebe como argumento o objeto File do arquivo a ser lido
        BufferedReader br = new BufferedReader(lerArquivo); // fornece o método readLine() para leitura do arquivo
          
        //String aux2;
        while( br.ready() ){//equanto houver mais linhas
            //lê a proxima linha
            String linha = br.readLine();
            System.out.println(linha.toUpperCase());
        }
    }
}
