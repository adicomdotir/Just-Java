#include <iostream>
#include <string>
using namespace std;

void println(string);

class Person {

public:     
    Person(string name, int age) {
        cout << "Constructor" << endl;
        this->name = name;
        this->age = age;
    }

    ~Person() {
        println("Destructors");
    }
    
    string toString() {
        return "Person[ Name=" + name + ", Age=" + to_string(age) + " ]";
    }

    void setName(string name) {
        this->name = name;
    }

    void setAge(int age) {
        this->age = age;
    }

    string getName() {
        return this->name;
    }

    int getAge() {
        return this->age;
    }

private:
    string name;
    int age;
};

class Student : Person {
public: 
    Student(string name, int age, float grade) : Person(name, age) {
        println("Child Constructor");
    }

    void setGrade(float grade) {
        this->grade = grade;
    }

    float getGrade() {
        return this->grade;
    }

    string toString() {
        return Person::toString();
    }
private: 
    float grade;
};

int main() {
    Student *st = new Student("Ali", 16, 15);
}

void println(string message) {
    cout << message << endl;
}