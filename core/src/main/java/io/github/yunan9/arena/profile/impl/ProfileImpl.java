package io.github.yunan9.arena.profile.impl;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import io.github.yunan9.arena.profile.Profile;
import io.github.yunan9.pointer.store.PointerStore;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class ProfileImpl implements Profile {

  private final PointerStore pointerStore;

  private final UUID id;

  private String name;

  private Locale locale;

  @AssistedInject
  public ProfileImpl(
      final @Assisted @NotNull UUID id,
      final @Assisted @NotNull String name,
      final @Assisted @NotNull Locale locale) {
    this.pointerStore = PointerStore.newConcurrentPointerStore();

    this.id = id;

    this.name = name;

    this.locale = locale;
  }

  @Override
  public @NotNull PointerStore getPointerStore() {
    return this.pointerStore;
  }

  @Override
  public @NotNull UUID getId() {
    return this.id;
  }

  @Override
  public @NotNull String getName() {
    return this.name;
  }

  @Override
  public void setName(final @NotNull String name) {
    this.name = name;
  }

  @Override
  public @NotNull Locale getLocale() {
    return this.locale;
  }

  @Override
  public void setLocale(final @NotNull Locale locale) {
    this.locale = locale;
  }
}
