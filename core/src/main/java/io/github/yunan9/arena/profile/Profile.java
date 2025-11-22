package io.github.yunan9.arena.profile;

import io.github.yunan9.commons.id.Identifiable;
import io.github.yunan9.commons.l10n.impl.MutableLocalizable;
import io.github.yunan9.commons.name.impl.MutableNameable;
import io.github.yunan9.pointer.key.PointerKey;
import io.github.yunan9.pointer.store.PointerStore;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface Profile
    extends PointerStore.Holder,
        Identifiable<@NotNull UUID>,
        MutableNameable<@NotNull String>,
        MutableLocalizable {

  PointerKey<UUID> UUID_POINTER_KEY = PointerKey.newPointerKey("uuid", UUID.class);
  PointerKey<String> NAME_POINTER_KEY = PointerKey.newPointerKey("name", String.class);
  PointerKey<Locale> LOCALE_POINTER_KEY = PointerKey.newPointerKey("locale", Locale.class);

  @Override
  @NotNull
  PointerStore getPointerStore();

  @Override
  @NotNull
  UUID getId();

  @Override
  @NotNull
  String getName();

  @Override
  void setName(final @NotNull String name);

  @Override
  @NotNull
  Locale getLocale();

  @Override
  void setLocale(final @NotNull Locale locale);
}
