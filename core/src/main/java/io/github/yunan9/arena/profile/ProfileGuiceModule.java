package io.github.yunan9.arena.profile;

import com.google.inject.AbstractModule;
import com.google.inject.Module;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import io.github.yunan9.arena.profile.factory.ProfileFactory;
import io.github.yunan9.arena.profile.impl.ProfileImpl;
import io.github.yunan9.arena.profile.impl.ProfileServiceImpl;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class ProfileGuiceModule extends AbstractModule {

  private static final Module FACTORY_MODULE =
      new FactoryModuleBuilder()
          .implement(Profile.class, ProfileImpl.class)
          .build(ProfileFactory.class);

  @Override
  protected void configure() {
    this.install(FACTORY_MODULE);

    this.bind(ProfileService.class).to(ProfileServiceImpl.class);
  }
}
