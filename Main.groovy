
static void main(String[] args) {

    def argumentywjedenjlini = args.join(", ")
    try{

        def silnia = args[0].toDouble()
        //print silnia
        Double wynik = 1

        for(int i = 1; i < silnia+1; i += 1){
            wynik = wynik * i
        }

        println wynik

    } catch (NumberFormatException blad){println"podano zle dane"}

}