package com.ExamProctor_Online_Exam_Review_System;

import java.util.HashMap;

class ExamProctor {

    // Stack for navigation
    static class Stack {
        int[] stack;
        int top = -1;

        Stack(int size) {
            stack = new int[size];
        }

        void push(int qid) {
            stack[++top] = qid;
        }

        int pop() {
            if (top == -1) return -1;
            return stack[top--];
        }
    }

    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    void answerQuestion(int qid, String answer) {
        answers.put(qid, answer);
    }

    int evaluate() {
        int score = 0;
        for (int qid : answers.keySet()) {
            if (answers.get(qid).equals(correctAnswers.get(qid))) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        ExamProctor ep = new ExamProctor();
        Stack nav = new Stack(5);

        ep.correctAnswers.put(1, "A");
        ep.correctAnswers.put(2, "B");

        nav.push(1);
        ep.answerQuestion(1, "A");

        nav.push(2);
        ep.answerQuestion(2, "C");

        System.out.println("Final Score: " + ep.evaluate());
    }
}

