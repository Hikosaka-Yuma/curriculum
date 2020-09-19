package sample;

//メイン: 敵を吸い込んで、吸い込んだ敵の能力を使うシーン
public class KirbyMain {

 public static void main(String[] args) {
	 // まずはプラズマを吸い込む！
	 AbilityOfEnemy aoe = new PlasmaWisp("プラズマ波動弾");
	 aoe.useAbility();
	 // 続いてナイトを吸い込む！
	 aoe = new PlasmaWisp("百烈義理");
	 aoe.useAbility();

 }
}
