package yearSchool;

import java.awt.Point;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Year year2022 = new Year();
		year2022.number = 2022;

		Year year2023 = new Year();
		year2023.number = 2023;

		Year[] years = { year2022, year2023 };

		Semester semesterOne22 = new Semester();
		semesterOne22.id = 221;
		semesterOne22.name = "HK 1 2022";
		semesterOne22.year = year2022;
		semesterOne22.multiplication = 1;

		Semester semesterTwo22 = new Semester();
		semesterTwo22.id = 222;
		semesterTwo22.name = "HK 2 2022";
		semesterTwo22.year = year2022;
		semesterTwo22.multiplication = 2;

		Semester semesterOne23 = new Semester();
		semesterOne23.id = 221;
		semesterOne23.name = "HK 1 2023";
		semesterOne23.year = year2023;
		semesterOne23.multiplication = 1;

		Semester[] semesters = { semesterOne22, semesterTwo22, semesterOne23 };

		Teacher alex = new Teacher();
		alex.id = 12;
		alex.name = " Alex Chen";

		Teacher tony = new Teacher();
		tony.id = 13;
		tony.name = " Tony Mike";

		Teacher[] teachers = { alex, tony };

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Room 1 Building A";

		Room room2 = new Room();
		room2.id = 1;
		room2.name = "Room 2 Building A";

		Room[] rooms = { room1, room2 };

		Clazz class10A = new Clazz();
		class10A.id = 1;
		class10A.name = "10A";
		class10A.room = room1;
		class10A.primaryTeacher = alex;

		Clazz class10B = new Clazz();
		class10B.id = 1;
		class10B.name = "10B";
		class10B.room = room1;
		class10B.primaryTeacher = tony;

		Clazz[] clazzes = { class10A, class10B };

		Subject math = new Subject();
		math.id = 2;
		math.name = "Math";
		math.subjectMultiplcation = 2;

		Subject history = new Subject();
		history.id = 4;
		history.name = "History";
		history.subjectMultiplcation = 1;

		Subject[] subjects = { math, history };

		Student mayLiam = new Student();
		mayLiam.clazz = class10A;
		mayLiam.id = 12345;
		mayLiam.name = " May Liam";

		Student annNial = new Student();
		annNial.clazz = class10A;
		annNial.id = 12395;
		annNial.name = " Ann Nial";

		Student[] students = { mayLiam, annNial };

		Examination oralMath1 = new Examination();
		oralMath1.id = 234;
		oralMath1.name = "Kiem Tra Mieng Mon Toan Hoc Ki 1 Nam 2022";
		oralMath1.semester = semesterOne22;
		oralMath1.subject = math;
		oralMath1.examMultiplication = 1;

		Examination finalMath1 = new Examination();
		finalMath1.id = 5234;
		finalMath1.name = "Kiem Tra Cuoi Ki Mon Toan Hoc Ki 1 Nam 2022";
		finalMath1.semester = semesterOne22;
		finalMath1.subject = math;
		finalMath1.examMultiplication = 2;

		Examination finalHistory1 = new Examination();
		finalHistory1.id = 51234;
		finalHistory1.name = "Kiem Tra Cuoi Ki Mon Lich Su Hoc Ki 1 Nam 2022";
		finalHistory1.semester = semesterOne22;
		finalHistory1.subject = history;
		finalHistory1.examMultiplication = 2;

		Examination oralMath2 = new Examination();
		oralMath2.id = 2341;
		oralMath2.name = "Kiem Tra Mieng Mon Toan Hoc Ki 2 Nam 2022";
		oralMath2.semester = semesterTwo22;
		oralMath2.subject = math;
		oralMath2.examMultiplication = 1;

		Examination finalMath2 = new Examination();
		finalMath2.id = 52324;
		finalMath2.name = "Kiem Tra Cuoi Ki Mon Toan Hoc Ki 2 Nam 2022";
		finalMath2.semester = semesterTwo22;
		finalMath2.subject = math;
		finalMath2.examMultiplication = 2;

		Examination finalHistory2 = new Examination();
		finalHistory2.id = 5124;
		finalHistory2.name = "Kiem Tra Cuoi Ki Mon Lich Su Hoc Ki 2 Nam 2022";
		finalHistory2.semester = semesterTwo22;
		finalHistory2.subject = history;
		finalHistory2.examMultiplication = 2;

		Examination[] examinations = { oralMath1, finalMath1, finalHistory1, oralMath2, finalMath2, finalHistory2 };

		ExamResult annNialOralMath1 = new ExamResult();
		annNialOralMath1.examination = oralMath1;
		annNialOralMath1.student = annNial;
		annNialOralMath1.point = 8.5;

		ExamResult annNialFinalMath1 = new ExamResult();
		annNialFinalMath1.examination = finalMath1;
		annNialFinalMath1.student = annNial;
		annNialFinalMath1.point = 7.0;

		ExamResult annNialFinalHistory1 = new ExamResult();
		annNialFinalHistory1.examination = finalHistory1;
		annNialFinalHistory1.student = annNial;
		annNialFinalHistory1.point = 8.5;

		ExamResult annNialOralMath2 = new ExamResult();
		annNialOralMath2.examination = oralMath2;
		annNialOralMath2.student = annNial;
		annNialOralMath2.point = 5;

		ExamResult annNialFinalMath2 = new ExamResult();
		annNialFinalMath2.examination = finalMath2;
		annNialFinalMath2.student = annNial;
		annNialFinalMath2.point = 6.0;

		ExamResult annNialFinalHistory2 = new ExamResult();
		annNialFinalHistory2.examination = finalHistory2;
		annNialFinalHistory2.student = annNial;
		annNialFinalHistory2.point = 9.5;

		ExamResult[] examResults = { annNialOralMath1, annNialFinalMath1, annNialFinalHistory1, annNialOralMath2,
				annNialFinalMath2, annNialFinalHistory2 };

		for (Student student : students) {
			System.out.println("Student name: " + student.name);
			System.out.println("Class: " + student.clazz.name);
			System.out.println("Primary Teacher: " + student.clazz.primaryTeacher.name);

			for (Year year : years) {
				System.out.println("Year:" + year.number);
				double yearAveargePoint = 0;
				double yearTotalPoint = 0;
				int yearTotalMultiplication = 0;

				for (Semester semester : semesters) {
					double semesterAveargePoint = 0;
					double semesterTotalPoint = 0;
					int semesterTotalMultiplication = 0;

					if (year.number == semester.year.number) {
						System.out.println("Hoc ki: " + semester.name);

						for (Subject subject : subjects) {
							System.out.println("Mon hoc: " + subject.name);
							double sumPoints = 0.0;
							int sumMultiplcation = 0;
							double averagePointsInSemester;

							for (Examination exam : examinations) {
								if (exam.semester.id == semester.id && exam.subject.id == subject.id) {
									System.out.println("Exam: " + exam.name);
									sumMultiplcation += exam.examMultiplication;

									for (ExamResult point : examResults) {
										if (point.examination.id == exam.id && point.student.id == student.id) {
											System.out.println("Point: " + point.point);
											sumPoints += (point.point * point.examination.examMultiplication);
										}
									}

								}
							}
							averagePointsInSemester = sumPoints / sumMultiplcation;
							System.out.println("Diem trung binh mon " + subject.name + ": " + averagePointsInSemester);

							semesterTotalMultiplication += sumMultiplcation;
							semesterTotalPoint += sumPoints;
						}
					}
					semesterAveargePoint = semesterTotalPoint / semesterTotalMultiplication;
					System.out.println("Diem trung binh hoc ki: " + semesterAveargePoint);
					yearTotalPoint += semesterTotalPoint;
					yearTotalMultiplication += semesterTotalMultiplication;
					
				}
				yearAveargePoint = yearTotalPoint / yearTotalMultiplication;
				System.out.println("Diem trung binh nam: " + yearAveargePoint);
			}
			System.out.println("-------------------");
		}
	}

}
