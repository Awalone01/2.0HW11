package pro.sky2.HW11.service;

import java.util.List;

public interface CartService {

    List<Integer> addItems (List<Integer> item);

    List<Integer> getItems ();
}
