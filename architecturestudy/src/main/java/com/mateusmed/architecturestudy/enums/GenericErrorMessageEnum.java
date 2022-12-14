package com.mateusmed.architecturestudy.enums;

public enum GenericErrorMessageEnum {

    ERRO_EFETUAR_CHAMADA_HTTP_SERVICO_X("COD_ERROR_SERVICO_X", "Erro ao efetuar chamada HTTP:");

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
