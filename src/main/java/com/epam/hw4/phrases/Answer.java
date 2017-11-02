package com.epam.hw4.phrases;

public enum Answer implements PrototypeOfAnswer {
    WELCOME {
        @Override
        public String toString(int value) {
            String s;
            switch (value) {
                case 1:
                    return "Hello, my dear friend! Welcome to the hippodrome!\n ";
                case 2:
                    return "\nOhhh... Don`t come back without the money!!!";
                default:
                    return "If you want to choose a horse & make a bet, type <1> & press <Enter>.\n" +
                            "If you want to leave our casino type <0>.";
            }
        }
    },
    WALLET {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "Your balance is: ";
                case 2:
                    return "\nAaaaaand....It`good time to check your ability to pay !";
                case 3:
                    return "Your bet is reset to zero";
                case 4:
                    return "Choose a horse... again!";
                case 5:
                    return "You are the bancrott";
                default:
                    return "\nType 1 to check your balance\nType 2 to make a bet" +
                            "\nType 3 for setting to zero your bet\nType " +
                            "4 to come back to previous level of menu";
            }
        }
    },
    HORSES {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "\nEnter the number to choose a horse! " +
                            "\nRemember! You can type another symbol to come back to the general menu.\n" +
                            "\nWe have 5 horses:\n " +
                            "\n--- 1 --- ARABIAN STALLION. \nIt is a perfect double-quick pureblooded arabian horse." +
                            "\n--- 2 --- LITTLE GRAY DONKEY. \nHis last name is Serenity. " +
                            "\n--- 3 --- PLOTVA.\n Witcher try to make some money for his new journey!" +
                            "\n--- 4 --- RAINBOW PONY. \nIt will spend all its physical forces & magic boosts \n" +
                            "for running...or not! " +
                            "\n--- 5 --- ZEBRA. Just a wild zebra. \nIt don`t know where is the start & stop points, \n" +
                            "but it can run very quickly.\n";
                case 2:
                    return "... Good choice!";
                case 3:
                    return "Player Heralt make a bet too." +
                            "\n\nThe Big races are will begin through ...three...\n" +
                            "...two...\n...one...\n GO!!!!!!!" +
                            "\n\nTigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik -tigidik...\n" +
                            "tigidik - \"Yuehogo!!!!!\"-tigidik...\n" +
                            "tigidik - tigidik - tigidik...\n" +
                            "tigidik - tigidik -tigidik...\n" +
                            "tigidik - \"Yuehogo!!!!!\"-tigidik...\n";
                case 4:
                    return " is finished first!!!";
                case 5:
                    return "You are The WINNER!!! \nYour balance is ";
                case 6:
                    return "You WIN!!! \nBut, you can get only a half of the gain, " +
                            "because the Heralt bets on Plotva too! \nYour balance is ";
                case 7:
                    return "CASINO WIN - You loose!!! \nYour balance is ";
                case 8:
                    return "\n Winner is ";
                default:
                    return "Type 1 to see what the horses compete in the next race\n" +
                            "Type 2 to choose a horse\n" +
                            "Type 3 to back to previous level of the menu";
            }
        }
    }, BET {
        @Override
        public String toString(int value) {
            switch (value) {
                case 1:
                    return "\nLet`s make a bet! Remember - it limited by your current balance!\n" +
                            "Type 0 to come back to the previous level";
                case 2:
                    return "Your bet is ";
                case 3:
                    return "You are returned to the previous level of the menu";
                default:
                    return "\nYour bet is incorrect. Try again! Your limit is ";
            }
        }
    }
}