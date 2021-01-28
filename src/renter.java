import javax.swing.*;
public class renter
{
    String firstName;
    String secondName;
    String surName;
    void infoRenterMan()
    {
        firstName=JOptionPane.showInputDialog("Имя",firstName);
        secondName=JOptionPane.showInputDialog("Отчество",secondName);
        surName=JOptionPane.showInputDialog("Фамилия",surName);
    }
    void printInfoRenterMan()
    {
        JOptionPane.showMessageDialog(null,"Вас зовут: "+ firstName+" "+secondName+" "+surName);
    }

}

