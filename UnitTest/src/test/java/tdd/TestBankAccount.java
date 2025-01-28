package tdd;
//TDD:test driven development:kodlardan önce testi yazma yaklaşımıdır
//öncelikle testler yazılır ve ilk etapta testler başarısız olur, daha sonra
//testten geçecek şekilde minimum kod yazılır
//birimin işlevleri için tüm senaryolara göre testler önceden yazıldığı için
//kodun daha doğru, güvenilir yani sağlam olmasını sağlar
//1-henüz kodlar yok
//2-test senaryoları:
/*
i-Para Yatırma İşlemi:
Pozitif miktar yatırıldığında bakiye artmalı.
Negatif miktar yatırıldığında para yatırma başarısız olmalı,hata fırlatmalı.

ii-Para Çekme İşlemi:
Bakiye yeterli olduğunda para çekme işlemi başarılı olmalı,bakiye azalmalı
Bakiye yetersiz olduğunda para çekme işlemi başarısız olmalı, bakiye aynı kalmalı
Günlük çekim limiti aşıldığında para çekme işlemi başarısız olmalı,bakiye aynı kalmalı
Negatif miktar girildiğinde para çekme işlemi başarısız olmalı,hata fırlatmalı.

iii-Hesap Geçmişi:
Para çekme ve yatırma işlemleri hesap geçmişine eklenmeli.
 */


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {

    BankAccount account;//null

    @BeforeEach
    void setAccount(){
        account=new BankAccount("12345",100.0,1000.0);
    }

    @AfterEach
    void setAccountToNull(){
        account=null;
    }

    //hesap oluşturma
    @Test
    void testCreationAccount(){
        assertNotNull(account);
        assertEquals("12345",account.getAccountNumber());
        assertEquals(100.0,account.getBalance());
        assertEquals(1000.0,account.getDailyWithdrawLimit());
        assertEquals(0,account.getDailyWithdrawnAmount());
        assertEquals(0,account.getHistory().size());
    }

    //para yatırma testleri
    //Pozitif miktar yatırıldığında bakiye artmalı.
    @Test
    void testDepositWithPositiveAmount(){
        int size=account.getHistory().size();
        double balance=account.getBalance();

        account.deposit(200.0);//balance+200.0

        assertEquals(balance+200.0,account.getBalance());
        assertEquals(size+1,account.getHistory().size());
    }


    //Negatif miktar yatırıldığında para yatırma başarısız olmalı,hata fırlatmalı.
    @Test
    void testDepositWithNegativeAmount(){
        int size=account.getHistory().size();
        double balance= account.getBalance();

        assertThrows(RuntimeException.class,()->{
            account.deposit(-100.0);
        });
        assertThrows(RuntimeException.class,()->{
            account.deposit(0);
        });
        assertEquals(balance,account.getBalance());
        assertEquals(size,account.getHistory().size());
    }

//    ii-Para Çekme İşlemi:
//    Bakiye yeterli olduğunda para çekme işlemi başarılı olmalı,bakiye azalmalı
//    Bakiye yetersiz olduğunda para çekme işlemi başarısız olmalı, bakiye aynı kalmalı
//    Günlük çekim limiti aşıldığında para çekme işlemi başarısız olmalı,bakiye aynı kalmalı
//    Negatif miktar girildiğinde para çekme işlemi başarısız olmalı,hata fırlatmalı.





}
