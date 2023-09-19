public class Person {
    private String FullName;
    private Gender Gender;
    private Integer Age;
    private Citys Citys;


    public Person(String fullName, Gender gender, Integer age, Citys citys) {
        this.FullName = fullName;
        this.Gender = gender;
        this.Age = age;
        this.Citys = citys;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Gender getGender() {
        return Gender;
    }

    public void setGender(Gender gender) {
        this.Gender = gender;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Citys getCitys() {
        return Citys;
    }

    public void setCitys(Citys citys) {
        this.Citys = citys;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FullName='" + FullName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", citys=" + Citys +
                '}';
    }
}
