package com.app.interfaces;

import com.app.model.Conta;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.math.BigDecimal;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Bank {
    @WebMethod
    BigDecimal recuperarSaldo(Conta conta) throws Exception;
    @WebMethod
    Conta acessarConta(String username, String password) throws Exception;

}
