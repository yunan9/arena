package io.github.yunan9.arena.profile.factory;

import io.github.yunan9.arena.profile.Profile;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.UUID;

@ApiStatus.NonExtendable
@ApiStatus.Internal
@FunctionalInterface
public interface ProfileFactory {

  @NotNull
  Profile createProfile(
      final @NotNull UUID id, final @NotNull String name, final @NotNull Locale locale);
}
