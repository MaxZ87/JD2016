package by.it.daylidovich.JD02_03.Cashier;

import by.it.daylidovich.JD02_03.Buyer.Buyer;
import by.it.daylidovich.JD02_03.Goods.Goods;

import java.util.ArrayList;
import java.util.Formatter;

public class Invoice {
    public static StringBuilder createInvoice(Buyer buyer, int countSpace){
        int sum = 0;
        ArrayList<String> backet = buyer.getBacket();
        String sp = "";
        for (int i = 0; i < countSpace -1; i++) {
            sp+= "                              ";
        }
        StringBuilder invoice = new StringBuilder(sp + "Чек " + buyer.getName() + "\n");
        for (String goods: backet){
            Formatter f = new Formatter();
            invoice.append(sp).append(f.format("%-20s %7d\n", goods, Goods.getGoods().get(goods)));
            sum += Goods.getGoods().get(goods);
        }
        Formatter f = new Formatter();
        invoice.append(sp).append(f.format("Сумма к оплате:      %7d\n", sum));
        return invoice;
    }
}
