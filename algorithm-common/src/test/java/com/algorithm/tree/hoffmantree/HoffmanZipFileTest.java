package com.algorithm.tree.hoffmantree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 12:12
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class HoffmanZipFileTest {

    /**
     * 测试点：测试文件压缩
     */
    @Test
    public void zipFile() {
        String srcFile = "/Users/lcc/IdeaProjects/lcc_work/test-algorithm/algorithm-common/data/纯色.jpeg";
        String destFile = "/Users/lcc/IdeaProjects/lcc_work/test-algorithm/algorithm-common/data/纯色.zip";
        HoffmanZipFile.zipFile(srcFile,destFile);
    }

    /**
     * 测试点：测试文件解压
     */
    @Test
    public void unzipFile() {
        String srcFile = "/Users/lcc/IdeaProjects/lcc_work/test-algorithm/algorithm-common/data/纯色.zip";
        String destFile = "/Users/lcc/IdeaProjects/lcc_work/test-algorithm/algorithm-common/data/纯色unzip.jpeg";
        HoffmanZipFile.unZipFile(srcFile,destFile);
    }
}