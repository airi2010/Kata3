
package kata3;

public class Kata3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histogram= new Histogram();
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("ull.es");
        
        histogram.increment2("ull.es",30);
         histogram.increment2("ulpgc.es",50);
         histogram.increment2("dis.ulpgc.es",60);
         histogram.increment2("hotmail.es",20);
        HistogramDisplay histogramdis = new HistogramDisplay("Histogram",histogram,0,"email domain","nº emails");
        histogramdis.execute();
    }
    
}
