package br.matc84.spring.exercicio.domain.ports;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import br.matc84.spring.exercicio.domain.models.InvoiceModel;
import br.matc84.spring.exercicio.api.dtos.InvoiceDTO; 

public interface InvoiceServicePort {
    public List<InvoiceModel> getAll();
    public InvoiceModel findById(String uuid);
    public InvoiceModel create(InvoiceDTO invoiceDTO);
}