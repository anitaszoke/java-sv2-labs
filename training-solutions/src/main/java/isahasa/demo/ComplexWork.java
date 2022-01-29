package isahasa.demo;

import java.util.List;

public class ComplexWork implements Work {

//    önmaga is hivatkozást tartaémaz más work példányokra
//    ha több workot szeretnénk, akkor így oldható meg

    private List<Work> works;

    public ComplexWork(List<Work> works) {
        this.works = works;
    }

    @Override
    public String complete() {
        StringBuilder result = new StringBuilder();
        for (Work work : works) {
            if (!result.toString().equals("")) {
                result.append(", ");
            }
            result.append(work.complete());
        }
        return result.toString();
    }
}
