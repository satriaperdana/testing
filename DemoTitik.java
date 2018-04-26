package soal;

public class DemoTitik {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titik titik1 = new Titik("putih",1,3);
		
		System.out.println("Kondisi awal titik 1\t: ("+titik1.getPosX()+","+titik1.getPosY()+")");
		System.out.println("Warna: "+titik1.wrn.getWarna());
		titik1.pindahPosisi(3, 1);
		titik1.wrn.setWarna("Hijau");
		System.out.println("\nKondisi akhir titik 1\t: ("+titik1.getPosX()+","+titik1.getPosY()+")");
		System.out.println("Warna: "+titik1.wrn.getWarna());
	}

}
