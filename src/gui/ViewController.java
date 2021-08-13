package gui;

import entities.Ponto;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField tfxa;

	@FXML
	private TextField tfya;

	@FXML
	private TextField tfxb;

	@FXML
	private TextField tfyb;

	@FXML
	private TextField tfxc;

	@FXML
	private TextField tfyc;

	@FXML
	private TextField tfda;

	@FXML
	private TextField tfdb;

	@FXML
	private TextField tfdc;

	@FXML
	private TextField tfPonto;

	@FXML
	private Button btLimpa;

	@FXML
	private Button btCalcula;

	@FXML
	public void btLimpaAction() {
		tfxa.clear();
		tfxb.clear();
		tfxc.clear();
		tfya.clear();
		tfyb.clear();
		tfyc.clear();
		tfda.clear();
		tfdb.clear();
		tfdc.clear();
		tfPonto.clear();
	}

	@FXML
	public void btCalculaAction() {

		try {
			double xa = Double.parseDouble(tfxa.getText().replace(',', '.'));
			double ya = Double.parseDouble(tfya.getText().replace(',', '.'));
			Ponto a = new Ponto(xa, ya);

			double xb = Double.parseDouble(tfxb.getText().replace(',', '.'));
			double yb = Double.parseDouble(tfyb.getText().replace(',', '.'));
			Ponto b = new Ponto(xb, yb);

			double xc = Double.parseDouble(tfxc.getText().replace(',', '.'));
			double yc = Double.parseDouble(tfyc.getText().replace(',', '.'));
			Ponto c = new Ponto(xc, yc);

			double da = Double.parseDouble(tfda.getText().replace(',', '.'));
			double db = Double.parseDouble(tfdb.getText().replace(',', '.'));
			double dc = Double.parseDouble(tfdc.getText().replace(',', '.'));

			Ponto p = Ponto.triangula(a, b, c, da, db, dc);
			tfPonto.setText(p.toString());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
