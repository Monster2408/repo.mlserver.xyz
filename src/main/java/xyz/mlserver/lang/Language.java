package xyz.mlserver.lang;

public enum Language {
    ENGLISH("ENGLISH", "english"),
    JAPANESE("日本語", "japanese") {
        @Override
        public String toString() {
            return name().toUpperCase();
        }
    };
    private String name, id;
    Language(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }
}