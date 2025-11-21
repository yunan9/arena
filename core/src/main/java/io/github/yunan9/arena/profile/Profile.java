package io.github.yunan9.arena.profile;

import io.github.yunan9.commons.id.Identifiable;
import io.github.yunan9.commons.l10n.impl.MutableLocalizable;
import io.github.yunan9.commons.name.impl.MutableNameable;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface Profile
    extends Identifiable<@NotNull UUID>, MutableNameable<@NotNull String>, MutableLocalizable {

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
