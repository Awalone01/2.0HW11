package pro.sky2.HW11.service.impl;

import org.springframework.stereotype.Service;
import pro.sky2.HW11.service.CartService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartService cartService;

    public CartServiceImpl(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public List<Integer> addItems(List<Integer> item) {
        return cartService.addItems(item);
    }

    @Override
    public List<Integer> getItems() {
        return new ArrayList<>();
    }
}
