package org.apache.commons.lang3;  // 包名必须与待测类一致

import org.junit.jupiter.api.Test;          // 导入 @Test 注解
import static org.junit.jupiter.api.Assertions.*;  // 导入静态断言方法

public class StringUtilsJUnitTest {
    @Test
    void testAbbreviate() {
        assertEquals("HelloWorld", StringUtils.abbreviate("HelloWorld", 10));
    }

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("test"));
    }

    @Test
    void testReverse() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }
}