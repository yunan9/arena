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

  @AssistedInject
  public ProfileImpl(
      final @Assisted @NotNull UUID id,
      final @Assisted @NotNull String name,
      final @Assisted @NotNull Locale locale) {
    this.pointerStore = PointerStore.newConcurrentPointerStore();

    this.pointerStore.registerPointer(UUID_POINTER_KEY, id);
    this.pointerStore.registerPointer(NAME_POINTER_KEY, name);
    this.pointerStore.registerPointer(LOCALE_POINTER_KEY, locale);
  }

  @Override
  public @NotNull PointerStore getPointerStore() {
    return this.pointerStore;
  }
}
