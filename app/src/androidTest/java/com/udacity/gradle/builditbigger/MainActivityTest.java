package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Project name FinalProject
 * Created by kenneth on 17/09/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private static final String JOKE_TEXT = "This is totally a funny joke";

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(
            MainActivity.class, false, false);

    @Before
    public void setUp() throws Exception {
        activityTestRule.launchActivity(new Intent());
    }

    @Test
    public void testAsyncTaskForJoke() throws Throwable {

        onView(withId(R.id.btn_joke)).perform(click());
        onView(withText(JOKE_TEXT)).check(matches(isDisplayed()));

    }
}
