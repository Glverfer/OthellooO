package tech.gralerfics.domain;

import tech.gralerfics.utils.maths.Vector3f;

public class BVHNode {
    public int left, right;
    public int n, index; // ���� n �������Σ����ӽڵ㣩, �������� index ��ʼ.
    public Vector3f AA, BB;

    public BVHNode() {}
    public BVHNode(int left, int right, int n, int index, Vector3f AA, Vector3f BB) {
        this.left = left;
        this.right = right;
        this.n = n;
        this.index = index;
        this.AA = AA;
        this.BB = BB;
    }

    @Override
    public String toString() {
        return "BVHNode{" +
                "left=" + left +
                ", right=" + right +
                ", n=" + n +
                ", index=" + index +
                ", AA=" + AA +
                ", BB=" + BB +
                '}';
    }
}
