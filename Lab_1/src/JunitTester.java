/*********************************************************************
 *  Junit Tester                                                     *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/23/23                                                   *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a tester for the game           *
 *  functionality methods introduced in assigment 5. Each method     *
 *  created in either dice or hand is seen in this junit test.       *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class JunitTester {
    private Dice p;
    private Hand q;
    private Hand s;
    @Before
    public void setUp() throws Exception{
        p = new Dice(6,5);
        q = new Hand(5);
        s = new Hand(2);
    }
    @Test
    public void testCount() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,4,1051);
        p.setCurrentValue(4,4,1051);
        assertEquals(5,p.count(4));
    }
    @Test
    public void testHas3Kind() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051 );
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,3,1051);
        assertTrue(p.has3kind());
    }
    @Test
    public void testSum() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,3,1051);
        assertEquals(18,p.sum());
    }
    @Test
    public void testScore3Kind() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,2,1051);
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,3,1051);
        assertEquals(0,p.score3kind());
    }
    @Test
    public void testHas4Kind() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,4,1051);
        p.setCurrentValue(4,3,1051);
        assertTrue(p.has4kind());
    }
    @Test
    public void testScore4Kind() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,3,1051);
        assertEquals(0,p.score4kind());
    }
    @Test
    public void testHasYahtzee() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,4,1051);
        p.setCurrentValue(4,4,1051);
        assertTrue(p.hasYahtzee());
    }
    @Test
    public void testsScoreYahtzee() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,4,1051);
        p.setCurrentValue(4,4,1051);
        assertEquals(50,p.scoreYahtzee());
    }
    @Test
    public void testHasSmallStraight() throws Exception{
        p.setCurrentValue(0,4,1051);
        p.setCurrentValue(1,3,1051);
        p.setCurrentValue(2,2,1051);
        p.setCurrentValue(3,1,1051);
        p.setCurrentValue(4,3,1051);
        assertTrue(p.hasSmallStraight());
    }
    @Test
    public void testScoreSmallStraight() throws Exception{
        p.setCurrentValue(0,1,1051);
        p.setCurrentValue(1,2,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,3,1051);
        assertEquals(35,p.scoreSmallStraight());
    }
    @Test
    public void testHasLargeStraight() throws Exception{
        p.setCurrentValue(0,3,1051);
        p.setCurrentValue(1,4,1051);
        p.setCurrentValue(2,2,1051);
        p.setCurrentValue(3,1,1051);
        p.setCurrentValue(4,5,1051);
        assertTrue(p.hasLargeStraight());
    }
    @Test
    public void testScoreLargeStraight() throws Exception{
        p.setCurrentValue(0,6,1051);
        p.setCurrentValue(1,5,1051);
        p.setCurrentValue(2,4,1051);
        p.setCurrentValue(3,3,1051);
        p.setCurrentValue(4,2,1051);
        assertEquals(45,p.scoreLargeStraight());
    }
    @Test
    public void testCountRank() throws Exception{
        q.setRank(0,2,2048);
        q.setRank(1,1,2048);
        q.setRank(2,9,2048);
        q.setRank(3,1,2048);
        q.setRank(4,4,2048);
        q.setSuit(0,'D',2048);
        q.setSuit(1,'D',2048);
        q.setSuit(2,'D',2048);
        q.setSuit(3,'D',2048);
        q.setSuit(4,'C',2048);
        assertEquals(2,q.countRank(1));
    }
    @Test
    public void testCountSuit() throws Exception{
        q.setRank(0,2,2048);
        q.setRank(1,1,2048);
        q.setRank(2,9,2048);
        q.setRank(3,1,2048);
        q.setRank(4,4,2048);
        q.setSuit(0,'D',2048);
        q.setSuit(1,'D',2048);
        q.setSuit(2,'D',2048);
        q.setSuit(3,'D',2048);
        q.setSuit(4,'C',2048);
        assertEquals(4,q.countSuit('D'));
    }
    @Test
    public void testCurrentSum() throws Exception{
        q.setRank(0,2,2048);
        q.setRank(1,1,2048);
        q.setRank(2,9,2048);
        q.setRank(3,1,2048);
        q.setRank(4,4,2048);
        q.setSuit(0,'D',2048);
        q.setSuit(1,'D',2048);
        q.setSuit(2,'D',2048);
        q.setSuit(3,'D',2048);
        q.setSuit(4,'C',2048);
        assertEquals(17,q.currentSum());
    }
    @Test
    public void testBust() throws Exception{
        s.setRank(0,12,2048);
        s.setRank(1,10,2048);
        s.setSuit(0,'D',2048);
        s.setSuit(1,'S',2048);
        assertTrue(s.bust());
    }
    @Test
    public void testFlush() throws Exception{
        q.setRank(0,2,2048);
        q.setRank(1,1,2048);
        q.setRank(2,9,2048);
        q.setRank(3,1,2048);
        q.setRank(4,4,2048);
        q.setSuit(0,'D',2048);
        q.setSuit(1,'D',2048);
        q.setSuit(2,'D',2048);
        q.setSuit(3,'D',2048);
        q.setSuit(4,'D',2048);
        assertTrue(q.hasFlush());
    }


}
