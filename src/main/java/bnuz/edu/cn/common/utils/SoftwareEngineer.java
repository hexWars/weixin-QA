package bnuz.edu.cn.common.utils;

/**
 * @Description:
 * @Author: Cai
 * @CreateTime: 2022/2/4
 */

public class SoftwareEngineer {
    private String name;
    private String role;
    private String MBTI;
    private String[] language_spoken;

    public SoftwareEngineer() {
        this.name = "Cai";
        this.role = "Software Engineer";
        this.MBTI = "INFJ";
        this.language_spoken = new String[]{"zh_CN", "en_US"};
    }

    @Override
    public String toString() {
        return "nice to meet you";
    }
}
