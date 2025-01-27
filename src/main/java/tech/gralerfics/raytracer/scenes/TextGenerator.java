package tech.gralerfics.raytracer.scenes;

import tech.gralerfics.utils.maths.Vector3f;

import java.util.ArrayList;
import java.util.HashMap;

class SymInfo {
    public SymInfo() {}

    public SymInfo(int height, int width, byte[][] v) {
        this.width = width;
        this.height = height;
        this.v = v;
    }

    int width, height;
    byte[][] v;
}

public final class TextGenerator {
    private static HashMap<Integer, SymInfo> infoList = new HashMap<>();

    static {
        // A ~ Z
        infoList.put(65, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(66, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(67, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(68, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(69, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        infoList.put(70, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0}
                }
        ));
        infoList.put(71, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(72, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(73, new SymInfo(
                7, 3,
                new byte[][]{
                        {1, 1, 1},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {1, 1, 1}
                }
        ));
        infoList.put(74, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(75, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 0},
                        {1, 1, 1, 0, 0},
                        {1, 0, 0, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(76, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        infoList.put(77, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 1, 0, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(78, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(79, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(80, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0}
                }
        ));
        infoList.put(81, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 0},
                        {0, 1, 1, 0, 1}
                }
        ));
        infoList.put(82, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(83, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(84, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0}
                }
        ));
        infoList.put(85, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(86, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0}
                }
        ));
        infoList.put(87, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 1, 0, 1},
                        {1, 1, 0, 1, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(88, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(89, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0}
                }
        ));
        infoList.put(90, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        // a ~ z
        infoList.put(97, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1}
                }
        ));
        infoList.put(98, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(99, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(100, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1}
                }
        ));
        infoList.put(101, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1}
                }
        ));
        infoList.put(102, new SymInfo(
                7, 4,
                new byte[][]{
                        {0, 0, 1, 1},
                        {0, 1, 0, 0},
                        {1, 1, 1, 1},
                        {0, 1, 0, 0},
                        {0, 1, 0, 0},
                        {0, 1, 0, 0},
                        {0, 1, 0, 0}
                }
        ));
        infoList.put(103, new SymInfo(
                8, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(104, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(105, new SymInfo(
                7, 1,
                new byte[][]{
                        {1},
                        {0},
                        {1},
                        {1},
                        {1},
                        {1},
                        {1}
                }
        ));
        infoList.put(106, new SymInfo(
                8, 4,
                new byte[][]{
                        {0, 0, 0, 1},
                        {0, 0, 0, 0},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {0, 0, 0, 1},
                        {1, 1, 1, 0}
                }
        ));
        infoList.put(107, new SymInfo(
                7, 4,
                new byte[][]{
                        {1, 0, 0, 0},
                        {1, 0, 0, 0},
                        {1, 0, 0, 1},
                        {1, 0, 1, 0},
                        {1, 1, 0, 0},
                        {1, 0, 1, 0},
                        {1, 0, 0, 1}
                }
        ));
        infoList.put(108, new SymInfo(
                7, 2,
                new byte[][]{
                        {1, 0},
                        {1, 0},
                        {1, 0},
                        {1, 0},
                        {1, 0},
                        {1, 0},
                        {0, 1}
                }
        ));
        infoList.put(109, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(110, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(111, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(112, new SymInfo(
                8, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0}
                }
        ));
        infoList.put(113, new SymInfo(
                8, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1}
                }
        ));
        infoList.put(114, new SymInfo(
                7, 4,
                new byte[][]{
                        {0, 0, 0, 0},
                        {0, 0, 0, 0},
                        {1, 0, 1, 1},
                        {1, 1, 0, 0},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0},
                        {1, 0, 0, 0}
                }
        ));
        infoList.put(115, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(116, new SymInfo(
                7, 3,
                new byte[][]{
                        {0, 1, 0},
                        {0, 1, 0},
                        {1, 1, 1},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 1, 0},
                        {0, 0, 1}
                }
        ));
        infoList.put(117, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1}
                }
        ));
        infoList.put(118, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0}
                }
        ));
        infoList.put(119, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1},
                        {0, 1, 1, 1, 1}
                }
        ));
        infoList.put(120, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {0, 1, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1}
                }
        ));
        infoList.put(121, new SymInfo(
                8, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 0}
                }
        ));
        infoList.put(122, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        // /
        infoList.put(47, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0}
                }
        ));
        // !
        infoList.put(33, new SymInfo(
                7, 1,
                new byte[][]{
                        {1},
                        {1},
                        {1},
                        {1},
                        {1},
                        {0},
                        {1}
                }
        ));
        // .
        infoList.put(46, new SymInfo(
                7, 1,
                new byte[][]{
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {1},
                        {1}
                }
        ));
        // ,
        infoList.put(44, new SymInfo(
                8, 1,
                new byte[][]{
                        {0},
                        {0},
                        {0},
                        {0},
                        {0},
                        {1},
                        {1},
                        {1}
                }
        ));
        infoList.put(32, new SymInfo(
                1, 5,
                new byte[][]{
                        {0, 0, 0, 0, 0}
                }
        ));
        // 0 ~ 9
        infoList.put(48, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 1, 1},
                        {1, 0, 1, 0, 1},
                        {1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                }
        ));
        infoList.put(49, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 1, 0, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        infoList.put(50, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 1, 1, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1}
                }
        ));
        infoList.put(51, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(52, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 0, 1, 1},
                        {0, 0, 1, 0, 1},
                        {0, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1}
                }
        ));
        infoList.put(53, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(54, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 0, 1, 1, 0},
                        {0, 1, 0, 0, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(55, new SymInfo(
                7, 5,
                new byte[][]{
                        {1, 1, 1, 1, 1},
                        {1, 0, 0, 0, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0}
                }
        ));
        infoList.put(56, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 0}
                }
        ));
        infoList.put(57, new SymInfo(
                7, 5,
                new byte[][]{
                        {0, 1, 1, 1, 0},
                        {1, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1},
                        {0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 1},
                        {0, 0, 0, 1, 0},
                        {0, 1, 1, 0, 0}
                }
        ));
    }

    public static ArrayList<Vector3f> genSingleCharacter(int x, int y, int factor, SymInfo si) { // ���Ͻ�
        ArrayList<Vector3f> rst = new ArrayList<>();
        for (int i = 0; i < si.height; i ++) {
            for (int j = 0; j < si.width; j ++) {
                if (si.v[i][j] == 1) {
                    for (int k = 0; k < factor; k ++) {
                        for (int l = 0; l < factor; l ++) {
                            rst.add(new Vector3f(x + j * factor + k, y + i * factor + l, 0));
                        }
                    }
                }
            }
        }
        return rst;
    }

    public static ArrayList<Vector3f> genSentence(int x, int y, String s, int interval, int factor) { // ���Ͻ�
        ArrayList<Vector3f> rst = new ArrayList<>();
        int l = s.length();
        int offset = 0;
        for (int i = 0; i < l; i ++) {
            SymInfo si = infoList.get((int) s.charAt(i));
            if (si == null) continue;
            rst.addAll(genSingleCharacter(x + offset, y, factor, si));
            offset += si.width * 2 + interval * 2;
        }
        return rst;
    }
}
