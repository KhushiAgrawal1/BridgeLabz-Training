package com.annotations;

public class DeprecatedDemo {

    // Legacy API class
    static class LegacyAPI {

        // Old method marked as deprecated
        @Deprecated
        public void oldFeature() {
            System.out.println("This is the OLD feature. Avoid using it!");
        }

        // New recommended method
        public void newFeature() {
            System.out.println("This is the NEW feature. Use this instead!");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        // Call old method (should give compiler warning)
        api.oldFeature();

        // Call new method
        api.newFeature();
    }
}

