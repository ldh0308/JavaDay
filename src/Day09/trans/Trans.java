package Day09.trans;

import java.util.Scanner;

public abstract class Trans {
    Scanner sc = new Scanner(System.in);
    int result = 0;
    public abstract void input();
    public abstract int start(int x);
    public abstract int stop(int y);
    public abstract void show();
}
