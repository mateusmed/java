package com.mateusmed.architecturestudy.enuns;

public enum GenericErrorMessageEnum {

    ERRO_EFETUAR_CHAMADA_HTTP("MS0011", "Erro ao efetuar chamada HTTP:");

    private String code;
    private String description;

    GenericErrorMessageEnum(String code, String description){
        this.code = code;
        this.description = description;
    }

    public String getCode(){
        return code;
    }

    public String getDescription(){
        return description;
    }

}
