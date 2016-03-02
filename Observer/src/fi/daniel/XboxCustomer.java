package fi.daniel;

public class XboxCustomer implements Customer {

    @Override
    public void notifySale(Sale sale) {
        if (sale == Sale.MAHJONG_SALE) {
            System.out.println(getClass().getSimpleName() + ", Hmmh... mahjong sale?");
        } else if (sale == Sale.PLAYSTATION_SALE){
            System.out.println(getClass().getSimpleName() + ", np. Shania Twain - That Don't Impress Me Much");
        } else if (sale == Sale.XBOX_SALE){
            System.out.println(getClass().getSimpleName() + ", Here I am rockin......");
        }
    }
}
