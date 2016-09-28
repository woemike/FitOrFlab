package model;

/**
 * Created by Devslopes on 4/29/16.
 */
public class Exercise {

    private String exerciseName;
    private String exerciseSubtitle;

    public String getExerciseName() {
        return exerciseName;
    }

    public String getExerciseSubtitle() {
        return exerciseSubtitle;
    }

    public ExerciseType getCurrentExercise() {
        return currentExercise;
    }

    public enum ExerciseType {
        Weights, Yoga, Cardio
    }

    private ExerciseType currentExercise;

    public Exercise(ExerciseType exercise, String name, String subtitle) {
        this.currentExercise = exercise;
        this.exerciseName = name;
        this.exerciseSubtitle = subtitle;
    }



}
