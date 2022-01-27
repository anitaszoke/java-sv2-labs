package interfacerules.interfacerulesdemo;

public class TrainerMain {

    public static void main(String[] args) {
        //csak a hasName metódusai hívhatók, a trainert "elfelejti"
        HasName hasName = new Trainer();
        hasName.getName();

        //csak a canWork metódusai hívhatók
        CanWork canWork = new Trainer();
        canWork.doWork();

        //ha a trainernek adom értékül, akkor eléri mindkét interface metódusát
        Trainer trainer = new Trainer();
        trainer.getName();
        trainer.doWork();




    }
}
