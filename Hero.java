public class Hero {
    String name;
    double red;
    double blue;
    double attack;
    double attackSpeed;
    double moveSpeed;
    Weapon w;

    public void normalAttack(){
        System.out.println("攻击伤害：" + attack * attackSpeed);
    }

    public void setWeapon(Weapon weapon){
        w = weapon;
        attack += w.attack;
        attackSpeed += w.attackSpeed;
    }
}