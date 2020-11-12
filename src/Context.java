public class Context {
    private  IStrategy strategy;
    public Context() {
        this.strategy= new DefaultStrategyImpl();
    }
    public void process() {
        System.out.println("Etape 1 de l'algo");
        strategy.applyStrategy();
        System.out.println("version finale de l'algo");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
