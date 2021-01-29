import javax.swing.*;
/*
* Информация о арендаторе
* */
public class renter
{

     String[] colPersonBase = new String [7];
    void col(){
        colPersonBase[0]= "firstName";
        colPersonBase[1]="secondName";
        colPersonBase[2]="surName";
        colPersonBase[3]="serialPassport";
        colPersonBase[4]="numPassport";
        colPersonBase[5]="datePassport";
        colPersonBase[6]="OUFMS";
    }

    String firstName; // имя
    String secondName;// отчество
    String surName;// фамилия
    String serialPassport; // серия паспорта
    String numPassport;//номер паспорта
    String datePassport;// дата выдачи паспорта
    String OUFMS = "Отделение УФМС России по Костромской области\n в Фабричном округе г. Костромы"; // подразделение УФМС, выдавшее паспорт

    void passport()
    {
        serialPassport = JOptionPane.showInputDialog("Введите серию паспорта",  serialPassport);
        numPassport  = JOptionPane.showInputDialog("Введите номер паспорта",  numPassport);
        datePassport = JOptionPane.showInputDialog("Введите дату выдачи паспорта",  datePassport);
        OUFMS = JOptionPane.showInputDialog("Введите наименование подразделения,\n выдвашего паспорт", OUFMS );
    }
    void inRenterMan() // вводим информцию через поля
    {
        firstName=JOptionPane.showInputDialog("Введите имя", firstName);
        secondName=JOptionPane.showInputDialog("Введите отчество",secondName);
        surName=JOptionPane.showInputDialog("Введите фамилию",surName);
    }
    void outInfoRenterMan()// отправляем полученную информацию
    {
        String str = "Вас зовут: "+ firstName+" "+secondName+" "+surName + "\nВаши пасспортные данные: \n" +"Серия: "+serialPassport+" Номер: "+numPassport+"\nКто выдал: "+OUFMS+"\nКогда выдан: "+datePassport;
        JOptionPane.showMessageDialog(null,str);

    }

}

