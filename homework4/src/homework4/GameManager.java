package homework4;

public class GameManager implements GameService {
	//oyun i�lemleri
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" Oyunu ba�ar�yla eklendi");
	}
	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" Oyunu ba�ar�yla g�ncellendii");
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" Oyunu ba�ar�yla silindi");
	}
	
	
	

}
