package Grupo2.clase3;

public class taller_1 {
    
    public static void main(String[] args) {
        //punto 1 
        double d1 = 50.0 , d2 = 60.0 , d3 = 40.0;
        double t1 = 1.0 , t2 = 1.5 , t3 = 1.0 ; 
        double l1 = 6.0 , l2 = 7.0 , l3 = 5.0;
        double precioLitro = 1.40 , masaCargaKg = 1300 , largo = 2.1, ancho = 1.3 , alto= 1.2;
        double p1 = 3.0 , p2 = 3.5 , p3 = 2.5 , deprecPorKm = 0.09;
        
        System.out.println("d1, d2, d3, t1, t2, t3, l1, l2, l3, "
                + "precioLitro, masaCargaKg, largo, ancho, alto, "
                + "p1, p2, p3, deprecPorKm, v )");
        
        //punto 2 
        double v1 = d1 / t1;
        double v2 = d2 / t2;
        double v3 = d3 / t3;
        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);
        double kml1 = d1 / l1 ;
        double kml2 = d2 / l2 ;
        double kml3 = d3 / l3 ;
        double kmlTotal = (d1 + d2 + d3)/(l1 + l2 + l3);

        //punto 3 costos directos

        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);
        
        //punto 4 densidad y ocupacion

        double volCamionM3 = 11.0 ; 
        double volumenM3 = (largo * ancho * alto);
        double densidad  = (masaCargaKg / volumenM3);
        double ocupacion = (volumenM3 / volCamionM3);

        // punto 5 emisiones de CO2

        double fCO2 = 2.70 ; 
        double COTotal = (l1 + l2 + l3) * fCO2;
        double COporKm = COTotal / (d1 + d2 + d3);

        //punto 6 Conversiones y normalización
         double vprom_ms = vprom * 1000 / 3600 ; 
         double galPorlitro = 0.264172; 
         double galTot   = (l1 + l2 + l3) * galPorlitro;

         double vmin = 30 , vmax  = 90; 
        double vnorm = (vprom - vmin) / (vmax - vmin);

        
        // punto 7 Promedios y dispersión

        double vmedia = (v1 + v2 + v3) / 3 ;
        double sigma = Math.sqrt(
            (Math.pow(v1 - vmedia, 2) + Math.pow(v2 - vmedia, 2) + Math.pow(v3 - vmedia, 2)) / 3);
        
        // punto 8 Interpolación lineal

        double va = 40 , ca = 0.05; 
        double vb = 80, cb = 0.09 ; 
        double c_vprom =( ca + (cb - ca) * ((vprom - va) / (vb - va)));
        double costoMant = c_vprom * (d1 + d2 + d3); 

        // punto 9 Modelo polinómico de rendimiento
        double a = -0.0007, b = 0.085, c = 4.2;
         //kml(v) = a*v^2 + b*v + c
        double kmlModelo = a * vprom * vprom + b * vprom+ c; 
        double LitrosModelo = (d1 + d2 + d3) / kmlModelo;

        // 10 Índice de eficiencia

        double w1 , w2 , w3 , w4;
        w1 = w2 = w3 = w4 = 1;
        double score = w1 * (1/costoPorKm) + w2 * kmlTotal + w3 * (1 / COporKm) + w4 * (1/(1 + sigma)) ; 
        
        System.out.printf("v1 = %.2f , v2 = %.2f , v3 = %.2f%n" , v1 , v2 , v3);
        System.out.printf("vprom = %.2f km/h = %.3f m/s%n", vprom, vprom_ms);
        System.out.printf("kml1 = %.2f , kml2 = %.2f , kml3 = %.2f , kmlTotal = %.3f%n" , kml1 , kml2 , kml3 , kmlTotal);
        System.out.printf("Comb = %.2f, Dep = %.2f, Peajes = %.2f, Directo = %.3f, /km = %.3f%n", costoComb, deprec, peajes, costoDirecto, costoPorKm);
        System.out.printf("Volumen = %.3f m3, Densidad = %.2f kg/m3, Ocupacion = %.3f%n", volumenM3, densidad, ocupacion);
        System.out.printf("CO2 Total = %.3f kg, CO2/km = %.3f kg/km%n", COTotal, COporKm);
        System.out.printf("galTot = %.4f%n", galTot);
        System.out.printf("vmedia = %.3f, sigma = %.3f, vnorm = %.3f%n", vmedia, sigma, vnorm);
        System.out.printf("c(vprom) = %.5f, costoMant = %.3f%n", c_vprom, costoMant);
        System.out.printf("kmlModelo = %.3f, LitrosModelo = %.3f%n", kmlModelo, LitrosModelo);
        System.out.printf("Score = %.4f%n", score);
    }

}



