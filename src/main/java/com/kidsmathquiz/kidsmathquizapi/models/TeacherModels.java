package com.kidsmathquiz.kidsmathquizapi.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
//A serialização é o processo de converter um objeto
// em uma sequência de bytes para que possa ser armazenado
// em um arquivo, transmitido pela rede ou mantido na memória de forma persistente

//Se relacionar com o Banco de Dados
@Entity
@Table(name = "Quiz_Kids")

public class TeacherModels implements Serializable {
}
