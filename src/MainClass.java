public class MainClass {
    public static void Main (String[] args){
        Personnage perso = new Personnage();

        perso.attaquer();//j'attaque avec un clavier et une souris
        ////
        perso.setCombatType(new CombatSouris());
        perso.attaquer();

        perso.setCombatType(new CombatLaser());
        perso.attaquer();
    }
}
