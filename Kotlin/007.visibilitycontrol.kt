fun main(args: Array<String>) {
    
}

class PrivateClass {
    // Only for inner
    private x: Int;
}

class ProtectedClass {
    // Only for subclass
    protected x: Int;
}

class InternalClass {
    // Only for package
    internal x: Int;
}

class PublicClass {
    // For all
    public x: Int;
}