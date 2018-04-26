package soal;

public class Titik {
	private int posX;
	private int posY;
	Warna wrn;
	
	Titik(String warna, int posX, int posY){
		wrn = new Warna(warna);
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public void pindahPosisi(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}

}
