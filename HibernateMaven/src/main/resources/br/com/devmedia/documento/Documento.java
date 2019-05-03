package br.com.devmedia.documento;

 import javax.persistence.*;
 // DEFINE QUE A CLASSE É UMA ENTIDADE A SER MAPEADA PELA JPA
 @Entity
 // DEFINE O NOME DA TABELA A QUAL ESSA ENTIDADE ESTARÁ RELACIONADA NO BANCO DE DADOS
 @Table(name = "documento")
 public class Documento {
        
	 // A PROPRIEDADE CODIGO REPRESENTE O IDENTIFICADOR UNICO NA TABELA DO BANCO DE DADOS
     @Id
     // INFORMANDO QUE OS DADOS DESSA CHAVE SERÃO CRIADOS PELO BANCO DE DADOS
     @GeneratedValue
     private Long id;
       
     // INFORMADO O NOME DA COLUNA NO BANCO DE DADOS QUE SERÁ MAPEADA AO ATRIBUTO
     @Column(name=”tipo_documento”)
     private String tipoDocumento;        

     public Long getId() {
         return id;
     }
     public void setId(Long id) {
         this.id = id;
     }

      public String getTipoDocumento(){
         return tipoDocumento;
      }

      public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
      }
 }