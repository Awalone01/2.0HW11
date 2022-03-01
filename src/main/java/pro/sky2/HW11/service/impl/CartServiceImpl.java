package pro.sky2.HW11.service.impl;

import org.springframework.stereotype.Service;
import pro.sky2.HW11.data.Cart;
import pro.sky2.HW11.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> idItem) {
        return cart.addItems(idItem);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
