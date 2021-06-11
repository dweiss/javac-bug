import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;

import java.lang.annotation.Retention;
import java.util.LinkedHashSet;

public class Repro {
  public static void main(String[] args) {
    LinkedHashSet<String> fieldSet =
        Guice.createInjector().getInstance(Key.get(new TypeLiteral<>() {}, Retention.class));
  }
}
