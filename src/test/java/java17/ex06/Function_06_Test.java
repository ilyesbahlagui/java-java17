package java17.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme  (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
        // TODO
    	
        return "[age="+supplier.get().getAge()+"]" ;
    }
    // end::formatAge[]

//    new Person("John", "France", 25, "johndoe");
    @Test
    public void test_supplier_formatAge() throws Exception {
        // TODO compléter le test unitaire pour qu'il soit passant
    	 Supplier<Person> supplier = () -> new Person("John", "France", 35, "johndoe");
        String result = formatAge(supplier);

        assert result.equals("[age=35]");
    }

}
