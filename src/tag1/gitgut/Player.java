
package tag1.gitgut;

public class Player {
        
    private String name;
    private int hp;
    private int bank;

    public Player() {
    }

    @Override
    public String toString() {
        return "Player " + name + "\n" + hp + "HP\n" + bank + " Space dollars";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank += bank;
    } 
}
