package com.hongfans.testingexample;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @desc: TODO
 * @author: Major
 * @since: 2017/7/3 23:06
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest{


    private static final String STRING_TO_BE_TYPED = "Peter";

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void sayHello(){
        // 获取 id 为 R.id.editText 的 view，输入文本 Peter， 关闭软键盘
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //line 1
        // 获取 text 为 "Say hello!" 的 view ，点击
        onView(withText("Say hello!")).perform(click()); //line 2
        String expectedText = "Hello, " + STRING_TO_BE_TYPED + "!";
        // 获取 id 为 R.id.textView 的 view，检查文本是否和期望的相同
        onView(withId(R.id.textView)).check(matches(withText(expectedText))); //line 3
    }
}
