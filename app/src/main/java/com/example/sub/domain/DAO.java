package com.example.sub.domain;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    private static List<Pessoas> dados =new ArrayList<>();
    private DAO(){}

    public static void SalvarDados(Pessoas pessoas){
        dados.add(pessoas);
    }
    public static List getListaDados(){
        return dados;
    }

}
