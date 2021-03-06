package enumabstract.demo;

public enum TransactionState implements  HasTransactionState {
    PENDING {
        @Override
        public boolean isCompleted() {
            return false;
        }
    }, SUCCESS{
        @Override
        public boolean isCompleted() {
            return true;
        }
    }, REJECTED {
        @Override
        public boolean isCompleted() {
            return true;
        }
    };

    public abstract boolean isCompleted();
}
