package edu.fsu.cs.cen5035;

/**
 * @author Logan
 */
public class CrazyRandomSword extends BasicWeapon implements Weapon {

    public CrazyRandomSword() {
        super((int)(Math.random() * 95 + 4));
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int stat = (int)(armor/3);
        int damage = DAMAGE - ((int)(Math.random() * ((stat-3)) + 3));
        if(damage < 0){
            return 0;
        }
        return damage;
    }

}
