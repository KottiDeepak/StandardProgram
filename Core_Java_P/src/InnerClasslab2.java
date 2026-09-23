import java.util.Scanner;

public class InnerClasslab2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArtPeice[] artArray = new ArtPeice[2];

        for (int i = 0; i < 2; i++) {

            String artId = sc.nextLine();
            String artName = sc.nextLine();

            double price = sc.nextDouble();
            sc.nextLine();
            if(price<0)
            {
            	System.out.println("Error: Invalid price");
            	return;
            }

            String artistName = sc.nextLine();
            String country = sc.nextLine();

            ArtPeice.Artist artist =
                    new ArtPeice.Artist(artistName, country);

            artArray[i] =
                    new ArtPeice(artId, artName, price, artist);
        }

        // Print all art pieces directly
        for (int i = 0; i < artArray.length; i++) {
            artArray[i].printArtDetails();
        }

        sc.close();
    }
}


class ArtPeice {

    String artId;
    String artName;
    double price;
    Artist artist;

    public ArtPeice(String artId, String artName,
                    double price, Artist artist) {

        this.artId = artId;
        this.artName = artName;
        this.price = price;
        this.artist = artist;
    }


    static class Artist {

        String artistName;
        String country;

        public Artist(String artistName, String country) {
            this.artistName = artistName;
            this.country = country;
        }
    }


    public void printArtDetails() {

        System.out.println("Art ID: " + artId);
        System.out.println("Art Name: " + artName);
        System.out.println("Price: " + price);
        System.out.println("Artist: " + artist.artistName);
        System.out.println("Country: " + artist.country);
    }
}