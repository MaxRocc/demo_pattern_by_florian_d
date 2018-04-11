public class Personnage {
    private TypeCombat combat = new CombatSouris();

    public Personnage(){
    }

    public void attaquer(){
        combat.attaquer();//l'objet qui attaque pour la classe personnage
    }

    public void setCombatType(TypeCombat type){
        this.combat = type;
    }
}
