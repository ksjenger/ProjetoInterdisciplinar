
        int resposta = JOptionPane.showConfirmDialog(this, "Cadastrar novo Produto?", "Cadastro", WIDTH);
        if (resposta == 0) {
           String nome = txtNome.getText();
           Double preco = Double.parseDouble(txtPrecoFormatado.getText());
           String tipo = null;
           if(jComboBoxTipo.getSelectedIndex() == 0){
               JOptionPane.showMessageDialog(this, "Selecione a categoria do Produto!");
           }else if(jComboBoxTipo.getSelectedIndex() == 1){
               tipo = " Remedio";
           }else if(jComboBoxTipo.getSelectedIndex() == 2){
               tipo = "Perfumaria";
           }else if(jComboBoxTipo.getSelectedIndex() == 3){
               tipo = "Infantil";
           }
           
           Boolean status = null;
           
           if(btnAtivo.isSelected()){
               status = true;
           }else{
               status = false;
           }
           
           if(tipo.equals("Remedio")){
              
           }
           
           
        }
        
        int novo = JOptionPane.showConfirmDialog(this, "Cadastro Concluido!! Deseja cadastrar um novo Funcionario?", "Cadastro de Clientes", WIDTH);
        if (novo == 0) {
            txtNome.setText("");

            txtBairro.setText("");
            txtCep.setText("");
            txtComplemento.setText("");
            txtEmail.setText("");

            txtNumero.setText("");
    
            txtTelefone.setText("");
            txtUf.setText("");
            jComboBoxCargo.setSelectedIndex(0);
        } else if (novo == 1) {
            dispose();

        }