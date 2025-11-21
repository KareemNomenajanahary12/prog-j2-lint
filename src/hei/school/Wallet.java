package hei.school;


public class Wallet {

     String color;
     int size;
     int amount;
     boolean opened;
     boolean lost;

    public Wallet(String color, int size) {
        this.color = color;
        this.size = size;
        this.amount = 0;
        this.opened = false;
        this.lost = false;
    }

    public String open() {
        this.opened = true;
        return "Wallet opened";
    }

    public String close() {
        this.opened = false;
        return "Wallet closed";
    }

    public String addVola(int amount) {
        if (!this.opened) {
            return "Cannot add money: wallet is closed!";
        }
        this.amount += amount;
        return amount + " added";
    }

    public int getVola() {
        return this.amount;
    }

    public boolean isLost() {
        return this.lost;
    }

    public String checkVola() {
        return "Money in wallet: " + this.amount;
    }
}

