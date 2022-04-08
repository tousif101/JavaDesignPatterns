package com.company;

import java.util.ArrayList;
import java.util.List;

class CodeBuilder
{
    private final String className;
    private  final List<String> type;
    private final List<String> fields;
    public CodeBuilder(String className)
    {
        this.className = className;
        this.type = new ArrayList<>();
        this.fields = new ArrayList<>();
    }

    public CodeBuilder addField(String name, String type)
    {
        this.fields.add(name);
        this.type.add(type);
        return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("public class " + this.className + "{" + "\n");

        for(int i = 0; i<this.fields.size();i++){
            sb.append("     public " + this.type.get(i) + " " + this.fields.get(i) + ";" + "\n");
        }

        sb.append("}");

        return sb.toString();
    }
}

class Demo {
    public static void main(String[] args) {
        CodeBuilder sb = new CodeBuilder("Person");
        sb.addField("age","int");
        sb.addField("name","String");
        System.out.println(sb);
    }
}
