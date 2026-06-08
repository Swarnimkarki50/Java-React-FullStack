package com.ecommerce.sportscenter.config;

import com.ecommerce.sportscenter.entity.Brand;
import com.ecommerce.sportscenter.entity.Product;
import com.ecommerce.sportscenter.entity.Type;
import com.ecommerce.sportscenter.repository.BrandRepository;
import com.ecommerce.sportscenter.repository.ProductRepository;
import com.ecommerce.sportscenter.repository.TypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final BrandRepository brandRepository;
    private final TypeRepository typeRepository;
    private final ProductRepository productRepository;

    public DataSeeder(BrandRepository brandRepository, TypeRepository typeRepository, ProductRepository productRepository) {
        this.brandRepository = brandRepository;
        this.typeRepository = typeRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        if (brandRepository.count() > 0) return;

        Brand adidas = brandRepository.save(createBrand("Adidas"));
        Brand asics = brandRepository.save(createBrand("ASICS"));
        Brand victor = brandRepository.save(createBrand("Victor"));
        Brand yonex = brandRepository.save(createBrand("Yonex"));
        Brand puma = brandRepository.save(createBrand("Puma"));
        Brand nike = brandRepository.save(createBrand("Nike"));
        Brand babolat = brandRepository.save(createBrand("Babolat"));

        Type shoes = typeRepository.save(createType("Shoes"));
        Type rackets = typeRepository.save(createType("Rackets"));
        Type football = typeRepository.save(createType("Football"));
        Type kitBags = typeRepository.save(createType("Kit Bags"));

        productRepository.save(createProduct("Adidas Quick Force Indoor Badminton Shoes", "Designed for professional as well as amateur badminton players. These indoor shoes are crafted with synthetic upper that provides natural fit, while the EVA midsole provides lightweight cushioning. The shoes can be used for Badminton and Squash", 3500, "images/products/adidas_shoe-1.png", shoes, adidas));
        productRepository.save(createProduct("Adidas Quick Force Indoor Badminton Shoes", "Designed for professional as well as amateur badminton players. These indoor shoes are crafted with synthetic upper that provides natural fit, while the EVA midsole provides lightweight cushioning. The shoes can be used for Badminton and Squash", 3375, "images/products/adidas_shoe-2.png", shoes, adidas));
        productRepository.save(createProduct("Adidas Quick Force Indoor Badminton Shoes", "Designed for professional as well as amateur badminton players. These indoor shoes are crafted with synthetic upper that provides natural fit, while the EVA midsole provides lightweight cushioning. The shoes can be used for Badminton and Squash", 3375, "images/products/adidas_shoe-3.png", shoes, adidas));
        productRepository.save(createProduct("Asics Gel Rocket 8 Indoor Court Shoes", "The Asics Gel Rocket 8 Indoor Court Shoes (Orange/Silver) will keep you motivated and fired up to perform at your peak in volleyball, squash and other indoor sports.", 4249, "images/products/asics_shoe-1.png", shoes, asics));
        productRepository.save(createProduct("Asics Gel Rocket 8 Indoor Court Shoes", "The Asics Gel Rocket 8 Indoor Court Shoes (Orange/Silver) will keep you motivated and fired up to perform at your peak in volleyball, squash and other indoor sports.", 3499, "images/products/asics_shoe-2.png", shoes, asics));
        productRepository.save(createProduct("Asics Gel Rocket 8 Indoor Court Shoes", "The Asics Gel Rocket 8 Indoor Court Shoes (Orange/Silver) will keep you motivated and fired up to perform at your peak in volleyball, squash and other indoor sports.", 3499, "images/products/asics_shoe-3.png", shoes, asics));
        productRepository.save(createProduct("Victor SHW503 F Badminton Shoes", "PU Leather, Mesh, EVA, ENERGY MAX, Nylon sheet, Rubber", 2392, "images/products/victor_shoe-1.png", shoes, victor));
        productRepository.save(createProduct("Victor SHW503 F Badminton Shoes", "PU Leather, Mesh, EVA, ENERGY MAX, Nylon sheet, Rubber", 3000, "images/products/victor_shoe-2.png", shoes, victor));
        productRepository.save(createProduct("YONEX Super Ace Light Badminton Shoes", "Rule the game with Super Ace Light highlights Maximum shock absorption Quick compression recovery", 2590, "images/products/yonex_shoe-1.png", shoes, yonex));
        productRepository.save(createProduct("YONEX Super Ace Light Badminton Shoes", "Rule the game with Super Ace Light highlights Maximum shock absorption Quick compression recovery", 3500, "images/products/yonex_shoe-2.png", shoes, yonex));
        productRepository.save(createProduct("YONEX Super Ace Light Badminton Shoes", "Rule the game with Super Ace Light highlights Maximum shock absorption Quick compression recovery", 3700, "images/products/yonex_shoe-3.png", shoes, yonex));
        productRepository.save(createProduct("Puma 19 FH Rubber Spike Cricket Shoes", "With features and functions designed to withstand long hours out on the pitch", 4999, "images/products/puma_shoe-1.png", shoes, puma));
        productRepository.save(createProduct("Puma 19 FH Rubber Spike Cricket Shoes", "With features and functions designed to withstand long hours out on the pitch", 5200, "images/products/puma_shoe-2.png", shoes, puma));
        productRepository.save(createProduct("Puma 19 FH Rubber Spike Cricket Shoes", "With features and functions designed to withstand long hours out on the pitch", 5700, "images/products/puma_shoe-3.png", shoes, puma));
        productRepository.save(createProduct("Babolat Shadow Spirit Mens Badminton Shoes", "Babolat Shadow Spirit Mens Badminton Shoes (Cloisonne/Strike)", 4125, "images/products/babolat_shoe-1.png", shoes, babolat));
        productRepository.save(createProduct("Babolat Shadow Tour Mens Badminton Shoes", "Babolat Shadow Tour Mens Badminton Shoes (White/Blue)", 5249, "images/products/babolat_shoe-2.png", shoes, babolat));
        productRepository.save(createProduct("Babolat Shadow Team Womens Badminton Shoes", "Babolat Shadow Team Womens Badminton Shoes (Black/Peony)", 2999, "images/products/babolat_shoe-3.png", shoes, babolat));

        productRepository.save(createProduct("Yonex VCORE Pro 100 A Tennis Racquet", "For offensive players looking to win with game-changing spin and power.", 6099, "images/products/yonex-racket-1.png", rackets, yonex));
        productRepository.save(createProduct("Yonex VCORE Pro 100 A Tennis Racquet", "For offensive players looking to win with game-changing spin and power.", 6399, "images/products/yonex-racket-2.png", rackets, yonex));
        productRepository.save(createProduct("Yonex VCORE Pro 100 2019 Tennis Racquet", "For offensive players looking to win with game-changing spin and power.", 13299, "images/products/yonex-racket-3.png", rackets, yonex));
        productRepository.save(createProduct("Babolat Boost D Tennis Racquet", "Babolat Boost D Tennis Racquet (260gm, Strung)", 6999, "images/products/babolat-racket-1.png", rackets, babolat));
        productRepository.save(createProduct("Babolat Pure Aero 2019 Superlite Tennis Racquet", "Babolat Pure Aero 2019 Superlite Tennis Racquet (Unstrung, 255gm)", 13000, "images/products/babolat-racket-2.png", rackets, babolat));
        productRepository.save(createProduct("Babolat Pure Drive VS Tennis Racquet", "Babolat Pure Drive VS Tennis Racquet (Pair, 300gm, Strung)", 34000, "images/products/babolat-racket-3.png", rackets, babolat));

        productRepository.save(createProduct("Adidas FIFA World Cup 2018 OMB Football", "Featuring an innovative surface panel design, this is the match ball", 2499, "images/products/adidas_football-1.png", football, adidas));
        productRepository.save(createProduct("Adidas FIFA World Cup 2018 OMB Football", "Featuring an innovative surface panel design, this is the match ball", 3200, "images/products/adidas_football-2.png", football, adidas));
        productRepository.save(createProduct("Adidas FIFA World Cup Top Glider Ball", "Featuring an innovative surface panel design, this is the match ball", 2499, "images/products/adidas_football-3.png", football, adidas));
        productRepository.save(createProduct("Nike Pitch Premier League Football", "Nike Pitch Premier League Football (Yellow/Purple)", 1525, "images/products/Nike-Football-1.png", football, nike));
        productRepository.save(createProduct("Nike Manchester City Supporters Football", "Nike Manchester City Supporters Football (Berry)", 1525, "images/products/Nike-Football-2.png", football, nike));
        productRepository.save(createProduct("Nike Mercurial Veer Football", "Nike Mercurial Veer Football (White/Green/Black)", 1450, "images/products/Nike-Football-3.png", football, nike));

        productRepository.save(createProduct("Babolat Team Line Racket 12 Kit Bag", "The Babolat Team Line racquet bag is highly durable", 4550, "images/products/babolat-kitback-1.png", kitBags, babolat));
        productRepository.save(createProduct("Babolat Pure Strike RH X12 Kit Bag", "Babolat Pure Strike 12-Pack Bag", 9799, "images/products/babolat-kitback-2.png", kitBags, babolat));
        productRepository.save(createProduct("Babolat Team Line 12 Racquet Kit Bag", "Babolat Team Line 12 Racquet Kit Bag (Silver)", 4550, "images/products/babolat-kitback-3.png", kitBags, babolat));
        productRepository.save(createProduct("Yonex SUNR 4826TK BT6-SR Badminton Kit Bag", "Yonex SUNR 4826TK BT6-SR Badminton Kit Bag", 1999, "images/products/yonex-kitback-1.png", kitBags, yonex));
        productRepository.save(createProduct("Yonex SUNR LRB05 MS BT6 S Badminton Kit Bag", "Yonex SUNR LRB05 MS BT6 S Badminton Kit Bag", 1499, "images/products/yonex-kitback-2.png", kitBags, yonex));
        productRepository.save(createProduct("Yonex SUNR LRB05 MS BT6 S Badminton Kit Bag", "Yonex SUNR LRB05 MS BT6 S Badminton Kit Bag", 1499, "images/products/yonex-kitback-3.png", kitBags, yonex));
    }

    private Brand createBrand(String name) {
        Brand brand = new Brand();
        brand.setName(name);
        return brand;
    }

    private Type createType(String name) {
        Type type = new Type();
        type.setName(name);
        return type;
    }

    private Product createProduct(String name, String description, long price, String pictureUrl, Type type, Brand brand) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setPictureUrl(pictureUrl);
        product.setType(type);
        product.setBrand(brand);
        return product;
    }
}
