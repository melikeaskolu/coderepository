package homework4;

public class GamerManager implements GamerService {
	//oyuncu i�lemleri

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu eklendi");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu g�ncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu silindi");
	}
	

}
