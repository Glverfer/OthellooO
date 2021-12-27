package tech.gralerfics.persistence.profiles;

import tech.gralerfics.gamelogic.Game;
import tech.gralerfics.gamelogic.Step;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public final class ProfileManager {
    private static final String path = "assets/profiles";

    public static HashMap<String, Game> list = new HashMap<>();

    public static void loadProfiles() {
        list.clear();
        File[] fs = (new File(path)).listFiles();
        if (fs != null) {
            for (File f : fs) {
                Game g = loadFrom(f.getName().replaceAll("[.][^.]+$", ""));
                if (g != null) {
                    list.put(g.name, g);
                }
            }
        }
    }

    public static boolean isExist(String filename) {
        File f = new File(path + "/" + filename + ".otop");
        return f.exists();
    }

    public static void modifyProfile(Game g, String newName) {
        deleteProfile(g.name);
        saveAs(g, newName);
    }

    public static boolean saveAs(Game game, String filename) {
        File prodir = new File(path);
        if (!prodir.exists()) {
            boolean errorlevel = prodir.mkdir();
            if (!errorlevel) return false;
        }
        try {
            BufferedWriter fout = new BufferedWriter(new FileWriter(path + "/" + filename + ".otop"));

            // ����
            fout.write(game.black.name + "\n");
            fout.write(game.white.name + "\n");
            // ����ģʽ
            fout.write((game.blackCheatModeOn) ? "1\n" : "0\n");
            fout.write((game.whiteCheatModeOn) ? "1\n" : "0\n");
            fout.write((game.cheatModeOned) ? "1\n" : "0\n");
            // ������
            fout.write((game.gameEnded) ? "1\n" : "0\n");
            // ��ǰִ��
            fout.write(game.judger.curChess + "\n");
            // ����
            fout.write(game.judger.stepList.size() + "\n");
            for (Step s : game.judger.stepList) {
                fout.write(s.getI() + " " + s.getJ() + " " + s.getColor() + "\n");
            }

            fout.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public static Game loadFrom(String filename) {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(path + "/" + filename + ".otop"));
            int peek;
            StringBuilder sin = new StringBuilder();
            while ((peek = fin.read()) != -1) sin.append((char) peek);
            fin.close();
            String prs = sin.toString();
            Scanner sc = new Scanner(prs);

            Game rst = new Game();
            rst.name = filename;

            // ����, �����������
            PlayerManager.loadPlayers();
            String blackname = sc.nextLine();
            String whitename = sc.nextLine();
            if (PlayerManager.list.containsKey(blackname)) {
                rst.black = PlayerManager.list.get(blackname);
            } else {
                return null;
            }
            if (PlayerManager.list.containsKey(whitename)) {
                rst.white = PlayerManager.list.get(whitename);
            } else {
                return null;
            }
            // ����ģʽ, �� 0, 1 ������
            int b;
            b = sc.nextInt();
            if (b != 1 && b != 0) return null;
            if (b == 1) rst.blackCheatModeOn = true;
            b = sc.nextInt();
            if (b != 1 && b != 0) return null;
            if (b == 1) rst.whiteCheatModeOn = true;
            b = sc.nextInt();
            if (b != 1 && b != 0) return null;
            if (b == 1) rst.cheatModeOned = true;
            // ������, �� 0, 1 ������
            b = sc.nextInt();
            if (b != 1 && b != 0) return null;
            if (b == 1) rst.gameEnded = true;
            // ��ǰִ��, �� 1, -1 ������
            int curc = sc.nextInt();
            if (curc != 1 && curc != -1) return null;
            // ����, ˳����һ��
            int N = sc.nextInt();
            for (int i = 0; i < N; i ++) {
                int I = sc.nextInt(), J = sc.nextInt(), C = sc.nextInt();
                if (I < 0 || I > 7) return null;
                if (J < 0 || J > 7) return null;
                if (C != 1 && C != -1) return null;
                rst.judger.put(I, J, C);
            }
            rst.judger.curChess = curc;

            sc.close();
            return rst;
        } catch (Exception e) {
            // ���� Step ʵ�ʲ����ȴ���������˴�
            return null;
        }
    }

    public static void deleteProfile(String filename) {
        try {
            File file = new File(path + "/" + filename + ".otop");
            if (file.isFile() && file.exists()) {
                file.delete();
            }
            list.remove(filename);
        } catch (Exception e) {
            // ɾ���浵����
        }
    }
}
