GT ODEV 1 
=========

**Product**     : id, name, price  
**Phone**       : id, name, price, phoneNumber  
**SmartPhone**  : id, name, price, phoneNumber, storage, ram, camera  
-----------
1. Yukarıda belirtilen classları tanımlayın. (inheritance)
2. SmartPhone için hem no args constructor hem de all args constructor yazın.
3. Bir tane PhoneApp adında bir class oluşturun ve burada 5 tane alt alta SmartPhone
tanımlayın. Bunları bir array in içine alın.
4. Bu class içinde bir metot tanımlayın.
Double calculateTotalPrice(SmartPhone[] smartPhoneArray)
5. Main metot içinde bu tanımlanan telefonların toplam fiyatını console a yazdırın.

   
Changing and calculation of qualifications and values from heritage classes by using Java
=====
With this project, I created a Phone class, which is a subclass of the class named Product,
and a SmartPhone class, which is Phone's subclass. In the project; price, id and name are 
common attributes in each class; phoneNumber is an attribute of SmartPhone and Phone; storage, 
ram and camera are attributes which defined for the SmartPhone class only. I defined 5 different 
smartphone with different attributes and printed the value of total price as output in the
Main class using the method I created for calculating total price.
