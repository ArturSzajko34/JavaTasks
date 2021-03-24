package meeting4.Task16;

import java.util.Optional;

public class Maine {
    public static void main(String[] args) {
        System.out.println(wrapToOptional(null).orElse("isNull"));
    }

    static Optional<String> wrapToOptional(String str) {
        return Optional.ofNullable(str);
    }
}
