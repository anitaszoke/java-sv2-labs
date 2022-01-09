package polymorphism.architect;

public class ConstructionPlan extends PermitPlan {
    private int sheetOfConstructionDrawings;

    public ConstructionPlan(int pagesOfDocumentation, String title, String nameOfClient, String addressOfBuilding, int sheetOfConstructionDrawings) {
        super(pagesOfDocumentation, title, nameOfClient, addressOfBuilding);
        this.sheetOfConstructionDrawings = sheetOfConstructionDrawings;
    }

    public int getSheetOfConstructionDrawings() {
        return sheetOfConstructionDrawings;
    }
}
