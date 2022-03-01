package pro.sky2.HW11.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky2.HW11.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping(path = "addItems")
    public List<Integer> addItems(@RequestParam("idItem") List<Integer> idItem) {
        return cartService.addItems(idItem);
    }

    @GetMapping(path = "getItems")
    public List<Integer> getItems() {
        return cartService.getItems();
    }
}
