package com.platzy.market.persistance;

import com.platzy.market.domain.Purchase;
import com.platzy.market.domain.repository.PurchaseRepository;
import com.platzy.market.persistance.crud.CompraCrudRepository;
import com.platzy.market.persistance.entity.Compra;
import com.platzy.market.persistance.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComprasRepository implements PurchaseRepository {

    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PurchaseMapper mapper;

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId)
                .map(compras -> mapper.toPurchases(compras));
    }


    @Override
    public Purchase save(Purchase purchase) {
        Compra compra= mapper.toCompra(purchase);
            compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
