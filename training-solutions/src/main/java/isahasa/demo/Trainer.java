package isahasa.demo;

public class Trainer {

// öröklődés, mivel nincs töbszörös öröklődés, 3. osztály kellene
// de akkor kód ismétlések vannak + futásidőben változás lehet
//    leszármazással nem lehet, mert fordítási időben dől el

//    erre megoldás a kompozíció:
//    egyszerűbb, futásidőben változhat


//    work és a trainer között kompozíció van, ugyanis a trainer tartalmaz egy hivatkozást a Work-re (private Work work),
//    de nem konkrét implementációra tartalmaz hivatkozást, hanem csak az interfacera magára
    private Work work;

    public Trainer(Work work) {
        this.work = work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

//  delegálás: a dowork funkciót nem önmaga implemetálja, hanem a hívást tovább dobja a work-re
    public String doWork(){
        return work.complete();
    }
}
