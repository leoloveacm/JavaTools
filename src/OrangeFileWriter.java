import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lenovo on 2017/4/17.
 */
public class OrangeFileWriter {
    private PrintWriter fout;
    /**
     * Main 函数，用于测试
     */
    public static void main(String[] args){
        OrangeFileWriter item = new OrangeFileWriter("D:\\CoreCode\\Java\\tools\\JavaTools\\text.txt");
        item.fileWriter("不知道要写什么，就是这样");
        item.fileClose();
    }
    /**
     * 构造函数
     */
    public OrangeFileWriter(){
        fout = null;
    }
    /**
     * @param filename 需要保存的文件位置
     */
    public OrangeFileWriter(String filename) {
        try {
            File file = new File(filename);
            if(!file.exists()){
                file.createNewFile();
            }
            fout = new PrintWriter(file);
            System.out.println("Success!");
        }
        catch (Exception ioe){
            System.err.println(ioe.toString());
        }
    }
    /**
     * @param text 需要输出的文件
     */
    public void fileWriter(String text){
        if(fout == null) {
            System.err.println("Something Wrong");
            return ;
        }
        fout.println(text);
    }
    /**
     * 关闭文件
     */
    public void fileClose(){
        if(fout != null){
            fout.close();
        }
        return ;
    }
}
