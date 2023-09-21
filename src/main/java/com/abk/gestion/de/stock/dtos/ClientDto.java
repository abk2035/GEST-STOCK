package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.Adresse;
import com.abk.gestion.de.stock.entities.Client;
import com.abk.gestion.de.stock.entities.CommandeClient;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class ClientDto {
    private Long id ;

    private String nom ;

    private String prenom ;

    private String photo;

    private String email ;

    private  Long numTel ;

    private AdresseDto adresseDto ;

    @JsonIgnore
    List<CommandeClient> commandeClients ;

    public ClientDto fromClient(Client client){
        return ClientDto.builder()
                .id(client.getId())
                .email(client.getEmail())
                .photo(client.getPhoto())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .numTel(client.getNumTel())
                .build();
    }
    public Client fromClientDto(ClientDto clientDto){
        Client client = new Client() ;
        BeanUtils.copyProperties(clientDto,client);
        return  client;
    }
}
