package less23.HW.task2;

public class App {
    public static void main(String[] args) {
        /*Task 2
        Создайте абстрактный класс GameCharacter, который представляет базовый класс для игровых персонажей.
        Определите абстрактный метод attack(), который будет различаться для разных типов персонажей
        (например, воин атакует мечом, а маг использует магические заклинания).

        Создайте несколько конкретных подклассов, представляющих разные типы персонажей,
                такие как Warrior, Mage, Archer, и т. д.
                Переопределите метод attack() для каждого класса.

                Создайте массив из игровых персонажей разных типов. Вызовите у каждого метод attack() в цикле.

         */
        GameCharacter[] players = new GameCharacter[3];
        players[0]=new Archer("JACK",60);
        players[1]=new Warrior("DIK",70);
        players[2]=new Mage("JACK",50);

        for (int i=0;i< players.length;i++){
            players[i].atac();
        }




    }
}
