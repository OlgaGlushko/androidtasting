package ru.synergy.androidtasting.statistics;

import org.junit.Test;

public class StatisticsUtilsTest {

    @Test
    fun getActiveAndCompletedStats_noCompleted_returnsHundredZero() {
        val tasks = listOf(
                Task("title", "desc", isCompleted = false)

        )
                // when the list of tasks is computed with an active task
        val result = getActiveAndCompletedStats(task)

                // Then the percentages are 100 and 0
        assertThat(result.activeTasksPercent, 'is'(100f))
        assertThat(result.completedTasksPercent, 'is'(0f))


    }

    @Test
    fun getActiveAndCompletedStats_noActive_returnsZeroHundred() {
        val tasks = listOf(
                Task("title", "desc", isCompleted = true)

        )
                // when the list of tasks is computed with a completed task
        val result = getActiveAndCompletedStats(task)

                //Then the percentages are 0 and 100
        assertThat(result.activeTasksPercent, 'is'(0f))
        assertThat(result.completedTasksPercent, 'is'(100f))
    }
    @Test
    fun getActiveAndCompletedStats_both_returnsFortySixty() {
        val tasks = listOf(
                Task("title", "desc", isCompleted = true)

        )
        // when the list of tasks is computed with a completed task
        val result = getActiveAndCompletedStats(task)

        //Then the percentages are 0 and 100
        assertThat(result.activeTasksPercent, 'is'(0f))
        assertThat(result.completedTasksPercent, 'is'(100f))
}
