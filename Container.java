public class Container {

    // 1. public - доступен везде.
    public class PublicInternalClass {
        public void display() {
            System.out.println("Public: доступен из любого места.");
        }
    }

    // 2. protected - доступен в пакете и наследникам.
    protected class ProtectedInternalClass {
        public void display() {
            System.out.println("Protected: доступен в пакете и подклассам.");
        }
    }

    // 3. package-private - доступен только в текущем пакете.
    class PackagePrivateInternalClass {
        public void display() {
            System.out.println("Default: доступен только в этом пакете.");
        }
    }

    // 4. private - доступен только внутри внешнего класса Container.
    private class PrivateInternalClass {
        public void display() {
            System.out.println("Private: доступен только внутри Container.");
        }
    }

    public void checkInternalAccess() {
        // Внутри внешнего класса видны все модификаторы
        new PublicInternalClass().display();
        new ProtectedInternalClass().display();
        new PackagePrivateInternalClass().display();
        new PrivateInternalClass().display();
    }
}
