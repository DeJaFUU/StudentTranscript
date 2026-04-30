package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranscriptTest {

    private Transcript testTranscript;
    private Transcript testBadStudent;
    private Transcript testGoodStudent;
    private Transcript testEmptyStudent;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Student Name", 1000);
        testTranscript.addCourseList("Course");
        testTranscript.addGradeList(2.5);
        //TODO: write new values in testTranscript constructor
        testBadStudent = new Transcript("Bad Student", 7331);
        testBadStudent.addCourseList("TEST-101");
        testBadStudent.addGradeList(2.0);
        testBadStudent.addCourseList("TSET-102");
        testBadStudent.addGradeList(1.9);

        testGoodStudent = new Transcript("Cum Laude", 1337);
        testGoodStudent.addCourseList("TEST-101");
        testGoodStudent.addGradeList(4.0);
        testGoodStudent.addCourseList("TSET-102");
        testGoodStudent.addGradeList(3.9);

        testEmptyStudent = new Transcript("Absent Person", 666);
    }

    @Test
    public void testTemplate(){
        //TODO: write tests for name method
        assertEquals("Student Name", testTranscript.getStudentName());
        assertEquals("Bad Student", testBadStudent.getStudentName());
        assertEquals("Cum Laude", testGoodStudent.getStudentName());

        //TODO write getGPA initial method.
        assertEquals(2.5, testTranscript.getGPA());
        assertEquals(0.0, testEmptyStudent.getGPA());

        // TODO: Write test for addGrade method
        assertTrue(testBadStudent.addCourseList("TEST-103"));
        assertTrue(testBadStudent.addGradeList(2.1));

        assertTrue(testGoodStudent.addCourseList("TEST-103"));
        assertTrue(testGoodStudent.addGradeList(3.8));

        assertTrue(testEmptyStudent.addCourseList("TEST-101"));
        assertTrue(testEmptyStudent.addGradeList(3.0));

        assertFalse(testEmptyStudent.addCourseList(""));
        assertFalse(testEmptyStudent.addGradeList(4.1));

        assertFalse(testEmptyStudent.addCourseList(""));
        assertFalse(testEmptyStudent.addGradeList(0.0));


        // TODO write test for getGPA method;
        assertEquals(3.0, testEmptyStudent.getGPA());
        assertEquals(2.1, testBadStudent.getGPA());
        assertEquals(3.9, testGoodStudent.getGPA());
    }
}