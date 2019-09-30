package com.kodilla.testing.forum.statistics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import Generators.WordGenerator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorImpStatisticsTest {

    CalculatorImpStatistics calculatorImpStatistics;
    private List<String> users;



    private Statistics statisticsMock;

    @BeforeEach
    void setUp() {
        statisticsMock = mock(Statistics.class);
        calculatorImpStatistics = new CalculatorImpStatistics();
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add(WordGenerator.generateRandomWord());
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(40);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificPostNumber0() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerPost= calculatorImpStatistics.getCommentsAvgPerPost();
        double getPostsAvgPerUser= calculatorImpStatistics.getPostsAvgPerUser();
        //Then
        assertEquals(0, getCommentsAvgPerPost);
        assertEquals(0, getPostsAvgPerUser);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificPostNumber1000() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerPost= calculatorImpStatistics.getCommentsAvgPerPost();
        double getPostsAvgPerUser= calculatorImpStatistics.getPostsAvgPerUser();
        //Then
        assertEquals(0.04, getCommentsAvgPerPost);
        assertEquals(100, getPostsAvgPerUser);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificUserNumber0() {
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerUser= calculatorImpStatistics.getCommentsAvgPerUser();
        double getPostsAvgPerUser= calculatorImpStatistics.getPostsAvgPerUser();
        //Then
        assertEquals(0, getCommentsAvgPerUser);
        assertEquals(0, getPostsAvgPerUser);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificUserNumber100() {
        //Given
        List<String>listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add(WordGenerator.generateRandomWord());
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerUser= calculatorImpStatistics.getCommentsAvgPerUser();
        double getPostsAvgPerUser= calculatorImpStatistics.getPostsAvgPerUser();
        //Then
        assertEquals(0.4, getCommentsAvgPerUser);
        assertEquals(0.2, getPostsAvgPerUser);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificCommentsNumber0() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerUser= calculatorImpStatistics.getCommentsAvgPerUser();
        double getCommentsAvgPerPost= calculatorImpStatistics.getCommentsAvgPerPost();
        //Then
        assertEquals(0, getCommentsAvgPerUser);
        assertEquals(0, getCommentsAvgPerPost);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificCommentsLowerThanPosts() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerPost= calculatorImpStatistics.getCommentsAvgPerPost();
        //Then
        assertEquals(0.5, getCommentsAvgPerPost);
    }

    @Test
    void shouldCalculateAdvStatisticForSpecificCommentsHigherThanPosts() {
        //Given
        doReturn(1000).when(statisticsMock).commentsCount();
        doReturn(500).when(statisticsMock).postsCount();
        //When
        calculatorImpStatistics.calculateAdvStatistics(statisticsMock);
        double getCommentsAvgPerPost= calculatorImpStatistics.getCommentsAvgPerPost();
        //Then
        assertEquals(2, getCommentsAvgPerPost);
    }

}