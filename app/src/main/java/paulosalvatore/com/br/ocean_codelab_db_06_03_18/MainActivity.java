package paulosalvatore.com.br.ocean_codelab_db_06_03_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DatabaseHelper helper = new DatabaseHelper(this.getApplicationContext());
		DatabaseManager.initializeInstance(helper);
		DatabaseManager db = DatabaseManager.getInstance();

		/*
		Posicao novaPosicao = new Posicao(
				45.47,
				37.27,
				"06/03/2018 - 20h38"
		);

		db.inserirPosicao(novaPosicao);

		List<Posicao> posicoes1 = db.obterPosicoes();

		for (Posicao posicao : posicoes1) {
			Log.d("POSIÇÃO_ID", String.valueOf(posicao.getId()));
			Log.d("POSIÇÃO_LATITUDE", String.valueOf(posicao.getLatitude()));
		}

		Posicao posicao1 = posicoes1.get(0);

		posicao1.setLatitude(11.74);
		db.atualizarPosicao(posicao1);

		List<Posicao> posicoes2 = db.obterPosicoes();

		for (Posicao posicao : posicoes2) {
			Log.d("POSIÇÃO_ID", String.valueOf(posicao.getId()));
			Log.d("POSIÇÃO_LATITUDE", String.valueOf(posicao.getLatitude()));
		}

		Posicao posicao2 = posicoes2.get(0);
		db.removerPosicao(posicao2);

		List<Posicao> posicoes3 = db.obterPosicoes();

		for (Posicao posicao : posicoes3) {
			Log.d("POSIÇÃO_ID", String.valueOf(posicao.getId()));
			Log.d("POSIÇÃO_LATITUDE", String.valueOf(posicao.getLatitude()));
		}
		*/
	}
}
