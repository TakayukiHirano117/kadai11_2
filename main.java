package kadai_11;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		ThunderFirePokemon tfp = new ThunderFirePokemon();
		raikou Raikou = new raikou();
		entei Entei = new entei();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("雷炎ポケモンの名前を設定してください");
		tfp.setName(scan.nextLine());
		
		tfp.thunderAttack();
		Raikou.thunderAttack();
		Entei.fireAttack();
		
	}
}
