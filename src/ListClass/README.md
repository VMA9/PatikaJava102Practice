* Writing Our Own List Class
*
* Class Features;
*
* 1 - The default size of the array in the class is 10 and the number of elements of the array increases by 2 times as needed.
* 2 - There must be two types of constructors belonging to the class.
* 3 -
  If the MyList empty constructor is used, the initial size of the array must be 10.
* 4 - The initial value of MyList(int capacity) must be taken from the capacity parameter.
* 5 - size() returns the number of elements in the array.
* 6 - getCapacity() returns the capacity of the array.
* 7 - add(T data) should be used to add an element to the array of the class.
  If there is not enough space in the array, the array size should be doubled.
*
* 8 - get(int index) returns the value at the given index. Returns null if invalid index is entered.
* 9 - remove(int index) deletes the value in the given index and shifts the values to the left. Returns null if invalid index is entered.
* 10 - set(int index,
  T data) replaces the value in the given index with the data sent. Returns null if invalid index is entered.
* 11 - String toString() Method that lists the elements in the array of the class.
*
* 12 - int indexOf(T data) : Returns the index of the object given in the parameter in the list. Returns -1 if the object is not in the list.
* 13 -
  int lastIndexOf(T data) : Returns the last index of the object given in the parameter in the list. Returns -1 if the object is not in the list.
* 14 - boolean isEmpty() : Returns true or false if the list is empty.
* 15 - T[] toArray(): Arrays and returns the items in the list in the same order.
  An array containing only elements.
* 16 - clear() : Deletes all items in the list, making it an empty list.
* 17 - MyList<T> sublist(int start, int finish) : A list of the index range given in the parameter is returned.
* 18 - boolean contains(T data) : It tells whether the value given in the parameter is in the list.
* Bu sınıfın amacı dinamik bir Dizi tutması ve veri tipini dinamik olarak almasıdır. Dolayısıyla bu sınıf generic bir dizi sınıfıdır.

---
* // Türkçe
* Sınıf Özellikleri;
*
* 1 - Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmaktadır.
* 2 - Sınıfa ait iki tür constructor bulunmalıdır.
* 3 - MyList boş constructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.
* 4 - MyList(int capacity) dizinin başlangıç değeri capacity parametresinden alınmalıdır.
* 5 - size() dizideki eleman sayısını verir.
* 6 - getCapacity() dizinin kapasite değerini verir.
* 7 - add(T data) sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yoksa dizi boyutu iki katına çıkarılmalıdır.
*
* 8 - get(int index) verilen indisteki değeri döndürür. Geçersiz indis girilirse null döndürür.
* 9 - remove(int index) verilen indisteki değeri silip, değerleri sola doğru kaydırır. Geçersiz indis girilirse null döndürür.
* 10 - set(int index, T data) verilen indisteki değeri gönderilen veri ile değiştirir. Geçersiz indis girilirse null döndürür.
* 11 - String toString() Sınıfa ait dizideki elemanları listeleyen metod.
*
* 12 - int indexOf(T data) : Parametrede verilen nesnenin listedeki indexini verir. Nesne listede yoksa -1 değerini verir.
* 13 - int lastIndexOf(T data) : Parametrede verilen nesnenin listedeki son indexini verir. Nesne listede yoksa -1 değerini verir.
* 14 - boolean isEmpty() : Listenin boş olup olmadığını true ya da false değeri döndürerek bildirir.
* 15 - T[] toArray(): Listedeki öğeleri aynı sırayla bir dizi haline getirip geriye döndürür. Yalnızca elemanları içeren bir dizi.
* 16 - clear() : Listedeki bütün öğeleri siler, boş bir liste haline getirir.
* 17 - MyList<T> sublist(int start, int finish) : Parametrede verilen index aralığına ait bir liste döner.
* 18 - boolean contains(T data) : Parametrede verilen değerin listede olup olmadığını söyler.