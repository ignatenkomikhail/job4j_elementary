package ru.job4j.collection;

import java.util.Objects;

public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + this.name + ", " + this.priority + '}';
    }

    @Override
    public int compareTo(Job another) {
        return Integer.compare(this.priority, another.getPriority());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return this.getPriority() == job.getPriority()
                && Objects.equals(this.getName(), job.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getPriority());
    }
}
