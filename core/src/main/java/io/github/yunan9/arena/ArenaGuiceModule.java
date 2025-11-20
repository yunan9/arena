package io.github.yunan9.arena;

import com.google.inject.AbstractModule;
import io.github.yunan9.arena.profile.ProfileGuiceModule;

public final class ArenaGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    this.install(new ProfileGuiceModule());
  }
}
