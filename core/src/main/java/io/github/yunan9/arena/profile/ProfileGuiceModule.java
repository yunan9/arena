package io.github.yunan9.arena.profile;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import io.github.yunan9.arena.profile.factory.ProfileFactory;
import io.github.yunan9.arena.profile.impl.ProfileImpl;
import io.github.yunan9.arena.profile.impl.ProfileServiceImpl;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class ProfileGuiceModule extends AbstractModule {

  @Override
  protected void configure() {
    this.install(new FactoryModuleBuilder()
            .implement(Profile.class, ProfileImpl.class)
            .build(ProfileFactory.class));

    this.bind(ProfileService.class).to(ProfileServiceImpl.class);
  }
}
