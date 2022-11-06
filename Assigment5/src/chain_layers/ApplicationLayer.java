package chain_layers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationLayer extends Layer {


	public ApplicationLayer(Layer next) {
		super(next);
	}

	@Override
	public String handle_pack(String msg) {
		if(msg == null)
		{
			BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
			// Reading data using readLine
			try {
				System.out.println("Please input some mesage.");
				msg = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				msg = "";
			}
		}
		return msg;
	}

	@Override
	public String handle_unpack(String msg) {
		System.out.println(msg);
		return msg;
	}
}
