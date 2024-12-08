package pl.coderslab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
import java.util.stream.Collectors;

@Controller
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @GetMapping("/cart")
    @ResponseBody
    public String cart() {
        return cart.getCartItems().stream()
                .map(ci -> String.join(" : ",
                        ci.getProduct().getName(), String.valueOf(ci.getProduct().getPrice()),
                        ci.getQuantity().toString()))
                .collect(Collectors.joining(", "));
    }

}
