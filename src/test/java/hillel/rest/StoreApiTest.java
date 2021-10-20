package hillel.rest;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

import java.io.IOException;

public class StoreApiTest {
    @Test
    public void getInventoriesTest() throws IOException {
        new Store().getInventories();
        new Store().placeOrder();
        new Store().deletePurchaseOrder(3);
        new Store().purchaseOrder(3);
    }
}

