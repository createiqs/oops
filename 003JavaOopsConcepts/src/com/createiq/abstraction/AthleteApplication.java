package com.createiq.abstraction;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AthleteApplication {

	public static void main(String[] args) throws IOException {
		String FILE_PATH = "src\\com\\createiq\\abstraction\\";
		FileOutputStream cricters = new FileOutputStream(FILE_PATH + "cricters.txt");
		FileOutputStream footBall = new FileOutputStream(FILE_PATH + "FottBallPlayers.txt");
		FileOutputStream players = new FileOutputStream(FILE_PATH + "Players.txt");
		ByteArrayOutputStream br = null;

		CricketPlayer sachin = new CricketPlayer("sachin tendulker", " master blaster ", new Date(1978, 12, 8),
				"India ", 450, 100, 150, 3500, 35);
//		sachin.getBioData();
//		sachin.compititions();
//		sachin.bodyType();

		CricketPlayer ganguly = new CricketPlayer("sarouv ganguly", " Dada ", new Date(1969, 12, 8), "India ", 320, 45,
				125, 3200, 27);
//		ganguly.getBioData();
//		ganguly.compititions();
//		ganguly.bodyType();

		CricketPlayer[] cricketers = new CricketPlayer[2];
		cricketers[0] = sachin;
		cricketers[1] = ganguly;

		for (CricketPlayer cricket : cricketers) {
			br = new ByteArrayOutputStream();
			cricket.getBioData();
			cricket.compititions();
			cricket.bodyType();
			br.write(cricket.toString().getBytes());
			br.writeTo(cricters);
			br.writeTo(players);
			br.flush();
			br.close();
//			cricters.close();
		}

		System.out.println("--------------------------------------");

		FootBallPlayer ronaldo = new FootBallPlayer("cristiano ronaldo", "cr7", new Date(1982, 8, 15), " Portchgries",
				98, 10, 15, "Junvanties");
		FootBallPlayer messi = new FootBallPlayer("Lional Messi", "messi", new Date(1979, 9, 15), " Argentina", 102, 12,
				15, " Barcilona");

		FootBallPlayer[] footBallPlayers = { ronaldo, messi };
		for (FootBallPlayer player : footBallPlayers) {
			br = new ByteArrayOutputStream();
			player.getBioData();
			player.compititions();
			player.bodyType();
			br.write(player.toString().getBytes());
			br.writeTo(footBall);
			br.writeTo(players);
			br.flush();
//			footBall.close();
//			br.close();
		}

//		for()
//		br = new ByteArrayOutputStream();
//		br.write(cricketers.toString().getBytes());
//		br.write(footBallPlayers.toString().getBytes());
//		br.writeTo(players);
//		br.flush();
//		br.close();
//		players.close();

		ArrayList arrayList = new ArrayList();
		arrayList.add(123);
		arrayList.add(123.23);
		arrayList.add(123.5f);
		arrayList.add("anil");
		arrayList.add('c');
		arrayList.add(123);
		arrayList.add(123.23);

		System.out.println(arrayList);

		arrayList.remove(1);

	}

}
