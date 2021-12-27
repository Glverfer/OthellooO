package tech.gralerfics.controller;

import tech.gralerfics.controller.wind.*;
import tech.gralerfics.managers.resource.ImageManager;
import tech.gralerfics.persistence.options.GUIConstants;
import tech.gralerfics.persistence.options.OptionsManager;
import tech.gralerfics.persistence.profiles.PlayerManager;
import tech.gralerfics.persistence.profiles.ProfileManager;

import java.awt.*;

public class Main {
    public static Mouse glfwMouse = new Mouse();
    public static Keyboard glfwKeyboard = new Keyboard();
    public static GlfwController glfwCtrl = new GlfwController("OthellooO", GUIConstants.GLFWWINDOW_DEFAULT_HRES, GUIConstants.GLFWWINDOW_DEFAULT_VRES, glfwMouse, glfwKeyboard);
    public static PlayerFrame playerFrame = new PlayerFrame();
    public static ProfileFrame profileFrame = new ProfileFrame();
    public static StatusFrame statusFrame = new StatusFrame();
    public static MainFrame mainFrame = new MainFrame();

    public static void confirmToClose(Window owner) {
        boolean rst = (new ConfirmDialog(owner)).show("Confirm to leave OthellooO?");
        if (rst) {
            System.exit(0);
        }
    }

    /**
     * �������
     */
    public static void main(String[] args) {
        // ��ʼ��������
        OptionsManager.loadOption();
        PlayerManager.loadPlayers();
        ProfileManager.loadProfiles();
        ImageManager.init();

        // �����ڼ���
        Main.mainFrame.setVisible(true);

        // GLFW ���ڼ���
        glfwCtrl.run();
    }
}
