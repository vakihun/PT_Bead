package org.vakarcs.tamas;

import org.vakarcs.tamas.Adapter.HttpAdapterImpl;
import org.vakarcs.tamas.Model.Order.OrderListProvider;
import org.vakarcs.tamas.Model.Order.OrderListProviderImpl;
import org.vakarcs.tamas.Controller.CustomerController;
import org.vakarcs.tamas.Controller.OrderController;
import org.vakarcs.tamas.Controller.ProductionController;
import org.vakarcs.tamas.Controller.SupplierController;
import org.vakarcs.tamas.Model.Order.Order;
import org.vakarcs.tamas.Model.Order.OrderElement;
import org.vakarcs.tamas.Model.Product.RawMaterial;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 Raktár manager program tervezése amelynek a következő funkcionalitások és alrendszerek megtervezett intefészeit, és "csontvázát" kell tartalmaznia:
 -Több inhomogén raktárrendszerrel való kommunikáció, és közös menedzsment felület biztosítása.
 -Áru menedzsment
 -Rendelés menedzsment
 -Beszállítók és Vásárlók menedzsmentje.

 A rendszerben használt megoldásokról, és azoknak magyarázatárol minimum 3 oldalas dizájn dokumentum is szükséges az Elégséges (2) jegy eléréséhez.
 A jegyek a program elkészítésekor alkalmazott design patternek mennyisége, ésszerűsége, a leadott kódbázis minésőge, valamint a dizájn dokumentumban leírtak,
 és a hallgató szóbeli elbeszélgetés során nyújtott beszámolójának összeségéből áll össze.
 A leadott kód igényességének illeszkednie kell a tárgyban elhangzott követelményeknek!
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Customer customer = new Customer("Máté Gábor");
        OrderListProvider orderListProvider = new OrderListProviderImpl(new HttpAdapterImpl());
        List<OrderElement> orderList = orderListProvider.getOrderList(customer);

        OrderController orderController = new OrderController(customer, new Date(new Date().getTime()+(1000*60*60*24)),orderList);
        Order order = orderController.MakeOrder();

        RawMaterial rawMaterial = new RawMaterial("fém", new Supplier());
        SupplierController supplierController = new SupplierController(rawMaterial,1000);
        supplierController.Supply();

        ProductionController productionController = new ProductionController(order.getOrderList());
        productionController.Start();

        CustomerController customerController = new CustomerController(order);
        customerController.Buy();
    }
}
