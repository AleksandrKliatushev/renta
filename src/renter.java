import javax.swing.*;
/*
* Информация о арендаторе
* */
public class renter
{
    int i;
    String [] firstName = new String[1000]; // имя
    String [] secondName= new String[1000];// отчество
    String [] surName= new String[1000];// фамилия
    String [] serialPassport= new String[1000]; // серия паспорта
    String [] numPassport= new String[1000];//номер паспорта
    String [] datePassport= new String[1000];// дата выдачи паспорта
    String [] OUFMS= new String[1000]; // подразделение УФМС, выдавшее паспорт

    void inRenterMan() // вводим информцию через поля
    {
        for (i=1; i<=2; i++)
        {
            firstName [i] = JOptionPane.showInputDialog("Введите имя", firstName[i]);
            secondName [i] = JOptionPane.showInputDialog("Введите отчество", secondName [i]);
            surName [i] = JOptionPane.showInputDialog("Введите фамилию", surName [i]);
            serialPassport[i] = JOptionPane.showInputDialog("Введите серию паспорта", serialPassport[i]);
            numPassport[i] = JOptionPane.showInputDialog("Введите номер паспорта", numPassport[i]);
            datePassport[i] = JOptionPane.showInputDialog("Введите дату выдачи паспорта", datePassport[i]);
            OUFMS[i] = JOptionPane.showInputDialog("Введите наименование подразделения,\n выдвашего паспорт", OUFMS[i]);
        }

    }
    void outInfoRenterMan()// отправляем полученную информацию
    {
        for (i=1; i<=2; i++)
        {
            String str = "Вас зовут: " + firstName[i] + " " + secondName[i] + " " + surName[i] + "\nВаши пасспортные данные: \n" + "Серия: " + serialPassport[i] + " Номер: " + numPassport[i] + "\nКто выдал: " + OUFMS[i] + "\nКогда выдан: " + datePassport[i];
            JOptionPane.showMessageDialog(null, str);
        }

    }


}

