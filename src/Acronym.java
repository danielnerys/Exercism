class Acronym {
    private String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        boolean pegarProxima= true;

        for(Character ch: this.phrase.toCharArray()){
            if(ch == ' ' || ch == '-' || ch == '_'){
                pegarProxima= true;

            }else if(pegarProxima){
                acronym.append(ch.toString().toUpperCase());
                pegarProxima = false;
            }
        }
        return acronym.toString();

    }

}
