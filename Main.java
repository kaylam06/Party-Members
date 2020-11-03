class Main {
  public static void main(String[] args) {
    String [] friends = {"Nevaeh", "Amya", "Ky'Mani", "Re'Sean", "Jason", "Lennox"};

    for in (int i = 0; i<5; i++){
      System.out.print(friends[i]);
    }

    friends[5] = "Azalea";

    System.out.print("\n Here is our updated list: \n");

    for (int i = 0; i<friends.length; i++){
      System.out.print(friends[i]);
    }  
  }
}