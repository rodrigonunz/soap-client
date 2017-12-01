package com.app;

import com.app.interfaces.Bank;
import com.app.model.Conta;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        final String URL =  "http://127.0.0.1:9876/bank?wsdl";

        URL url = new URL(URL);
        QName qname = new QName("http://services.app.com/", "BankImplService");
        Service ws = Service.create(url, qname);
        Bank bank = ws.getPort(Bank.class);

        Map<String, Object> req_ctx = ((BindingProvider) bank).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, URL);

        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("username", Collections.singletonList("rodrigonunes"));
        headers.put("password", Collections.singletonList("000"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        try {
            Conta rodrigonunes = bank.acessarConta("rodrigonunes", "123");

            System.out.println(bank.recuperarSaldo(rodrigonunes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
