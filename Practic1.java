public class Practic1 {
    public static void main(String[] args) {
        Container wrapper = new Container();

        // Public работает всегда
        Container.PublicInternalClass pubObj = wrapper.new PublicInternalClass();
        pubObj.display();

        // Protected работает, при назождении в том же пакете
        Container.ProtectedInternalClass protObj = wrapper.new ProtectedInternalClass();
        protObj.display();

        // Package-private работает, при назождении в том же пакете
        Container.PackagePrivateInternalClass pkgObj = wrapper.new PackagePrivateInternalClass();
        pkgObj.display();

        // Для private ошибка компиляции
        // Container.PrivateInternalClass privObj = wrapper.new PrivateInternalClass();

        wrapper.checkInternalAccess();
    }
}
