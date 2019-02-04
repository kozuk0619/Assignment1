package edu.fsu.cs.cen5035;

/**
 * @author Logan
 */
public class FireStaff extends BasicWeapon implements Weapon {

    public FireStaff() {
        super(22);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        //if the armor is above 45 after the first hit then the staff will do a second attack with half hitpoints
        int damage = DAMAGE - armor;
        int yeet = armor - DAMAGE;
        if(yeet < 15){ 
            damage += ((int)(DAMAGE/2));
        }
        if(damage < 0){
            return 0;
        }
        return damage;
    }

}