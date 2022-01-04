package statemachine.typewriter;

public enum TypeWriterState {

    UPPER {
        TypeWriterState next() {
            return TypeWriterState.LOWER;
        }
    },

    LOWER {
        TypeWriterState next() {
            return TypeWriterState.UPPER;
        }
    };

    abstract TypeWriterState next();
}
