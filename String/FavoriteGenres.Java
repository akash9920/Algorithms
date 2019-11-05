
class FavoriteGenres {

	// Question

	/*
	 * 
	 * Given a map Map<String, List<String>> userSongs with user names as keys and a
	 * list of all the songs that the user has listened to as values.
	 * 
	 * Also given a map Map<String, List<String>> songGenres, with song genre as
	 * keys and a list of all the songs within that genre as values. The song can
	 * only belong to only one genre.
	 * 
	 * The task is to return a map Map<String, List<String>>, where the key is a
	 * user name and the value is a list of the user's favorite genre(s). Favorite
	 * genre is the most listened to genre. A user can have more than one favorite
	 * genre if he/she has listened to the same number of songs per each of the
	 * genres.
	 * 
	 * Example 1:
	 * 
	 * Input: userSongs = { "David": ["song1", "song2", "song3", "song4", "song8"],
	 * "Emma": ["song5", "song6", "song7"] }, songGenres = { "Rock": ["song1",
	 * "song3"], "Dubstep": ["song7"], "Techno": ["song2", "song4"], "Pop":
	 * ["song5", "song6"], "Jazz": ["song8", "song9"] }
	 * 
	 * Output: { "David": ["Rock", "Techno"], "Emma": ["Pop"] }
	 * 
	 * Explanation: David has 2 Rock, 2 Techno and 1 Jazz song. So he has 2 favorite
	 * genres. Emma has 2 Pop and 1 Dubstep song. Pop is Emma's favorite genre.
	 * Example 2:
	 * 
	 * Input: userSongs = { "David": ["song1", "song2"], "Emma": ["song3", "song4"]
	 * }, songGenres = {}
	 * 
	 * Output: { "David": [], "Emma": [] }
	 * 
	 */

	Map<String, List<String>> favoriteGenreSongList = new HashMap<>();

	Map<String, List<String>> personSongList = new HashMap<>();
	Map<String, List<String>> genreSongList = new HashMap<>();

	Map<String, List<String>> favGenreListMap = new HashMap<>();

	List<String> temp = new ArrayList<>();

	Stack<String> favoriteGenre = new Stack<>();

	public static void main(String[] args) {

		// Map<String,List<String>> personSongList = new HashMap<>();
		// Map<String,List<String>> genreSongList = new HashMap<>();

	}

	public Map<String, List<String>> favoriteGenreSong() {

		// init map;

		Map<String, List<String>> tempMap = new HashMap<String, List<String>>();

		for (String name : personSongList.keySet()) {

			tempMap.put(name, new ArrayList<String>());
			favGenreListMap.put(name, new ArrayList<String>());
		}

		for (String name : personSongList.keySet()) {

			temp.clear();
			for (String song : personSongList.get(name)) {

				for (String genre : genreSongList.keySet()) {

					if (genreSongList.get(genre).contains(song)) {
						temp.add(genre);
						break;
					}
				}
			}

			tempMap.put(name, temp);
		}

		Map<String, Integer> genreCount = new HashMap<>();

		for (String name : tempMap.keySet()) {

			genreCount.clear();
			int n = 0;

			for (String genreNAme : tempMap.get(name)) {

				if (genreCount.containsKey(name)) {

					genreCount.put(name, genreCount.get(genreNAme) + 1);
				} else {
					genreCount.put(name, 1);
				}

				for (String g : genreCount.keySet()) {

					if (genreCount.get(g) > n) {

						favoriteGenre.clear();
						favoriteGenre.push(g);
						n = genreCount.get(g);
					}
					if (genreCount.get(g) == n) {
						favoriteGenre.push(g);
					}

				}
				favGenreListMap.put(name, new ArrayList<String>());

				for (String s : favoriteGenre) {
					favGenreListMap.get(name).add(s);
				}
			}
		}
		return favGenreListMap;
	}

}
