 /*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
  */

 /**
  *
  * @author AL Masdar
  */
public class Student {
        private int id;
        private String name;
        private String major;

        public Student(int id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public Student() {
            this.id = 0;
            this.name = "";
            this.major = "";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMajor() {
            return major;
        }

        public void setMajor(String major) {
            this.major = major;
        }

      //  @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + ", major=" + major + '}';
        }



    }



