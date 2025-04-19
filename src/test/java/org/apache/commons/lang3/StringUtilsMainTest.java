package org.apache.commons.lang3;  // 关键：包声明与待测类一致

public class StringUtilsMainTest {
    public static void main(String[] args) {
        testAbbreviate();
        testIsEmpty();
        testReverse();
    }

    static void testAbbreviate() {
        String result = StringUtils.abbreviate("HelloWorld", 10);  // 直接使用类名（同包无需导入）
        boolean passed = "HelloWorld".equals(result);
        if (!passed) {
            System.err.println("testAbbreviate FAILED: " + result);
        }
    }

    static void testIsEmpty() {
        boolean passed = StringUtils.isEmpty("") && !StringUtils.isEmpty("test");
        if (!passed) System.err.println("testIsEmpty FAILED");
    }

    static void testReverse() {
        String reversed = StringUtils.reverse("abc");
        if (!"cba".equals(reversed)) System.err.println("testReverse FAILED");
    }
}