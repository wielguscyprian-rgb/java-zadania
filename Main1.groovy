static void main(String[] args) {

    try{

        def plik = new File("dane.txt")
        //print plik.exists()

        if(plik.exists()){
            println plik.text
        } else println"plik nie istnieje"

        def wpisanyTekst = System.in.newReader().readLine()

        plik << wpisanyTekst + "\n"

    } catch (Exception blad){println"blad operacji na pliku"}

}