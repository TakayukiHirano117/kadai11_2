package kadai_11;

public class ThunderFirePokemon implements ThunderPokemon, FirePokemon{
	private String name;
	
	// セッターメソッド
	public void setName(String name) {
		 this.name = name;
	 }
	
	public void thunderAttack() {
		System.out.println(this.name + "の雷属性の攻撃です。");
	}
	
	public void fireAttack() {
		System.out.println(this.name + "の炎属性の攻撃です。");
	}
	
}
