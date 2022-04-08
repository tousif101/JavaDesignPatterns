package Factory;

class Person
{
    public int id;
    public String name;

    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.id + "\n");
        stringBuilder.append(this.name + "\n");
        return stringBuilder.toString();
    }


}

class PersonFactory
{
    int id = 0;
    public Person createPerson(String name)
    {
        id+=1;
        return new Person(id,name);
    }
}



class Demo {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        //Factory Takes care of the IDs of each person.
        Person person = personFactory.createPerson("Tousif");
        System.out.println(person);
        Person person2 = personFactory.createPerson("Shaila");
        System.out.println(person2);
    }
}