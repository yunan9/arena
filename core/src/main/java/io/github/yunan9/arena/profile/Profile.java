package io.github.yunan9.arena.profile;

import static io.github.yunan9.pointer.key.PointerKey.*;

import io.github.yunan9.pointer.key.PointerKey;
import io.github.yunan9.pointer.store.PointerStore;
import java.util.Locale;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface Profile extends PointerStore.Holder {

  PointerKey<UUID> UUID_POINTER_KEY = newPointerKey("uuid", UUID.class);
  PointerKey<String> NAME_POINTER_KEY = newPointerKey("name", String.class);
  PointerKey<Locale> LOCALE_POINTER_KEY = newPointerKey("locale", Locale.class);

  @Override
  @NotNull
  PointerStore getPointerStore();
}
