package org.example;

public class Engine {
    private long type;
    private String optionField;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Engine other = (Engine) obj;

        if(type != other.type) {
            return false;
        }
        if(optionField == null) {
            if (other.optionField != null) {
                return false;
            }
        } else if (!optionField.equals(other.optionField)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (int) (type ^ (type >>> 32));
        return 31 * result + ((optionField == null) ? 0 : optionField.hashCode());
    }
}
