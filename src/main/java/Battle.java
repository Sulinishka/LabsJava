import java.util.Scanner;

class Player{ //класс игрок
        String name;
        int score;   //очки за выстрел
        int total;   //тотал сумма очков
        int hrt;     //попадание в сердце
        int hed;    //попадание в голову
        int stm;     //попадание в живот
        public void setName(String name){this.name = name;}   //конструктор
        public String getName(){return this.name;}
        public void writeScore(long hits, long diff){   //запись результатов
            if (hits>=15000-diff & hits<=15000+diff)
            {hrt+=15;score=15;}
            else if (hits>=8000-diff & hits<=8000+diff)
            {hed+=8;score=8;}
            else if (hits>=5000-diff & hits<=5000+diff)
            {stm+=5;score=5;}
            else
                score=0;
            total = hrt+hed+stm;
        }
        public String toString(){
            return name+": Сердце: "+hrt+" Голова: "+hed+" Живот: "+stm+" Очки за выстрел "+score+" Итого: "+total;
        }
    }

    class Battle{
        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            String command;
            long start;  //время начала
            long finish; //время выстрела
            long hits;   //от начала до выстрела
            long diff;   //окрестность
            Player p1 = new Player();
            Player p2 = new Player();
            Player tmp = new Player();
            boolean playerSw = true; //смена игрока
            boolean exit = false;    //выход из программы
            System.out.println("Игрок 1, введите имя");
            command = keyboard.nextLine();
            p1.setName(command);
            System.out.println("Игрок 2, введите имя");
            command = keyboard.nextLine();
            p2.setName(command);
            System.out.println("Выберите уровень сложности:\n1 - легкий\n2 - средний\n3 - сложный");
            while(true){   //цикл выбора уровня сложности из 3 вариантов
                command = keyboard.nextLine();
                if (command.equals("1")) {diff=300;break;}
                if (command.equals("2")) {diff=200;break;}
                if (command.equals("3")) {diff=100;break;}
            }
            while(true){
                if(playerSw) //очередность игроков
                    tmp = p1;
                else
                    tmp = p2;
                //таймер отсчета перед выстрелом
                try{
                    for (int i=3;i>0;i--){
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e) {System.out.println("CD interrupted");}

                System.out.println(tmp.getName()+" к барьеру!");
                start = System.currentTimeMillis();
                command = keyboard.nextLine();
                finish = System.currentTimeMillis();
                hits = finish - start; //подсчет времени (мс) от начала до выстрела
                System.out.println(hits);
                tmp.writeScore(hits,diff); //запись очков
                playerSw = !playerSw; //передача очереди
                if (playerSw){
                    System.out.println(p1); //вывод статистики 1
                    System.out.println(p2); //вывод статистики 2
                    System.out.println("Еще раунд? [y/n]");
                    while(true){ //цикл продолжать игру/нет
                        command = keyboard.nextLine();
                        if (command.equals("y")) break;
                        if (command.equals("n")) {exit=!exit; break;}
                    }
                }
                if (exit) break;
            }
        }
    }

