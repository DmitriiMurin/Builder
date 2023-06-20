package person;

public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String city;

    public PersonBuilder setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("Нужно ИМЯ");
        }
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        if (surname == null){
            throw new IllegalArgumentException("Нужна фамилия");
        }
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if(age < 0){
            throw  new IllegalArgumentException("Возраст не может быть меньше нуля");
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("НЕТ ДАННЫХ");
        } else {
            Person p = new Person(name, surname , age);
            p.setCity(city);
            return p;
        }
    }
}