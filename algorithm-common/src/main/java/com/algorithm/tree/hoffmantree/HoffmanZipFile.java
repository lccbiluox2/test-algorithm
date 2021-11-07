package com.algorithm.tree.hoffmantree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 12:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class HoffmanZipFile {

    public static void zipFile(String srcFile, String dstFile) {
        //创建输出流
        OutputStream os = null;
        ObjectOutputStream oos = null;
        //创建文件的输入流
        FileInputStream is = null;
        try {
            //创建文件的输入流
            is = new FileInputStream(srcFile);
            //创建一个和源文件大小一 样的byte[]
            byte[] b = new byte[is.available()];
            //读取文件.
            is.read(b);
            //直接对源文件压缩
            byte[] huffmanBytes = HoffmanCode.huffmanZipBytes(b);
            //创建文件的输出流，存放压缩文件
            os = new FileOutputStream(dstFile);
            //创建一个和文件输出流关联的0bject0utputStream
            oos = new ObjectOutputStream(os);
            oos.writeObject(huffmanBytes);
            oos.writeObject(HoffmanCode.huffmanCodes);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } finally {
            try {
                os.close();
                is.close();
                oos.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void unZipFile(String zipFile, String destFile) {
        //定义文件输入流.
        InputStream is = null;
        //定义一个对象输入流
        ObjectInputStream ois = null;
        //定义文件的输出流
        OutputStream os = null;
        try {
            //创建文件输入流
            is = new FileInputStream(zipFile);
            //创建一个和is关联的对象输入流
            ois = new ObjectInputStream(is);
            //读取byte数组huffmanBytes
            byte[] huffmanBytes = (byte[]) ois.readObject();
            //读取赫夫曼编码表
            Map<Byte, String> huffmanCodes = (Map<Byte, String>) ois.readObject();
            //解码
            byte[] decode = HoffmanCode.decode(huffmanCodes, huffmanBytes);

            //将bytes数组写入到目标文件
            os = new FileOutputStream(destFile);
            //写数据到dstFile文件
            os.write(decode);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                ois.close();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
