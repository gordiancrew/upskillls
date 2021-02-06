package com.company.classes.aggregation_and_composition.Task5;

public class Main {
    //5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
    // типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
    // Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
    public static void main(String[] args) {
        Voucher v1=new Voucher(Transport.TRAIN, Food.ALL_INCLUSIVE,20,"Ukraine",TypeVoucher.SEA);
        Voucher v2 = new Voucher(Transport.AIR, Food.BREAKFAST, 25, "Armenia", TypeVoucher.EXCURSE);
        Voucher v3= new Voucher(Transport.AIR,Food.BREAKFAST,100,"Armenia",TypeVoucher.EXCURSE);
        VouchersList vl1=new VouchersList();
        vl1.setVoucher(v1);
        vl1.setVoucher(v2);
        vl1.setVoucher(v3);
        vl1.searchVoucher(Transport.AIR,Food.BREAKFAST, "Armenia", TypeVoucher.EXCURSE,10);

    }
}
