# Mantıksal Operatörler
Java'da Mantıksal Operatörler, değişkenler veya değerler arasındaki mantığı belirlemek için kullanılır. Türkçe'de ki bağlaç ekleri gibi düşünebilirsiniz.

Bir kontrol işlemi sonucunda geriye true yada false değeri döndüren operatörlerdir. True / False döndüren ifadeler veya boolean tipinde değerler tutan değişkenler üzerinde kullanılabilirler. Konuyu anlayabilmek için ilk önce mantıksal operatörlerin neler olduğu öğrenilmelidir.

# Java'da Mantıksal Operatörler
* && VE (AND)

Her iki ifade de doğruysa True döndürür.

    Örnek;
    
    x'i 5 olarak ele alırsak;
    
    x<10 && x<25
    
    Burada sonuç True olacaktır.

* || Veya (OR)

İfadelerden biri doğruysa True döndürür.

    Örnek;
    
    x'i 5 olarak ele alırsak;
    
    x<10 || x<3
    
    Burada sonuç True olacaktır.

* ! Ters İşlem

Sonucu tersine çevirir.

    Örnek;
    
    x'i 5 olarak ele alalım.
    
    x<10 ifadesi True dönecektir.
    Ancak !(x<5) olarak yazarsak sonuç False olacaktır.

# ? Soru İşareti Operatörü
? işareti operatörü ile Java'da mantıksal kıyaslama yapılabilir. ? ifadesi Java'daki "if-else" yapısı yerine kullanılabilir. Tek satırda bunu yapabilmemizi sağlar. Kullanımı ise if'in içerisinde yer alacak ifadeyi soru işaretinden önce yazılır, ifadenin doğru olması durumunda yapılacak işlemler soru işareti ile iki nokta arasına yazılır. İfadenin yanlış olması durumunda yapılacaklar ise iki noktadan sonra yazılır.

    Kullanımı :
    
    ( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar

Örnek;

    public class Test {
    
        public static void main(String args[]) {
            int a, b;
            a = 10;
            b = (a == 1) ? 20: 30;
            System.out.println( "Value of b is : " +  b );

            b = (a == 10) ? 20: 30;
            System.out.println( "Value of b is : " + b );
        }
    }

Sonuç;

    Value of b is : 30
    
    Value of b is : 20


Açıklama;

b = (a == 1) ? 20: 30; => ifadesini incelenirse, (a == 1) ? 20: 30 ifadesinden başlamak daha doğru olacaktır. a'nın 1 olması durumunda 20 değeri, a'nın 1'den farklı olması durumunda 30 değeri dönecektir. b'nin değeri buradan dönen değere göre belirlenecektir. Kodda a değeri 10 olarak verildiği için b'nin değeri 30 olarak atanmaktadır.

b = (a == 10) ? 20: 30; => ifadesi incelenirse, yine yukarıdaki açıklamaya benzer olarak a değerinin 10 olması durumunda 20, a değeri 10'dan farklı olması durumunda ise 30 değeri geriye dönecektir. Bu durumda a değeri kodda 10 olduğu için b değeri de 20 olarak atanacaktır.