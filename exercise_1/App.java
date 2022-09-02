public class App {
	 public static void main(String[] args) {

	        // Character Class
	        Character knight = new Character();

	        knight.strength = 10;
	        knight.agility = 5;
	        knight.intelligence = 0;
	        knight.name = "Chen";
	        knight.sayMyName();

	        Character mage = new Character();

	        mage.strength = 0;
	        mage.agility = 5;
	        mage.intelligence = 10;
	        mage.name = "Akasha";
	        mage.sayMyName();

	        Character thief = new Character();

	        thief.strength = 5;
	        thief.agility = 10;
	        thief.intelligence = 0;
	        thief.name = "Gondar";
	        thief.sayMyName();

	        // Enemy Class
	        Enemy boss = new Enemy();

	        boss.damage = 50;
	        boss.health = 500;
	        boss.armor = 100;
	        boss.hasMagicImmunity = true;
	        boss.name = "Roshan";
	        boss.enemyDialogue();

	        Enemy skeleton = new Enemy();

	        skeleton.damage = 5;
	        skeleton.health = 10;
	        skeleton.armor = 5;
	        skeleton.hasMagicImmunity = false;
	        skeleton.name = "Common Skeleton Warrior";
	        skeleton.enemyDialogue();

	        Enemy dragon = new Enemy();

	        dragon.damage = 40;
	        dragon.health = 400;
	        dragon.armor = 75;
	        dragon.hasMagicImmunity = false;
	        dragon.name = "Ancient Wyvern";
	        dragon.enemyDialogue();
	        
	        //Exercise 1
	        
	       Weapon Primary = new Weapon();
	       Primary.Name = "Vandal";
	       Primary.Damage = 40;
	       Primary.Weight = 25;
	       Primary.Rarity = "A+";
	       Primary.Description = " The Vandal is a Rifle that is a primary weapon in VALORANT.";
	       Primary.WeaponDescription();
		 
	       Weapon Ultimate = new Weapon();
	       Ultimate.Name = "Tour De Force";
	       Ultimate.Damage = 150;
	       Ultimate.Weight = 18;
	       Ultimate.Rarity = "S+";
	       Ultimate.Description = " Tour De Force is an ultimate ability for Chamber.";
	       Ultimate.WeaponDescription();
		 
	       Weapon Secondary = new Weapon();
	       Secondary.Name = "Sheriff";
	       Secondary.Damage = 55;
	       Secondary.Weight = 20;
	       Secondary.Rarity = "B+";
	       Secondary.Description = " The Sheriff is a Sidearm in VALORANT.";
	       Secondary.WeaponDescription();
	 }
}
