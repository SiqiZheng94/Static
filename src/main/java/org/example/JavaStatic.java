package org.example;

public class JavaStatic {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public JavaStatic() {
    }


    public static void incrementTotalCount(){
        totalCount++;
    }
    public void incrementInstanceCount(){
        instanceCount++;
    }

    @Override
    public String toString() {
        return "JavaStatic{" +
                "totalCount=" + totalCount +
                " instanceCount=" + instanceCount +
                '}';
    }
}
