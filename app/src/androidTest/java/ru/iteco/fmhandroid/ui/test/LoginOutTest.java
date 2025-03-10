package ru.iteco.fmhandroid.ui.test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static ru.iteco.fmhandroid.ui.data.DataHelper.toastMessageAuthorization;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.ui.page.PageObjectBefore;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class LoginOutTest {

    @Rule
    public ActivityScenarioRule<AppActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(AppActivity.class);
    PageObjectBefore pageObjectBefore = new PageObjectBefore();

    @Before
    public void startPage() {
        pageObjectBefore.loginIn();
    }

    @Test
    public void shouldLogout() {

        pageObjectBefore.loginOut();
        onView(withText(toastMessageAuthorization)).check(matches(isDisplayed()));
    }
}