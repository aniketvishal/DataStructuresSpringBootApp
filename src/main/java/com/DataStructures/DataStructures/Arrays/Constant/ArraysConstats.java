package com.DataStructures.DataStructures.Arrays.Constant;

public class ArraysConstats {
    public enum ArrayConstantEnum{
        ENTER_ARRAY_SIZE("Enter the size of array :"),
        ENTER_ELEMENTS_IN_ARRAY("Enter the values in array :");

        private String type;
        ArrayConstantEnum(String type){
            this.type=type;
        }  // by default enum constructor is private

        /**
         * Why Enum Class Can Have a Private Constructor Only in Java?
         *
         *
         * enum Size {
         *  SMALL("The size is small."),
         *  MEDIUM("The size is medium."),
         *  LARGE("The size is large."),
         *  EXTRALARGE("The size is extra large.");
         *
         *  private final String pizzaSize;
         *  // private enum constructor
         *  private Size(String pizzaSize) {
         *     this.pizzaSize = pizzaSize;
         *  }
         *
         *  public String getSize() {
         *     return pizzaSize;
         *  }
         * }
         *
         *
         * Why can’t we have a public enum constructor?
         *
         * We need the enum constructor to be private because enums define a finite set of values (SMALL, MEDIUM, LARGE).
         * If the constructor was public, people could potentially create more value.
         * (for example, invalid/undeclared values such as ANYSIZE, YOURSIZE, etc.).
         *
         * Enum in Java contains fixed constant values. So, there is no reason in having a public or protected constructor as you cannot create an enum instance.
         * Also, note that the internally enum is converted to class. As we can’t create enum objects explicitly,
         * hence we can’t call the enum constructor directly.
         *
         */

    }
}
