public class GameSimple {
    public static void main(String[] args) {
        Weapon w = new Weapon();
        w.name = "泣血之刃";
        w.attack = 500;
        w.attackSpeed = 10;

        Hero h = new Hero();
        h.name = "亚瑟";
        h.attack = 1000;
        h.attackSpeed = 5;
        h.red = 5000;
        h.blue = 0;
        h.moveSpeed = 10;

        h.setWeapon(w);
        h.normalAttack();
    }
}
