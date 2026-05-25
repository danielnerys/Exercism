class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    private String type = "Warrior";

    @Override
        boolean isVulnerable(){
            return false;
        }
    @Override
    int getDamagePoints(Fighter fighter){
        if(!fighter.isVulnerable()){
            return 6;
        }else{
            return 10;
        }
        
    }


    public String toString(){
        return "Fighter is a Warrior";
    }
    
    
}

// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean preparedSpell = false;
    @Override
    boolean isVulnerable() {
        if(this.preparedSpell){
            return false;
        }else if (!this.preparedSpell){
            return true;
        }else{
            return false;
        }
    }

    void prepareSpell(){
        this.preparedSpell = !this.preparedSpell;
    }

    public String toString(){
        return "Fighter is a Wizard";
    }

    
    @Override
    int getDamagePoints(Fighter fighter){
        if(fighter.isVulnerable() && this.preparedSpell == true){
            return 12;
        }
        else{
            return 3;
        }
    }
}
