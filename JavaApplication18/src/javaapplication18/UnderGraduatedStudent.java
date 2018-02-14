/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author INT105
 */
public class UnderGraduatedStudent extends Student {
    private String project;

    public UnderGraduatedStudent() {
    }

    public UnderGraduatedStudent(long stdID, String stdName, String project) {
        super(stdID, stdName);
        this.project = project;
    }

    @Override
    public String toString() {
        return super.toString() + "UnderGraduatedStudent{" + "project=" + project + '}';
    }
    
    
}
