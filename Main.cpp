#include <iostream>
#include <string>
using namespace std;

class Person {
    public:     
    Person(string name, int age) {
        std::cout << "Constructor" << endl;
        this->name = name;
        this->age = age;
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
    std::string name;
    int age;
};

int main() {
    Person p = Person("Ali", 33);

    Person *ptr = new Person("Haassan", 18);
    ptr->setName("Hassan");
    
    cout << p.toString() << endl << ptr->toString();
    delete ptr;
}