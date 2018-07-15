package lessons.association;

import lessons.pass_params.Table;

public class Association {
    private Table name;

    public Association(Table name) {//aggregation
        this.name = name;
    }

    public Association() {
        name = new Table("Hello.txt");//composition
    }
}

class TestAssociation {
    public static void main(String[] args) {
       Table str = new Table("John");

       Association association = new Association(str);

       association = null;
    }
}
