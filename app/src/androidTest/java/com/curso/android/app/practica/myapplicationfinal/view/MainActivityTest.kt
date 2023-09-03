package com.curso.android.app.practica.myapplicationfinal.view


import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.myapplicationfinal.R
import org.junit.Rule
import org.junit.Test


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


@Test
fun mainActivityButton(){
    Espresso.onView(
        ViewMatchers.withId(R.id.BotonComparacion)
    ).perform(
        ViewActions.click()
    )

    Espresso.onView(
        ViewMatchers.withId(R.id.Resultado)
    ).check(
        ViewAssertions.matches(
            ViewMatchers.withText(R.string.mensaje_iguales)
        )
    )

}
}