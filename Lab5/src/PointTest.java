/*********************************************************************
 *  PointTest Tester                                                 *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/2/23                                                    *
 *  REQUIREMENT: Lab 5                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the point tester, tester for point      *
 *  object, tests methods within the point object.                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class PointTest {
    // Create test object references
    private Point p;
    private Point q;

    @Before
    public void setUp() throws Exception {
// Instantiate test objects
        p = new Point(4, 5);
        q = new Point(13, 14);
    }

    // Test class methods
    @Test
    public void testGetX() throws Exception {
        assertEquals(4, p.getX());
        assertEquals(13, q.getX());
    }

    @Test
    public void testGetY() throws Exception {
        assertEquals(5, p.getY());
        assertEquals(14, q.getY());
    }

    @Test
    public void testSetX() throws Exception {
        p.setX(55);
        assertEquals(55, p.getX());
        q.setX(101);
        assertEquals(101, q.getX());
    }

    @Test
    public void testSetY() throws Exception {
        p.setY(1331);
        assertEquals(1331, p.getY());
        q.setY(90125);
        assertEquals(90125, q.getY());
    }

    @Test
    public void testDistanceFromOrigin() throws Exception{
        assertEquals(6.4,p.distanceFromOrigin(),.1);
        assertEquals(19.1,q.distanceFromOrigin(),.1);
    }
}