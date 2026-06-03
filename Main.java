public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length != 3) {
            System.out.println(
            """
                Use this input format:
                compress <input> <output>
                decompress <input> <output>
            """
            );

            return;
        }

        switch (args[0]) {
            case "compress":
                new Encoder().compress(args[1],args[2]);
                break;

            case "decompress":
                new Decoder().decompress(args[1],args[2]);
                break;

            default:
                System.out.println("Unknown command");
        }
    }
}