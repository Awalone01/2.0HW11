package pro.sky2.HW11.data;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@Configuration
@SessionScope
public class Cart {

    private final List<Integer> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<Integer> addItems(List<Integer> idItem) {
        items.addAll(idItem);
        return idItem;
    }

    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }
}
