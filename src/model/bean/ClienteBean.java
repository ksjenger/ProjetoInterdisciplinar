
package model.bean;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.CadastroCliente;


public class ClienteBean {
    
    public static JTextField validaCamposCadastro(CadastroCliente cc){
        if(cc.getTxtNome().getText() == null){
            return cc.getTxtNome();            
        }else{
            return cc.getTxtLogradouro();
        }
    }
    
}
