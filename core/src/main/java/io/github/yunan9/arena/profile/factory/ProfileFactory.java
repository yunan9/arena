package io.github.yunan9.arena.profile.factory;

import static org.jetbrains.annotations.ApiStatus.*;

import io.github.yunan9.arena.profile.Profile;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

@NonExtendable
@Internal
@FunctionalInterface
public interface ProfileFactory {

  @NotNull
  Profile createProfile(
      final @NotNull UUID id, final @NotNull String name, final @NotNull Locale locale);
}
