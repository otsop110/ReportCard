package com.example.android.reportcard;

/**
 *
 */

public class Grades {

    // Name of the topic
    private String mTopic;

    // Student's grade
    private double mYourGrade;
    // Lowest grade attained by a student in the class
    private double mGradeMin;
    // Average grade attained by the class.
    private double mGradeAve;
    // Highest grade attained by a student in the class.
    private double mGradeMax;

    /*
     *   Create a new Grades object.
     *
     *   @param topic is the name of the topic.
     *   @param yourGrade is student's rate.
     *   @param classMin is the lowest grade of the students in a class.
     *   @param classAve is the average grade of the students in a class.
     *   @param classMax is the highest grade of the students in a class.
     *
     */

    public Grades(String topic, double yourGrade, double gradeMin, double gradeAve, double gradeMax) {
        mTopic = topic;
        mYourGrade = yourGrade;
        mGradeMin = gradeMin;
        mGradeAve = gradeAve;
        mGradeMax = gradeMax;
    }

    /**
     * Get the name of the topic.
     */
    public String getTopic() {
        return mTopic;
    }

    /**
     * Get student's grade.
     */
    public double getYourGrade() {
        return mYourGrade;
    }

    /**
     * Get the lowest grade in the class.
     */
    public double getGradeMin() {
        return mGradeMin;
    }
    /**
     * Get the average grade of the class.
     */
    public double getGradeAve() {
        return mGradeAve;
    }

    /**
     * Get the highest grade in the class.
     */
    public double getGradeMax() {
        return mGradeMax;
    }

}
