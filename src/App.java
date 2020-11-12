public class App {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("-----------------------");
        context.process();
        System.out.println("-----------------------");
        context.setStrategy(new StrategyImpl1());
        context.process();
        System.out.println("-----------------------");
        context.setStrategy(new StrategyImpl2());
        context.process();
        System.out.println("-----------------------");
        context.setStrategy(new StrategyImpl3());
        context.process();

    }
}
