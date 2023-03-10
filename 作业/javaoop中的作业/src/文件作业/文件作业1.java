package 文件作业;

import java.io.File;

public class 文件作业1 {
    int sum = 0;
    int sum2 = 0;

    public static void main(String[] args) {
        String path = "C:\\Users\\shun_\\Desktop\\Project\\Public\\ChinaSoft\\作业\\javaoop中的作业\\src\\文件作业";
        文件作业1 f = new 文件作业1();
        f.allChildren(path);
        System.out.println("一共有" + f.getSum() + "个java文件");
        System.out.println("一共有" + f.getSum2() + "个目录");
    }

    public void allChildren(String path) {
        try {
            File file = new File(path);
            File[] files = file.listFiles();
            for (File i : files) {
                //System.out.println(i.toString());
                if (i != null && i.isFile()) {
                    String name = i.getName();
                    String nameEnd = name.split("[.]")[name.split("[.]").length - 1];
                    if (nameEnd.equals("java")) {
                        System.out.println(name);
                        sum++;
                    }
                } else if (i != null) {
                    allChildren(i.getPath());
                    sum2++;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getSum() {
        return sum;
    }

    public int getSum2() {
        return sum2;
    }


}
